package br.com.ctrlman.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ctrlman.entity.ConsultaOs;

@Controller
	public class IndexController {
		
	   @Autowired ConsultaOs consultaOs;
	  
	   @GetMapping("/listaordemservico")
	   		public ModelAndView getlist() {
		    
		    ModelAndView mv  = new ModelAndView("index");
		    return mv;

}
}
