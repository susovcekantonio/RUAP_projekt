package com.ericsson.sm.CarApp.service.impl;

import com.ericsson.sm.CarApp.controller.ClientController;
import com.ericsson.sm.CarApp.model.Client;
import com.ericsson.sm.CarApp.repository.ClientRepository;
import com.ericsson.sm.CarApp.service.mapper.ClientDtoMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class ClientServiceImplTest {
    @InjectMocks
    private ClientServiceImpl clientService;
    @Mock
    private ClientRepository clientRepository;
    @Mock
    private ClientDtoMapper clientDtoMapper;
    @Mock
    private ClientController clientController;




    @Test
    void getClientByLastName() {
        Client client= mock(Client.class);
        when(client.getLastName()).thenReturn("Mirkov");

        String lastName = client.getLastName();

        assertEquals("Mirkov",lastName);
    }

    @Test
    void getClientByFirstName() {
        Client client= mock(Client.class);
        when(client.getFirstName()).thenReturn("Tajana");

        String firstName = client.getFirstName();

        assertEquals("Tajana",firstName);
    }

    @Test
    public void testGetById_throwsEntityNotFoundException() {
        ClientRepository clientRepository = mock(ClientRepository.class);


        when(clientRepository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(EntityNotFoundException.class, () -> clientService.getById(1L));
    }


}