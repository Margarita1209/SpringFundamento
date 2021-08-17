package com.maigo.mostrarfecha;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	@RequestMapping("/")
	String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	String date(Model model) {
		
		Date fecha = new Date();
		model.addAttribute("fecha", formato(fecha,"E, 'The' dd 'of' MMM, yyyy"));
		return "Date.jsp";
	}
	@RequestMapping("/time")
	String time(Model model) {
		
		Date fecha = new Date();
		model.addAttribute("fecha", formato(fecha, "hh:mm aa"));
		return "Time.jsp";
	}
	public String formato(Date var,String forma) {
		String fecha;
		String strDateFormat = forma;
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		fecha = sdf.format(var);
		return fecha;
	}



}
