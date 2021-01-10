package com.mukeshmahara.crudapplicaiton.controller;

import com.mukeshmahara.crudapplicaiton.dao.TicketDao;
import com.mukeshmahara.crudapplicaiton.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/")
//@RequestMapping("/ticket")

@Controller
class homeController {


    @RequestMapping("/")
    public String dashboard() {
        return "dashboard.html";
    }

    @RequestMapping( path= "/bookTicket",method = RequestMethod.POST)
//    @ModelAttribute
    public String bookTickets(@RequestParam("id") int id,@RequestParam("catagory") String catagory,@RequestParam("amount") int amount ,Model model) {
        model.addAttribute("id",id);

        model.addAttribute("catagory",catagory);
        model.addAttribute("amount",amount);

        return "dashboard.html";
    }
}





















@RestController
public class TicketController {

    @Autowired

    TicketDao dao;


    @PostMapping("/bookTickets")
    public String bookTicket(@RequestBody Ticket ticket) {
        dao.save(ticket);


        return "You have Booked " + dao.count()+" tickets";

    }

    @GetMapping("/getTickets")
    public List<Ticket> getTicket() {
        return (List<Ticket>) dao.findAll();
    }

}
