package com.example.vaccinationbookingsystem.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String appointmentId;

    Date appointmentDate;

    int doseNo;

    @ManyToOne
    @JoinColumn
    Person person;

    @ManyToOne
    @JoinColumn
    Doctor doctor;
}
