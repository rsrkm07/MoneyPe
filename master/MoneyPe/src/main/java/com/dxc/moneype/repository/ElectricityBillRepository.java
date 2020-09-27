package com.dxc.moneype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.moneype.entities.ElectricityBill;
@Repository
public interface ElectricityBillRepository extends JpaRepository<ElectricityBill, String> {

}
