package com.example.task.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tblemployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Employee_id;

    private String Employee_first_name;

    private String Employee_last_name;

    private String Employee_Address;

    private String Employee_emailID;

    private int Employee_department_ID;

    private Date Employee_Joining_date;

    public Tblemployee() {}

    public Tblemployee(Long employee_id, String employee_first_name, String employee_last_name, String employee_Address, String employee_emailID, int employee_department_ID, Date employee_Joining_date) {
        Employee_id = employee_id;
        Employee_first_name = employee_first_name;
        Employee_last_name = employee_last_name;
        Employee_Address = employee_Address;
        Employee_emailID = employee_emailID;
        Employee_department_ID = employee_department_ID;
        Employee_Joining_date = employee_Joining_date;
    }

    public Tblemployee(String employee_first_name, String employee_last_name, String employee_Address, String employee_emailID, int employee_department_ID, Date employee_Joining_date) {
        Employee_first_name = employee_first_name;
        Employee_last_name = employee_last_name;
        Employee_Address = employee_Address;
        Employee_emailID = employee_emailID;
        Employee_department_ID = employee_department_ID;
        Employee_Joining_date = employee_Joining_date;
    }

    public Long getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        Employee_id = employee_id;
    }

    public String getEmployee_first_name() {
        return Employee_first_name;
    }

    public void setEmployee_first_name(String employee_first_name) {
        Employee_first_name = employee_first_name;
    }

    public String getEmployee_last_name() {
        return Employee_last_name;
    }

    public void setEmployee_last_name(String employee_last_name) {
        Employee_last_name = employee_last_name;
    }

    public String getEmployee_Address() {
        return Employee_Address;
    }

    public void setEmployee_Address(String employee_Address) {
        Employee_Address = employee_Address;
    }

    public String getEmployee_emailID() {
        return Employee_emailID;
    }

    public void setEmployee_emailID(String employee_emailID) {
        Employee_emailID = employee_emailID;
    }

    public int getEmployee_department_ID() {
        return Employee_department_ID;
    }

    public void setEmployee_department_ID(int employee_department_ID) {
        Employee_department_ID = employee_department_ID;
    }

    public Date getEmployee_Joining_date() {
        return Employee_Joining_date;
    }

    public void setEmployee_Joining_date(Date employee_Joining_date) {
        Employee_Joining_date = employee_Joining_date;
    }
}