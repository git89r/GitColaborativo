package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
	
	 
    @GetMapping("/mostrar") //para mostrar la pagina calculadora
    public String getMenuSoy() { //metodo para devolver una pagina html llamadda calculadora
    	return("");
    }

}
