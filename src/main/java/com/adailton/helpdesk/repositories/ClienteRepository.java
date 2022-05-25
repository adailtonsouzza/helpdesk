package com.adailton.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adailton.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
