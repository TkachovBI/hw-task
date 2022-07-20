package com.example.springapp.Models;

import lombok.*;
import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
@Entity
public class UserEntity {

    /**
     * Primary key of Partner Tag
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}