package com.vemser.mongo.controller;


import com.vemser.mongo.dto.ReservaCreateDTO;
import com.vemser.mongo.entity.ReservaEntity;
import com.vemser.mongo.exceptions.RegraDeNegocioException;
import com.vemser.mongo.service.ReservaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/reserva")
@RequiredArgsConstructor
@Slf4j
public class ReservaController {
    private final ReservaService reservaService;

    @GetMapping
    public List<ReservaEntity> list(){
        return reservaService.findAll();
    }


    @PostMapping
    public ReservaEntity save(@RequestBody ReservaCreateDTO reservaCreateDTO){
        return reservaService.save(reservaCreateDTO);
    }


    @GetMapping("/{idReserva}")
    public ReservaEntity findById( @PathVariable("idReserva") String id) throws RegraDeNegocioException {
        return reservaService.findById(id);
    }

    @DeleteMapping("/{idReserva}")
    public void delete( @PathVariable("idReserva") String id) throws RegraDeNegocioException {
        reservaService.delete(id);
    }
}


