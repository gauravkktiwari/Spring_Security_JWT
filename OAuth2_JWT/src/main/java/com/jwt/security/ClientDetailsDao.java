package com.jwt.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.model.ClientEntity;

@Repository
public interface ClientDetailsDao extends JpaRepository<ClientEntity, Long> {

	ClientEntity findByClientId(String clientId);

}
