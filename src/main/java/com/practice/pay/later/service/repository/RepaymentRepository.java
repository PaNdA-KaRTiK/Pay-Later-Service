package com.practice.pay.later.service.repository;

import com.practice.pay.later.service.model.Repayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface RepaymentRepository extends JpaRepository<Repayment,String> {

    @Query("SELECT " +
            "repaymentTransactionId, amount, transactionDate, status " +
            "FROM Repayment")
    public List<ArrayList> getAllRepayments();

}