package com.example.task.repository;


import com.example.task.model.Tblemployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblemployeeRepository extends JpaRepository <Tblemployee,Long> {}

