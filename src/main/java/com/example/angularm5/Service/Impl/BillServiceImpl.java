package com.example.angularm5.Service.Impl;

import com.example.angularm5.Service.interfacePack.IBillService;
import com.example.angularm5.model.Bill;
import com.example.angularm5.respository.BillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillServiceImpl implements IBillService {
    @Autowired
    BillRepo billRepo;

    @Override
    public List<Bill> getAll() {
        return (List<Bill>) billRepo.findAll();
    }

    public Page<Bill> findAll(Pageable pageable) {
        return billRepo.findAll(pageable);
    }

    @Override
    public Bill save(Bill bill) {
        return billRepo.save(bill);
    }

    @Override
    public void delete(int id) {
        billRepo.deleteById(id);
    }

    @Override
    public Bill findById(int id) {
        return billRepo.findById(id).get();
    }

    public List<Bill> getAllByClient_id(int id){
        return billRepo.getAllByClient_Id(id);
    }

    public List<Bill> findAllByClient_username(String username){
        return billRepo.getAllByClient_Username(username);
    }
}
