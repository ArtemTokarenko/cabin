package com.cabin.dataBase;

import com.cabin.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ультрамар on 21.06.2016.
 */
@Repository
public interface ContactDAO extends JpaRepository<Contact, Integer> {

    //    public void addContact(Contact contact);
    //
    //    public List<Contact> listContact();
    //
    //    public void removeContact(Integer id);

    @Query(value = "SELECT v FROM Contact v WHERE v.firstname LIKE :query ")
    public List<Contact> getContactByFirstname(@Param("query") String query);

}
