package com.cabin.repository;

import com.cabin.entity.Saler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SalerRepository extends JpaRepository<Saler, Integer> {

    Saler getById(Integer id);

    Saler getByLogin(String login);

    Saler getByEmail(String email);

    @Query(value = "SELECT login FROM Saler WHERE login = :login", nativeQuery = true)
    public String checkForThePresenceLogin(@Param("login") String login);

}
