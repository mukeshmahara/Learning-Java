package com.mukeshmahara.crudapplicaiton.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int amount;
    private String catagory;
}
