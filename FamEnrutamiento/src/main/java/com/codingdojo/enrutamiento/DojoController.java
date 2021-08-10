package com.codingdojo.enrutamiento;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class DojoController {
	
	@RequestMapping("/{track}")
    public String variables(@PathVariable("track") String track){
    	
		if("dojo".equals(track)) {
    		return "¡El " + track + " es increíble!";
    	}
    	
    	else if("burbank-dojo".equals(track)) {
    		return "El Dojo Burbank está localizado al sur de California";
    	}
    	
    	else if("san-jose".equals(track)) {
    		return "El Dojo SJ es el cuartel general";
    	}
    	
    	else {
    		return "Esta URL no existe";
    	}
    }
    
}