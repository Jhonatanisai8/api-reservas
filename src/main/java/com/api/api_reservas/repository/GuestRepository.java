package com.api.api_reservas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.api_reservas.models.Guest;

public interface GuestRepository
        extends JpaRepository<Guest, Long> {

}
