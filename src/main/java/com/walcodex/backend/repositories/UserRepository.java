package com.walcodex.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.walcodex.backend.entity.USER;

@Repository
public interface UserRepository extends JpaRepository<USER, Long> {
    
}
