package cn.aptech.service.developer.student;

import cn.aptech.pojo.Student;

public interface StudentService {
	/**
	 * 学员登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public Student login(String username, String password) throws Exception;

}
