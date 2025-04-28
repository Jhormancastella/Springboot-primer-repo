package com.inventrariotb.inventariotb.domain.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "countries") 
public class country { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 

    @Column(name = "name_country", length = 50, nullable = false, unique = true)
    private String nameCountry;

    @OneToMany(mappedBy = "countries", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Region> regions = new HashSet<>();
}
