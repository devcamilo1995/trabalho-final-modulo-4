package com.vemser.mongo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vemser.mongo.dto.ReservaCreateDTO;
import com.vemser.mongo.entity.ReservaEntity;
import com.vemser.mongo.exceptions.RegraDeNegocioException;
import com.vemser.mongo.repository.ReservaRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservaService {
    private final ReservaRepository reservaRepository;
    private final ObjectMapper objectMapper;

    public ReservaEntity save (ReservaCreateDTO reservaCreateDTO) {
        ReservaEntity reservaEntity = objectMapper.convertValue(reservaCreateDTO, ReservaEntity.class);
        return reservaRepository.save(reservaEntity);
    }

    public List<ReservaEntity> findAll() {
        return reservaRepository.findAll();
    }

    public long count() {
        return reservaRepository.count();
    }

    public ReservaEntity findById(String id) throws RegraDeNegocioException {
        return reservaRepository.findById(id).orElseThrow(() -> new RegraDeNegocioException("Reserva Não encontrada"));

    }

    public void delete(String id) throws RegraDeNegocioException {
        ReservaEntity reservaEntity = findById(id);
        reservaRepository.delete(reservaEntity);
    }

}

