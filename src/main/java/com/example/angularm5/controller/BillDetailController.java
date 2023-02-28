package com.example.angularm5.controller;

import com.example.angularm5.Service.Impl.BillDetailServiceImpl;
import com.example.angularm5.model.BillDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/billDetail")
public class BillDetailController {
    @Autowired
    BillDetailServiceImpl billDetailService;

    @GetMapping("/listByBill_id/{id}")
    public List<BillDetail> getAllByBill_Id(@PathVariable int id){
        return billDetailService.findAllByBill_Id(id);
    }

    @PostMapping
    public BillDetail save(@RequestBody BillDetail billDetail){
        return billDetailService.save(billDetail);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        billDetailService.delete(id);
    }


}
