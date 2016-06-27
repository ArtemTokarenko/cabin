package com.cabin.dataBase;

import com.cabin.entity.Saler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ультрамар on 21.06.2016.
 */
@Repository
public interface SalerDAO extends JpaRepository<Saler, Integer> {
//
//    public List<Saler> showSales();
//
//    public void addSaler();
//
//    public void removeSaler();
}
