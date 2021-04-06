package com.mukeshmahara.expensetracker.service;

import com.google.gson.JsonArray;
import com.mukeshmahara.expensetracker.model.Expense;
import com.mukeshmahara.expensetracker.repository.ExpenseRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    //    @Autowired
//    private SessionFactory sessionFactory;
    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public List<Expense> getAllExpense() {
        List<Expense> list = expenseRepository.findAll();
        return list;
    }

    @Override
    public boolean addExpense(Expense expense) {
        boolean b = false;

        if (expense != null) {
            expenseRepository.save(expense);
            System.out.println("Expense added successfully");
            b = true;
        }
        return b;
    }

    @Override
    public boolean writeDataInJson(int amount, String date) throws JSONException, IOException {

        JSONObject obj = new JSONObject();


        JsonArray jsonArray = new JsonArray();
        JsonArray jsonArray1 = new JsonArray();
        jsonArray1.add(amount);
        jsonArray1.add(date);
        jsonArray.add(jsonArray1);

        obj.put("Date and Amount",jsonArray);
        System.out.println(jsonArray.toString());

//        System.out.println(Files.write(Paths.get("index.json"), obj.toString().getBytes()));
        FileWriter file = new FileWriter("D:/My Works/Java Work/Spring boot Project/src/main/resources/static/index.json",true);
        Scanner input = new Scanner(new File("D:/My Works/Java Work/Spring boot Project/src/main/resources/static/index.json"));
        System.out.println(input.hasNext()-1);
        file.write(","+jsonArray1.toString());

        file.close();



        return false;
    }


}
