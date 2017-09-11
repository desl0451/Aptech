package cn.aptech.controller.developer.student;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/chart")
public class MainLoginController {

	private Logger logger = Logger.getLogger(MainLoginController.class);

	@RequestMapping(value = "/scattergraph.html")
	public String charts() {

		return "developer/echarts";
	}
}
