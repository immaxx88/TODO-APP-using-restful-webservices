package com.todos.rest.webservices.restfulwebservices.basic.auth;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


//@CrossOrigin(origins = "http://localhost:4200")
@Configuration
@EnableWebSecurity
public class SpringSecurityBasicAuth extends WebSecurityConfigurerAdapter {

@Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .cors().and()
                .csrf().disable()
                .httpBasic()
                .and()
                .authorizeRequests()
               // .antMatchers(HttpMethod.GET,"/basicauth").authenticated()
               // .antMatchers("/**").permitAll()
               // .antMatchers("/basicauth").authenticated()
                .antMatchers("/**").permitAll()
                .antMatchers(HttpMethod.DELETE,"/**").permitAll()
               // .antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
                .anyRequest()
                .authenticated();
    }

@Bean
		CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("*"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS", "DELETE", "PUT", "PATCH"));
        configuration.setAllowedHeaders(Arrays.asList("X-Requested-With", "Origin", "Content-Type", "Accept", "Authorization"));
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
 

	   
	

