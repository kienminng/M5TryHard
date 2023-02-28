package com.example.angularm5.respository;

import com.example.angularm5.model.Bill;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BillRepo extends PagingAndSortingRepository<Bill,Integer> {
    @Query("select b from Bill b where b.client.id =: id")
    List<Bill> getAllByClient_Id(int id);

    @Query("select b from Bill b where b.client.username=:username")
    List<Bill> getAllByClient_Username(String username);
}
