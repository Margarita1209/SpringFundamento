package com.maigo.holahumano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hola")
public class HumanoController {
	
	@RequestMapping("/")
	 public String saludar(@RequestParam(value="nombre", defaultValue="Humano")String nombre,@RequestParam(value="apellido", defaultValue = " ")String apellido) {
  /*  @RequestMapping("/your_server/{nombre}/{apellido}")
    public String saludar(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido){*/
    	return "<h2>Hola Humano: " + nombre + " " + apellido+ "</h2> <br>"+"Bienvenidos a SpringBoot";
    }
	
}
