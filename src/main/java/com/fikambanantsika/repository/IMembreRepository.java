package com.fikambanantsika.repository;

import com.fikambanantsika.model.Association;
import com.fikambanantsika.model.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMembreRepository extends JpaRepository<Membre,Long> {
    List<Membre> findByAssociation(Association association);
}
