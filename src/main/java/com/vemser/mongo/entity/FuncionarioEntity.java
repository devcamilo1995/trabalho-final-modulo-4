package com.vemser.mongo.entity;

import lombok.Getter;
import lombok.Setter;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "funcionario")
public class FuncionarioEntity {
    @Id
    private String id;
    private String nome;
    private String cpf;
    private String cargo;
    private Double salario;

}
