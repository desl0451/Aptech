package cn.aptech.controller.developer.student;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.aptech.pojo.Student;
import cn.aptech.tools.Constants;

@Controller
@RequestMapping(value = "/chart")
public class MainLoginController {

	private Logger logger = Logger.getLogger(MainLoginController.class);

	@RequestMapping(value = "/scattergraph")
	public String charts(Model model, HttpSession session) {
		Student stu = (Student) session.getAttribute(Constants.STUDENT_USER_SESSION);
		model.addAttribute("stu", stu);
		return "developer/echarts";
	}
}
