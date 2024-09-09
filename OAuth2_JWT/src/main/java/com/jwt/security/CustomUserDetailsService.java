package com.jwt.security;

import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwt.dao.UserMasterDao;
import com.jwt.model.UserMaster;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private static final Logger LOG = LogManager.getLogger(CustomUserDetailsService.class);
	
	@Autowired
    private UserMasterDao userMasterDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 UserMaster user = userMasterDao.findFirstByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),  Collections.emptyList());
	}

}
