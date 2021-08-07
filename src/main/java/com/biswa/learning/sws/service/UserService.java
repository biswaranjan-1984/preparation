package com.biswa.learning.sws.service;

import com.biswa.learning.sws.ui.model.request.UserDetailsRequestModel;
import com.biswa.learning.sws.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);
}
