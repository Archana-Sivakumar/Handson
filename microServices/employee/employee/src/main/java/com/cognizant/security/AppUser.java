package com.cognizant.security;



import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cognizant.model.User;

import org.springframework.security.core.authority.SimpleGrantedAuthority;


public class AppUser implements UserDetails{
     
     private User user; 
    private Collection<? extends GrantedAuthority> authorities; 
    
    
     public AppUser(User user) {
    	 this.user = user;
          this.authorities = user.getRoleList()
                                     .stream()
                               .map(role -> new SimpleGrantedAuthority(role.getRole()))
                               .collect(Collectors.toList());
     }

     @Override
     public Collection<? extends GrantedAuthority> getAuthorities() {
          
          return this.authorities;
     }

     @Override
     public String getPassword() {
          
          return user.getPassword();
     }

     @Override
     public String getUsername() {
          // TODO Auto-generated method stub
          return null;
     }

     @Override
     public boolean isAccountNonExpired() {
          
          return true;
     }

     @Override
     public boolean isAccountNonLocked() {
          
          return true;
     }

     @Override
     public boolean isCredentialsNonExpired() {
          
          return true;
     }

     @Override
     public boolean isEnabled() {
          
          return true;
     }

}
