package com.hong.daybefore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hong.daybefore.domain.Users;
import com.hong.daybefore.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;





@Slf4j
@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    /**
     * 메인 화면
     * @return
     */
    @GetMapping("")
    public String home() {

        
        return "/index";
    }

    /**
     * 회원가입 화면
     * @return
     */
    @GetMapping("/join")
    public String join() {

        return "/join";
    }

    /**
     * 회원가입 처리
     * @param user
     * @param request
     * @param redirectAttributes
     * @return
     * @throws Exception
     */
    @PostMapping("/join")
    public String joinPro(Users user, HttpServletRequest request, RedirectAttributes redirectAttributes) throws Exception {

        String plainPassword = user.getPassword();

        int result = userService.insert(user);

        if (result > 0) {
            user.setPassword(plainPassword);
            boolean loginResult = userService.login(user, request);
            if (loginResult) {
                return "redirect:/";
            }
        }
        redirectAttributes.addFlashAttribute("message", "회원가입에 실패했습니다.");
        
        return "redirect:/join?error";
    }

    /**
     * 아이디 중복확인
     * @param id
     * @return
     * @throws Exception
     */
    @GetMapping("/check/{id}")
    public ResponseEntity<Boolean> idCheck(@PathVariable("id") String id) throws Exception {
        Users user = userService.selectId(id);

        if (user != null) {
            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
    
    
    

}
