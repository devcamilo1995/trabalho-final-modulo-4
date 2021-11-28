package com.vemser.mongo.controller;

import com.vemser.mongo.dto.FuncionarioCreateDTO;
import com.vemser.mongo.entity.FuncionarioEntity;
import com.vemser.mongo.exceptions.RegraDeNegocioException;
import com.vemser.mongo.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/funcionario/")
@RequiredArgsConstructor
@Slf4j
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    @GetMapping
    public List<FuncionarioEntity> list() {
        return funcionarioService.findAll();
    }

    @GetMapping("/{idFuncionario}")
    public FuncionarioEntity findById(@PathVariable("idFuncionario") String id) throws RegraDeNegocioException{
        return funcionarioService.findById(id);
    }

    @PostMapping
    public FuncionarioEntity save(@RequestBody FuncionarioCreateDTO funcionarioCreateDTO){
        return funcionarioService.save(funcionarioCreateDTO);
    }

    @DeleteMapping("/{idFuncionario}")
    public void delete(@PathVariable("idFuncionario") String id) throws RegraDeNegocioException{
        funcionarioService.delete(id);
    }

    @PutMapping("/{idFuncionario}")
    public FuncionarioEntity update(@PathVariable("idFuncionario") String id, @RequestBody FuncionarioEntity funcionarioEntity) throws RegraDeNegocioException{
    return funcionarioService.update(id, funcionarioEntity);
    }
}
