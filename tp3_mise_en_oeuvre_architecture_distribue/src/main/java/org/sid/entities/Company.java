package org.sid.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data // getters et setters
@NoArgsConstructor // constructeur sans paramettre
@AllArgsConstructor // constructeur avec paramettre
@ToString
public class Company implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
}
