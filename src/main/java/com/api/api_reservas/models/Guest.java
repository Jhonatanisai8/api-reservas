package com.api.api_reservas.models;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGuest;
    private String name;
    private String surname;
    private String dateBirth;
    private String nationality;
    private String Phone;

    // relacion con reserva
    @OneToOne(cascade = CascadeType.ALL)
    private List<Reservation> reservations = new ArrayList<>();

}
