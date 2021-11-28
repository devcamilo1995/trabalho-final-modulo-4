package com.vemser.mongo.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Scanner;

@Setter
@Getter
@Document(collection = "reserva")
public class ReservaEntity {
    @Id
    private String id;
    @NotEmpty
    private String usuario;
    @NotEmpty
    private String hotel;
    private int numeroquarto;
    @NotEmpty
    private String cidade;
    @NotEmpty
    private String estado;
    private int telefone;
}
