package com.maigo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession sesion) {
		Integer counter=0;
		
		if(sesion.getAttribute("clicks")==null) {
			counter++;	
			sesion.setAttribute("clicks", counter);
		}
		else {
			counter = (Integer) sesion.getAttribute("clicks");
			counter++;
			sesion.setAttribute("clicks", counter);
		}
		
		return "index.jsp";
	}
	
	@RequestMapping("/second")
	public String second(HttpSession sesion) {
		Integer counter=0;
		
		if(sesion.getAttribute("clicks")==null) {
			counter=counter+1;	
			sesion.setAttribute("clicks", counter);
		}
		else {
			counter = (Integer) sesion.getAttribute("clicks");
			counter=counter+1;
			sesion.setAttribute("clicks", counter);
		}
		
		return "second.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession sesion, @RequestParam(value="action", required=false) String action) {
		
		if("reset".equals(action)) {
			sesion.setAttribute("clicks", 0);
		}
		
		return "counter.jsp";
	}

}
