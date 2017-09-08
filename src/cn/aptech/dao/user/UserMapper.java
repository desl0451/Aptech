package cn.aptech.dao.user;

import org.apache.ibatis.annotations.Param;

import cn.aptech.pojo.User;

public interface UserMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser(@Param("devCode")String devCode)throws Exception;
}
