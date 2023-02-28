package com.example.angularm5.Service.interfacePack;

import com.example.angularm5.Service.CrudService;
import com.example.angularm5.model.BillDetail;

import java.util.List;

public interface IBillDetailService extends CrudService<BillDetail> {
    @Override
    List<BillDetail> getAll();

    @Override
    BillDetail save(BillDetail billDetail);

    @Override
    void delete(int id);

    @Override
    BillDetail findById(int id);
}
