package com.example.task.service;

import com.example.task.repository.TblemployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblemployeeServices {
    private TblemployeeRepository tblemployeeRepository;

    public TblemployeeServices(TblemployeeRepository tblemployeeRepository) {
        this.tblemployeeRepository = tblemployeeRepository;
    }

    public List getTblemployees(){
        return tblemployeeRepository.findAll();
    }
}
