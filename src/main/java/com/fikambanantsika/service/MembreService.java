package com.fikambanantsika.service;

import com.fikambanantsika.model.Association;
import com.fikambanantsika.model.Membre;


import java.util.List;

public interface MembreService {
    List<Membre> findAll(Association association);
    Membre findById(Long id);
}
