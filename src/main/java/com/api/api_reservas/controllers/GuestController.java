package com.api.api_reservas.controllers;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.api_reservas.models.Guest;
import com.api.api_reservas.services.GuestService;

@RestController
@RequestMapping("api/v1/guests")
public class GuestController {

    @Autowired
    private GuestService guestService;

    // metodos
    @GetMapping
    public List<Guest> getAllGuests() {
        return guestService.getAllGuests();
    }

    @PostMapping
    public Guest saveGuest(@RequestBody Guest guest) {
        return guestService.saveGuest(guest);
    }



}
