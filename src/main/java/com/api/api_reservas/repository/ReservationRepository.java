package com.api.api_reservas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.api_reservas.models.Reservation;

public interface ReservationRepository
        extends JpaRepository<Reservation, Long> {

}
