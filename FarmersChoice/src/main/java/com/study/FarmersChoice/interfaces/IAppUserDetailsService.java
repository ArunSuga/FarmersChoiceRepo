package com.study.FarmersChoice.interfaces;

import com.study.FarmersChoice.entity.AppUserDetails;

public interface IAppUserDetailsService {
	
	AppUserDetails loadUserByUsername(String username);

}
