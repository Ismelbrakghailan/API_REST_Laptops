package com.example.ejerciciossesiones789.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "laptops")
public class Laptop {


    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String processor;
    private Long RAM;
    private LocalDate releaseDate;

    //Constructores

    public Laptop() {
    }

    public Laptop(Long id, String brand, String processor, Long RAM, LocalDate releaseDate) {
        this.id = id;
        this.brand = brand;
        this.processor = processor;
        this.RAM = RAM;
        this.releaseDate = releaseDate;
    }

    //Getter and Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Long getRAM() {
        return RAM;
    }

    public void setRAM(Long RAM) {
        this.RAM = RAM;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
