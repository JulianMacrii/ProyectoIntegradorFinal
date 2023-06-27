package com.ajacquet.crud_proyectofinal.models;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table("productos")
public class Producto {
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private Double precio;
    @Getter
    @Setter
    private Date fechaAlta;

    @Override
    public String toString() {
        return  "id =" + id +
                " | nombre ='" + nombre + '\'' +
                " | precio =" + precio +
                " | fechaAlta =" + fechaAlta +
                '}';
    }
}

