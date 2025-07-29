package com.wanderson.Desafio_03.services;

import com.wanderson.Desafio_03.repositories.ClientRopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRopository clientRepository;


}
