package com.wanderson.Desafio_03.repositories;

import com.wanderson.Desafio_03.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRopository extends JpaRepository<Client, Long> {
}
