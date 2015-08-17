/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unalm.startbootstrapSbAdmin.controller.programa;

import unalm.startbootstrapSbAdmin.model.Programa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("programa")


public class ProgramaController {

    @Autowired
    ProgramaService service;
    
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        
        List<Programa> programas = service.allPrograma();
        
        model.addAttribute("programas",service.allPrograma());
        return "programa/index";
    }

    @RequestMapping("nuevo")
    public String nuevo(Model model) {
    model.addAttribute("programa",new Programa());
         return "programa/formulario";
        
    }

    @RequestMapping("{id}/editar")
    public String editar(@PathVariable("id")Long id,Model model) {
    	System.out.println("entro a editar");
        Programa programa = service.findPrograma(id);
        if(programa == null ){
           return "redirect:/programa";
        }
        model.addAttribute("programa",programa);
        System.out.println(programa.getId());
        System.out.println(programa.getCodigo());
        
             return "programa/formulario";
    }

    @RequestMapping("guardar")
    public String guardar(Programa programa) {

		System.out.println("entro a guardar");
		System.out.println("El ID:  "+programa.getId());
		System.out.println(programa.getNombre());
		System.out.println(programa.getDescripcion());
		System.out.println(programa.getCodigo());
        service.guardarPrograma(programa);
        return "redirect:/programa";
    }

    @RequestMapping("{id}/eliminar")
    public String eliminar(@PathVariable("id")Long id,Model model) {
         service.deletePrograma(id);
         return "redirect:/programa";
    }
}
