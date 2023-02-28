package com.example.angularm5.controller;

import com.example.angularm5.Service.Impl.BillServiceImpl;
import com.example.angularm5.model.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/bill")
public class BillController {
    @Autowired
    BillServiceImpl billService;

    @GetMapping("/all")
    public List<Bill> list(){
        return billService.getAll();
    }

    @GetMapping("/byUsername/{username}")
    public List<Bill> listUsername(@PathVariable String username){
        return billService.findAllByClient_username(username);
    }

    @PostMapping
    public Bill save(@RequestBody Bill bill){
        return billService.save(bill);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        billService.delete(id);
    }



}
