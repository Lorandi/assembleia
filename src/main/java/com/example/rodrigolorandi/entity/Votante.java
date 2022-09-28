package com.example.rodrigolorandi.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "votante")
public class Votante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String CPF;

}
