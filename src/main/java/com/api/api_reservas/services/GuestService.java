package com.api.api_reservas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.api_reservas.models.Guest;
import com.api.api_reservas.repository.GuestRepository;
import java.util.*;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    // metodos
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    public Guest saveGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    

}