package com.cabin.repository;

import com.cabin.entity.Saler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalerRepository extends JpaRepository<Saler, Integer> {

}
