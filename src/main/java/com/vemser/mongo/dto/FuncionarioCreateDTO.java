package com.vemser.mongo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FuncionarioCreateDTO {
    private String nome;
    private String cpf;
    private String cargo;
    private Double salario;
}
