package cn.aptech.service.developer.user;

import cn.aptech.pojo.User;

public interface UserService {
	/**
	 * 用户登录
	 * 
	 * @param devCode
	 * @param devPassword
	 * @return
	 */
	public User login(String devCode, String devPassword) throws Exception;
}
