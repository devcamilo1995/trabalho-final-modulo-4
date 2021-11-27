package com.vemser.mongo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vemser.mongo.dto.FuncionarioCreateDTO;
import com.vemser.mongo.entity.FuncionarioEntity;
import com.vemser.mongo.entity.ReservaEntity;
import com.vemser.mongo.exceptions.RegraDeNegocioException;
import com.vemser.mongo.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;
    private final ObjectMapper objectMapper;

    public FuncionarioEntity save(FuncionarioCreateDTO funcionarioCreateDTO){
        FuncionarioEntity funcionarioEntity = objectMapper.convertValue(funcionarioCreateDTO, FuncionarioEntity.class);
        return funcionarioRepository.save(funcionarioEntity);
    }

    public List<FuncionarioEntity> findAll(){return funcionarioRepository.findAll();}

    public long count() {return funcionarioRepository.count();}

    public FuncionarioEntity findById(String id) throws RegraDeNegocioException{
        return funcionarioRepository.findById(id).
                orElseThrow(() -> new RegraDeNegocioException("Funcionário não encontrado"));
    }

    public void delete(String id) throws RegraDeNegocioException{
        FuncionarioEntity funcionarioEntity = findById(id);
        funcionarioRepository.delete(funcionarioEntity);
    }
}
