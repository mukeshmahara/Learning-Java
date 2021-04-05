package com.mukeshmahara.expensetracker.service;

import com.mukeshmahara.expensetracker.model.Expense;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ExpenseService {
    List<Expense> getAllExpense();
    boolean addExpense(Expense expense);
}
