package com.mukeshmahara.expensetracker.service;

import com.mukeshmahara.expensetracker.model.Expense;
import com.mukeshmahara.expensetracker.repository.ExpenseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{
//    @Autowired
//    private SessionFactory sessionFactory;
    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public List<Expense> getAllExpense() {
    List<Expense> list= expenseRepository.findAll();
        return list;
    }

    @Override
    public boolean addExpense(Expense expense) {
        boolean b= false;

        if(expense!=null){
            expenseRepository.save(expense);
            System.out.println("Expense added successfully");
            b=true;
        }
        return b;
    }
}
