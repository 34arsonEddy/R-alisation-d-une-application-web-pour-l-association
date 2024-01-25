package com.fikambanantsika.service;

import com.fikambanantsika.model.Association;
import com.fikambanantsika.repository.IAssociationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AssociationServiceImpl implements AssociationService{

    private IAssociationRepository associationRepository;

    public AssociationServiceImpl(IAssociationRepository associationRepository) {
        this.associationRepository = associationRepository;
    }

    @Override
    public Optional<Association> findByid(long id) {
        Optional<Association> association = associationRepository.findById(id);
        return  association;
    }

    @Override
    public Association findAll() {
        return null;
    }
}
