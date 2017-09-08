package cn.aptech.service.developer.student.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.aptech.dao.student.StudentMapper;
import cn.aptech.pojo.Student;
import cn.aptech.service.developer.student.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentMapper studentMapper;

	/**
	 * 学员登录
	 */
	@Override
	public Student login(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		Student stu = studentMapper.getLoginStudent(username);
		if (stu != null) {
			if(!stu.getPassword().equals(password)){
				return null;
			}
		}
		return stu;
	}
}
