package com.vemser.mongo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ReservaCreateDTO {
    private String usuario;
    private String hotel;
    private int numeroquarto;
    private String cidade;
    private String estado;
    private int telefone;

}
