package com.jpa.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Anotación de Lombok que genera getters, setters, toString, equals y hashCode automáticamente
@Data

// Anotación de Lombok que genera un constructor con todos los argumentos
@AllArgsConstructor

// Anotación de Lombok que genera un constructor sin argumentos
@NoArgsConstructor

// Marca esta clase como una entidad JPA, lo que significa que se mapeará a una tabla en la base de datos
@Entity
public class Club {

    // Marca este campo como la clave primaria de la entidad
    @Id

    // Especifica que el valor de la clave primaria se generará automáticamente usando la estrategia de identidad
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Campo de la entidad que representa el nombre del club
    private String name;

    @OneToOne(targetEntity = Coach.class, cascade = CascadeType.PERSIST)
    private Coach coach;

}

