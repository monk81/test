package springmvc31.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@ComponentScan
public class IndexController {
	
	@RequestMapping("/")
	public String index(){
		return "";
	}

}
