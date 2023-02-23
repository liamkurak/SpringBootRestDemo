package com.mercury.SpringBootRestDemo.security;

import com.mercury.SpringBootRestDemo.security.handler.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private AuthenticationEntryPointImpl authenticationEntryPointImpl;

    @Autowired
    private AccessDeniedHandlerImpl accessDeniedHandlerImpl;

    @Autowired
    private AuthenticationSuccessHandlerImpl authenticationSuccessHandlerImpl;

    @Autowired
    private AuthenticationFailureHandlerImpl authenticationFailureHandlerImpl;

    @Autowired
    private LogoutSuccessHandlerImpl logoutSuccessHandlerImpl;

    @Autowired
    private UserDetailsService userDetailsServiceImpl;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeRequests((requests) ->
                        requests
//				.antMatchers(HttpMethod.GET, "/products").permitAll()
//				.antMatchers(HttpMethod.GET, "/products/*").hasAuthority("ROLE_ADMIN")	//.hasRole("ADMIN")	// hasRole: "ROLE_xyz"
                                .anyRequest()
                                .permitAll()	//.authenticated()
        );

        http.exceptionHandling()
                .accessDeniedHandler(accessDeniedHandlerImpl)
                .authenticationEntryPoint(authenticationEntryPointImpl);

        http.formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .successHandler(authenticationSuccessHandlerImpl)
                .failureHandler(authenticationFailureHandlerImpl)
        ;

        http.logout()
                .permitAll()
                .logoutUrl("/logout")
                .logoutSuccessHandler(logoutSuccessHandlerImpl)
        ;

        http.httpBasic();

        return http.build();
    }

    @Bean // put the return object into spring container, as a bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(11);
    }

    @Autowired // @Autowired on function will autowired the parameters
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(new BCryptPasswordEncoder(11));
    }
}
