package com.fikambanantsika.service;

import com.fikambanantsika.convertor.MembreConvertor;
import com.fikambanantsika.dto.MembreDto;
import com.fikambanantsika.model.Association;
import com.fikambanantsika.model.Membre;
import com.fikambanantsika.repository.IMembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MembreServiceImpl implements MembreService{

    private IMembreRepository membreRepository;

    @Autowired
    public MembreServiceImpl(IMembreRepository membreRepository) {
        this.membreRepository = membreRepository;

    }

    @Override
    public List<Membre> findAll(Association association) {
        List<Membre> membres = membreRepository.findByAssociation(association);
        return membres;


    }

    public Membre findById(Long id){
        Membre membre = membreRepository.findById(id).get();
        return membre;
    }
}
