package com.example.task.controller;

import com.example.task.dao.NewEmpoyee;
import com.example.task.model.Tblemployee;
import com.example.task.repository.TblemployeeRepository;
import com.example.task.service.TblemployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TblemployeeController {
    @Autowired
    TblemployeeRepository nRepo;
    private TblemployeeServices tblemployeeServices;

    public TblemployeeController(TblemployeeServices tblemployeeServices) {
        this.tblemployeeServices = tblemployeeServices;
    }

    @GetMapping("/employee")
    public List getTblemployee(){
        return tblemployeeServices.getTblemployees();
    }

    @PostMapping("/employee")
    public Tblemployee saveNew(@RequestBody NewEmpoyee newEmpoyee)
    {
          Tblemployee tblemployee = null;
          tblemployee = new Tblemployee(newEmpoyee.getEmployee_first_name(),newEmpoyee.getEmployee_last_name(),newEmpoyee.getEmployee_Address(),newEmpoyee.getEmployee_emailID(),newEmpoyee.getEmployee_department_ID(),newEmpoyee.getEmployee_Joining_date());
          // public Tblemployee saveNew(){
//        Tblemployee neew = new Tblemployee("rajesh", "rajesh", null, null, 9,null);
//        return nRepo.save(neew);
        return nRepo.save(tblemployee);
    }
    @PutMapping("/employee/update")
    public Tblemployee updateemployee(@RequestBody NewEmpoyee newEmpoyee){
        Optional<Tblemployee> f = nRepo.findById(newEmpoyee.getEmployee_id());
        Tblemployee tblemployee = f.get();
        tblemployee.setEmployee_first_name(newEmpoyee.getEmployee_first_name());
        tblemployee.setEmployee_last_name(newEmpoyee.getEmployee_last_name());
        tblemployee.setEmployee_Address(newEmpoyee.getEmployee_Address());
        tblemployee.setEmployee_emailID(newEmpoyee.getEmployee_emailID());
        tblemployee.setEmployee_department_ID(newEmpoyee.getEmployee_department_ID());
        tblemployee.setEmployee_Joining_date(newEmpoyee.getEmployee_Joining_date());
        return nRepo.save(tblemployee);
    }
    @DeleteMapping("/employee/delete")
    public void delemplo(@RequestBody NewEmpoyee newEmpoyee){
        Optional<Tblemployee> d = nRepo.findById(newEmpoyee.getEmployee_id());
        Tblemployee tblemployee = d.get();
        nRepo.delete(tblemployee);
    }
}
