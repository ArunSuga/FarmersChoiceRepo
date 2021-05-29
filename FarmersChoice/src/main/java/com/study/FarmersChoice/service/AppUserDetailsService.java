package com.study.FarmersChoice.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.study.FarmersChoice.entity.AppUserDetails;
import com.study.FarmersChoice.interfaces.IAppUserDetailsService;
import com.study.FarmersChoice.model.AppUserDetailsDTO;
import com.study.FarmersChoice.repo.AppUserDetailsRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {

		// TODO Auto-generated method stub
	
		@Autowired
		private AppUserDetailsRepository userDao;
	    
		@Autowired
		private PasswordEncoder bcryptEncoder;
	
		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			// TODO Auto-generated method stub
			
			AppUserDetails user = userDao.findByUsername(username);
			if (user == null) {
				throw new UsernameNotFoundException("User not found with username: " + username);
			}
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
					new ArrayList<>());
		}

		public AppUserDetails save(AppUserDetailsDTO user) {
			AppUserDetails newUser = new AppUserDetails();
			newUser.setUsername(user.getUsername());
			newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
			return userDao.save(newUser);
		}

}
