package com.maigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String evaluar(@RequestParam(value="code", required=false) String code) {
		
		if("bushido".equals(code)) {
			return "redirect:/code";
		}
		else {
			return "redirect:/createError";
		}
	}
	@RequestMapping("/code")
    public String code() {
          return "code.jsp";
    }
	
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        return "redirect:/";
	}
	

}
