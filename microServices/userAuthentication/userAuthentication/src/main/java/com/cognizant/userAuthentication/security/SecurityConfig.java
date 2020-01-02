package com.cognizant.userAuthentication.security;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.cognizant.userAuthentication.UserAuthenticationApplication;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserAuthenticationApplication.class);
	
	@Autowired
	private AppUserDetailsService appUserDetailsService;
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		LOGGER.info("Start");
		auth.userDetailsService(appUserDetailsService).passwordEncoder(passwordEncoder());
      //  auth.userDetailsService(inMemoryUserDetailsManager());
        LOGGER.info("End");
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
    	
        LOGGER.info("Start");
        LOGGER.info("End");
        return new BCryptPasswordEncoder();
    }
    
	/*
	 * @Bean public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
	 * LOGGER.info("Start"); List<UserDetails> userDetailsList = new ArrayList<>();
	 * 
	 * userDetailsList.add( User.withUsername("user") .password(passwordEncoder()
	 * .encode("pwd")) .roles("USER").build());
	 * 
	 * userDetailsList.add( User.withUsername("admin") .password(passwordEncoder()
	 * .encode("pwd")) .roles("ADMIN").build());
	 * 
	 * LOGGER.info("End"); return new InMemoryUserDetailsManager(userDetailsList); }
	 */


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
    	
    	     LOGGER.info("Start");
    	 
	    	 httpSecurity.cors();
	         httpSecurity.csrf()
	        .disable()
	        .httpBasic()
	        .and()
	        .sessionManagement()
	        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	        .and()
	        .authorizeRequests()
				/*
				 * .antMatchers("/truyum/menu-items").permitAll()
				 * .antMatchers("/truyum/cart-items").permitAll()
				 * .antMatchers("/truyum/authenticate").hasAnyRole("USER","ADMIN")
				 * .antMatchers("/truyum/sign-up").permitAll()
				 */
	        .anyRequest().authenticated()
	        .and()
	        .addFilter(new JwtAuthorizationFilter(authenticationManager()));
	         
	         LOGGER.info("End");
    }
}

