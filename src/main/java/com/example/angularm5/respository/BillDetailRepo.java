package com.example.angularm5.respository;

import com.example.angularm5.model.BillDetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BillDetailRepo extends PagingAndSortingRepository<BillDetail,Integer> {
    @Query("select b from BillDetail b where b.bill.id=:id")
    List<BillDetail> findAllByBill_Id(int id);




}
