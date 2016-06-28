package com.cabin.repository;

import com.cabin.entity.Saler;
import com.cabin.entity.UpworkBid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UpworkBidRepository extends JpaRepository<UpworkBid, Integer> {

    //simple queries
    public List<UpworkBid> getBySaler(Saler saler);

    public List<UpworkBid> getByComment(Saler saler);

    public List<UpworkBid> getByDate(Date date);

    public List<UpworkBid> getByUpdatedDate(Date date);

    public UpworkBid getByUrl(String url);

    //complicated queries
    @Query(value = "SELECT u FROM UpworkBid u WHERE u.saler = :saler AND u.date BETWEEN :dateFrom AND dateTo")
    public List<UpworkBid> getBySalerAndDateBetween(@Param("saler") Saler saler, @Param("dateFrom") Date dateFrom,
            @Param("dateTo") Date dateTo);

    @Query(value = "SELECT u FROM UpworkBid u WHERE u.saler = :saler AND u.updatedDate BETWEEN :dateFrom AND dateTo")
    public List<UpworkBid> getBySalerAndUpdatedDateBetween(@Param("saler") Saler saler,
            @Param("dateFrom") Date dateFrom,
            @Param("dateTo") Date dateTo);

    @Query(value = "SELECT u FROM UpworkBid u WHERE u.date BETWEEN :dateFrom AND dateTo")
    public List<UpworkBid> getAllBetweenDate(@Param("dateFrom") Date dateFrom,
            @Param("dateTo") Date dateTo);

}
