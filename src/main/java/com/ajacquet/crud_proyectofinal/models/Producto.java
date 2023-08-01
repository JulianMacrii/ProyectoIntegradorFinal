package com.ajacquet.crud_proyectofinal.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity //entidad JPA - mapeara una tabla en la base de datos
@Table(name="productos") // nombre de la tabla
public class Producto {
    @Getter
    @Setter
    @Id
    @Column(name="idproductos")
    @GeneratedValue(strategy=GenerationType.AUTO,generator="native" //se genera automaticamente el valor del campo
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private Integer id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private Double precio;
    @Getter
    @Setter
    @Temporal(TemporalType.DATE)
    @CreatedDate
    @Column(name = "fecha_alta") //el campo se almacenara como una fecha en la base
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

