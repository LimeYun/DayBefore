package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hong.daybefore.domain.UserAuth;
import com.hong.daybefore.domain.Users;
import com.hong.daybefore.mapper.UserMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public List<Users> list() throws Exception {
        return userMapper.list();
    }

    @Override
    public Users selectId(String id) throws Exception {
        return userMapper.selectId(id);
    }

    // 회원가입
    @Override
    @Transactional
    public int insert(Users entity) throws Exception {
        String password = entity.getPassword();

        String encodePassword = passwordEncoder.encode(password);
        entity.setPassword(encodePassword);
        int result = userMapper.insert(entity);

        Long userId = entity.getUserId();

        if (result > 0) {
            UserAuth userAuth = new UserAuth();
            userAuth.setUserId(userId);
            userAuth.setAuth("ROLE_USER");
            result = userMapper.insertAuth(userAuth);
        }

        return result;
    }

    @Override
    public int update(Users entity) throws Exception {
        return userMapper.update(entity);
    }

    @Override
    public int delete(Long id) throws Exception {
        return userMapper.delete(id);
    }

    // 로그인
    @Override
    public boolean login(Users user, HttpServletRequest request) throws Exception {

        String username = user.getId();
        String password = user.getPassword();
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);

        Authentication authentication = authenticationManager.authenticate(token);

        boolean result = authentication.isAuthenticated();

        if (result) {
            SecurityContextHolder.getContext().setAuthentication(authentication);

            HttpSession session = request.getSession(true);
            session.setAttribute("SPRING_SECURITY_CONTEXT", SecurityContextHolder.getContext());
        }
        else {
            log.error("바로 로그인 인증에 실패...");
        }

        return result;
    }

    @Override
    public Users select(Long id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'select'");
    }

    
}
