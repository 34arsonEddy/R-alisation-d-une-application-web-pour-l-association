package com.fikambanantsika.service;

import com.fikambanantsika.model.Association;

import java.util.Optional;

public interface AssociationService {
    Optional<Association> findByid(long id);
    Association findAll();
}
