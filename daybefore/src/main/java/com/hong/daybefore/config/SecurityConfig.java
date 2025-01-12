package com.hong.daybefore.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import com.hong.daybefore.security.LoginFailureHandler;
import com.hong.daybefore.security.LoginSuccessHandler;
import com.hong.daybefore.service.UserDetailServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserDetailServiceImpl userDetailServiceImpl;

    @Autowired
    private LoginSuccessHandler loginSuccessHandler;

    @Autowired
    private LoginFailureHandler loginFailureHandler;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(auth -> auth
                                    .requestMatchers("/admin", "admin/**").hasRole("ADMIN")
                                    .requestMatchers("/user", "user/**").hasAnyRole("USER", "ADMIN")
                                    .requestMatchers("/**").permitAll());

        http.formLogin(login -> login.usernameParameter("id")
                                        .passwordParameter("pw")
                                        .loginPage("/")
                                        .loginProcessingUrl("/")
                                        .successHandler(loginSuccessHandler)
                                        .failureHandler(loginFailureHandler));


        http.userDetailsService(userDetailServiceImpl);

        http.rememberMe(me -> me.key("aloha")
                                .rememberMeParameter("remember-me")
                                .tokenRepository(tokenRepository())
                                .tokenValiditySeconds(60 * 60 * 24 * 7));

        http.logout(logout -> logout
                        .logoutUrl("/")
                        .logoutSuccessUrl("/")
                        .invalidateHttpSession(true));

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {

        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PersistentTokenRepository tokenRepository() {

        JdbcTokenRepositoryImpl repositoryImpl = new JdbcTokenRepositoryImpl();
        repositoryImpl.setDataSource(dataSource);

        try {
            repositoryImpl.getJdbcTemplate().execute(JdbcTokenRepositoryImpl.CREATE_TABLE_SQL);
        } catch (BadSqlGrammarException e) {
            log.error("persistent_logins 테이블이 이미 존재합니다.");
        } catch (Exception e) {
            log.error("자동 로그인 테이블 생성 중 예외 발생");
        }
        return repositoryImpl;
    }
}
