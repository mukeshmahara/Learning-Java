package com.mukeshmahara.crudapplicaiton.dao;

import com.mukeshmahara.crudapplicaiton.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketDao extends CrudRepository<Ticket,Integer> {

}
