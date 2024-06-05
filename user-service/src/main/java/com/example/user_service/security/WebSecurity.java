package com.example.user_service.security;

// import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.user_service.service.UserService;

//@Configuration
//@EnableWebSecurity
public class WebSecurity{
    private UserService userService;
    private Environment env;

    public WebSecurity(UserService userService, Environment env){
        this.userService = userService;
        this.env = env;
    }

    // protected SecurityFilterChain configure(HttpSecurity http)throws Exception{

    //     http.csrf( (csrf) -> csrf.disable());

    //     http.authorizeHttpRequests((authz) -> authz
    //                     .requestMatchers(new AntPathRequestMatcher("/users/**")).permitAll()
    //                     .anyRequest().authenticated()
    //                     );

    //     return http.build();
    // }

}
