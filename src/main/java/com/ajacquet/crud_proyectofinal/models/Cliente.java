package com.ajacquet.crud_proyectofinal.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @Column(name="idclientes")
    @GeneratedValue(strategy=GenerationType.AUTO,generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String apellido;
    @Getter
    @Setter
    private String dni;
    @Getter
    @Setter
    private String email;
}
