package cn.aptech.service.developer.user.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.aptech.dao.user.UserMapper;
import cn.aptech.pojo.User;
import cn.aptech.service.developer.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public User login(String username, String password) throws Exception {
		User user = null;
		user = userMapper.getLoginUser(username);
		// 匹配密码
		if (user != null) {
			if (!user.getPassword().equals(password)) {
				user = null;
			}
		}
		return user;
	}

}
