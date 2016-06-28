package com.cabin.repository;

import com.cabin.entity.UpworkBid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<UpworkBid, Integer> {


}
