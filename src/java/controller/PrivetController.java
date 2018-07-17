/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user129
 */

@Controller
public class PrivetController {
    
    public PrivetController(){};
    
    @RequestMapping("/privet")
    public String privet (Model model){
        model.addAttribute("myname", "Ян запустил проект, какой он молодец!");
        return "privet";
    }
}
