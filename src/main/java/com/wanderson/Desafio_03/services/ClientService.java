package com.wanderson.Desafio_03.services;

import com.wanderson.Desafio_03.dto.ClientDTO;
import com.wanderson.Desafio_03.entities.Client;
import com.wanderson.Desafio_03.repositories.ClientRopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRopository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = clientRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado: "));
        return new ClientDTO(client);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = clientRepository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }

}
