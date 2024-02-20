package com.eoisaac.auth.database.models;

import jakarta.persistence.Table;
import lombok.Data;

import jakarta.persistence.*;

import java.util.UUID;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.*;

@Entity // Tells Hibernate to create a table for this class
@Table(name = "users") // Sets the name of the table
@Data
@SuperBuilder // Automatically generates builder pattern
@AllArgsConstructor // Automatically generates all-args constructor
@NoArgsConstructor // Automatically generates no-args constructor
public class CustomUserModel {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id; // Automatically generates a UUID as the primary key

    @Column(name = "username", unique = true, nullable = false)
    private String username;
    @Column(name = "firstName", unique = true, nullable = false)
    private String firstName;
    @Column(name = "lastName", unique = true, nullable = false)
    private String lastName;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
}
