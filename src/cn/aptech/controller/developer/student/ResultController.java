package cn.aptech.controller.developer.student;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.mysql.jdbc.StringUtils;


public class ResultController {

	/**
	 * 用户管理->用户名称->验证用户名是否正确
	 * 
	 * @param userCode
	 * @return
	 */
//	@RequestMapping(value = "/ucexist.json")
//	@ResponseBody
//	public Object userCodeIsExit(@RequestParam String userCode) {
//		logger.debug("userCodeIsExit userCode===================== " + userCode);
//		HashMap<String, String> resultMap = new HashMap<String, String>();
//		if (StringUtils.isNullOrEmpty(userCode)) {
//			resultMap.put("userCode", "null");
//		} else {
//			User user = userService.selectUserCodeExist(userCode);
//			if (null != user)
//				resultMap.put("userCode", "exist");
//			else
//				resultMap.put("userCode", "noexist");
//		}
//		// System.out.println("@###############################(" +
//		// JSONArray.toJSONString(resultMap) + ")##");
//		return JSONArray.toJSONString(resultMap);
//	}
}
