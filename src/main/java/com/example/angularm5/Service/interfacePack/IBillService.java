package com.example.angularm5.Service.interfacePack;


import com.example.angularm5.Service.CrudService;
import com.example.angularm5.model.Bill;

import java.util.List;

public interface IBillService extends CrudService<Bill> {
    @Override
    List<Bill> getAll();

    @Override
    Bill save(Bill bill);

    @Override
    void delete(int id);

    @Override
    Bill findById(int id);
}
