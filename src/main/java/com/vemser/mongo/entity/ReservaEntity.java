package com.vemser.mongo.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Scanner;

@Setter
@Getter
@Document(collection = "reserva")
public class ReservaEntity {
    @Id
    private String id;
    private String usuario;
    private String hotel;
    private int numeroquarto;
    private String cidade;
    private String estado;
    private int telefone;

}
