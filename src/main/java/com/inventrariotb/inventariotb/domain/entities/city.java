package com.inventrariotb.inventariotb.domain.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
@Table(name = "cities")
@Entity

public class city {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name_city", length = 50, nullable = false, unique = true)
    String name;

    @ManyToOne
    @JoinColumn(name = "region_id")
    @JsonBackReference
    Region regions;

}
