package com.example.angularm5.Service.Impl;

import com.example.angularm5.Service.interfacePack.IBillDetailService;
import com.example.angularm5.model.BillDetail;
import com.example.angularm5.respository.BillDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillDetailServiceImpl implements IBillDetailService {
    @Autowired
    BillDetailRepo billDetailRepo;

    @Override
    public List<BillDetail> getAll() {
        return (List<BillDetail>) billDetailRepo.findAll();
    }

    public List<BillDetail> findAllByBill_Id(int id){
        return billDetailRepo.findAllByBill_Id(id);
    }

    @Override
    public BillDetail save(BillDetail billDetail) {
        return billDetailRepo.save(billDetail);
    }

    @Override
    public void delete(int id) {
        billDetailRepo.deleteById(id);
    }

    @Override
    public BillDetail findById(int id) {
        return billDetailRepo.findById(id).get();
    }
}
