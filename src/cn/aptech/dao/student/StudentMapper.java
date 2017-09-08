package cn.aptech.dao.student;

import org.apache.ibatis.annotations.Param;

import cn.aptech.pojo.Student;

public interface StudentMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public Student getLoginStudent(@Param("username")String username)throws Exception;
}
