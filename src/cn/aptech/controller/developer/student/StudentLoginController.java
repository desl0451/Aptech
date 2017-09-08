    package cn.aptech.controller.developer.student;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.aptech.pojo.Student;
import cn.aptech.service.developer.student.StudentService;
import cn.aptech.tools.Constants;

@Controller
@RequestMapping(value = "/stu")
public class StudentLoginController {
	private Logger logger = Logger.getLogger(StudentLoginController.class);

	@Resource
	private StudentService studentService;

	@RequestMapping(value = "/login")
	public String login() {
		logger.debug("StudentLoginController welcome Aptech develpor==================");
		return "devlogin";
	}

	/**
	 * 登录
	 * 
	 * @param devCode
	 * @param devPassword
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/dologin", method = RequestMethod.GET)
	public String doLogin(@RequestParam String username, @RequestParam String password, HttpServletRequest request,
			HttpSession session) {
		logger.debug("doLogin====================================");
		Student stu = null;
		try {
			stu = studentService.login(username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 登录成功
		if (stu != null) {
			session.setAttribute(Constants.STUDENT_USER_SESSION, stu);
			return "redirect:/stu/flatform/main";
		} else {
			// 页面跳转(login.jsp)带出提示信息--转发
			request.setAttribute("error", "用户名或密码不正确");
			return "devlogin";
		}
	}

	@RequestMapping(value = "/flatform/main")
	public String main(Model model, HttpSession session) {
		if (session.getAttribute(Constants.STUDENT_USER_SESSION) == null) {
			return "redirect:/stu/login";
		}
		Student stu = (Student) session.getAttribute(Constants.STUDENT_USER_SESSION);
		model.addAttribute("stu", stu);
		return "developer/main";
	}

	/**
	 * 注销
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		// 清除session
		session.removeAttribute(Constants.STUDENT_USER_SESSION);
		return "devlogin";
	}
}
