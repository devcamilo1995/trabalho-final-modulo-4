package com.vemser.mongo.repository;

import com.vemser.mongo.entity.FuncionarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends MongoRepository <FuncionarioEntity, String> {
}
