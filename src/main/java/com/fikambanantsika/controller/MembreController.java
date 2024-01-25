package com.fikambanantsika.controller;

import com.fikambanantsika.convertor.MaisonConvertor;
import com.fikambanantsika.convertor.MembreConvertor;
import com.fikambanantsika.dto.MembreDto;
import com.fikambanantsika.model.Association;
import com.fikambanantsika.model.Membre;
import com.fikambanantsika.service.AssociationService;
import com.fikambanantsika.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("membres")
public class MembreController {
    @Autowired
    private MembreService membreService;
    @Autowired
    private AssociationService associationService;
    @Autowired
    private MembreConvertor membreConvertor;
    @Autowired
    private MaisonConvertor maisonConvertor;

    @GetMapping("")
    public String listMembre(Model model){
       Long idAssociation= 1L;
        Optional<Association> associationOptional = associationService.findByid(idAssociation);
        Association association=null;
        if (associationOptional.isPresent()){
            association=associationOptional.get();
        }

        List<Membre> membres= membreService.findAll(association);
        model.addAttribute("membres", membreConvertor.modelToDto(membres));

       return"membre/view-membre";
    }
    @GetMapping("/detail/{id}")
    public  String detail(@PathVariable(value = "id") long id, Model model){
        Membre membre = membreService.findById(id);
        MembreDto membreDto = membreConvertor.modelToDto(membre);
        System.out.println(membreDto.getMaisons());
        model.addAttribute("membre",membreDto);
        model.addAttribute("maisons", membreDto.getMaisons());
        return "membre/detail-membre";
    }
}
