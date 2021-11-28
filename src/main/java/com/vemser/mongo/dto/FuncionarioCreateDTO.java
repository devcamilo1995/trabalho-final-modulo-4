package com.vemser.mongo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
public class FuncionarioCreateDTO {
    @NotNull(message = "Não pode ser null")
    @NotBlank(message = "Não pode estar em branco")
    @ApiModelProperty(value= "Nome do funcionario")
    private String nome;
    @NotNull(message = "Não pode ser null")
    @NotBlank(message = "Não pode estar em branco")
    @Size(max=11, min=11)
    @ApiModelProperty(value= "CPF")
    private String cpf;
    @NotNull(message = "Não pode ser null")
    @NotBlank(message = "Não pode estar em branco")
    @ApiModelProperty(value= "Cargo")
    private String cargo;
    @NotNull(message = "Não pode ser null")
    @NotBlank(message = "Não pode estar em branco")
    @ApiModelProperty(value= "Salario")
    private Double salario;
}
