package com.example.rodrigolorandi.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "survey")
public class Survey {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private LocalDate startDate;
        private LocalDate endDate;
        private String question;
}
