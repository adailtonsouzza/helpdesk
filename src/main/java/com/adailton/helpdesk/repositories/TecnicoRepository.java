package com.adailton.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adailton.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
