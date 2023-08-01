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
<<<<<<< HEAD
    @Getter
    @Setter
=======
>>>>>>> ecc63ee9b9912c6a5a33175d17b1a459981e01a0
    @Id
    @Column(name="idclientes")
    @GeneratedValue(strategy=GenerationType.AUTO,generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
<<<<<<< HEAD
=======
    @Getter
    @Setter
>>>>>>> ecc63ee9b9912c6a5a33175d17b1a459981e01a0
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
<<<<<<< HEAD

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido=" + apellido +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
=======
>>>>>>> ecc63ee9b9912c6a5a33175d17b1a459981e01a0
}
