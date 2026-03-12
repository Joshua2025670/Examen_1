package com.upiiz.RRJA.Examen.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExamenController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/eliminar")
    public String eliminar(){
        return "eliminar";
    }
    @GetMapping("/editar")
    public String editar(){
        return "editar";
    }
    @GetMapping("/nueva")
    public String nueva(){
        return "nueva";
    }
}
