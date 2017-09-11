package cn.aptech.dao.result;

import java.util.List;

import cn.aptech.pojo.Result;

public interface ResultMapper {
	/**
	 * 查询指定学号的成绩
	 * @param studentNo
	 * @return
	 */
	public List<Result> getResultByNo(String studentNo);
}
