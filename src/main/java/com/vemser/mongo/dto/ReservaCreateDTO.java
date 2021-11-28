package com.vemser.mongo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
public class ReservaCreateDTO {
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
