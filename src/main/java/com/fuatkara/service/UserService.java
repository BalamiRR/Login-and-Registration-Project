package com.fuatkara.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.fuatkara.model.User;
import com.fuatkara.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
