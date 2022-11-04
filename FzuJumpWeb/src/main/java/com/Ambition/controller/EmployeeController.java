package com.Ambition.controller;

import com.Ambition.dao.DepartmentDao;
import com.Ambition.dao.EmployeeDao;
import com.Ambition.pojo.Department;
import com.Ambition.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;


@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping(value = "/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getEmployees();
        model.addAttribute("emps", employees);
        return "emp/list";

    }

    @GetMapping("/emp")
    public String toAdd(Model model) {
        //查询所有机构信息
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String add(Employee employee) {
        employeeDao.add(employee);
        return "redirect:/emps";

    }

    @RequestMapping("/update/{id}")
    public String toUpdate(@PathVariable("id") int id, Model model) {
        Employee employee = employeeDao.getEmployeeById(id);
        model.addAttribute("employee", employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/update";
    }

    @PostMapping("/update")
    public String toUpdate(Employee employee) {
        employeeDao.update(employee);
        return "redirect:/emps";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        employeeDao.removeById(id);
        return "redirect:/emps";
    }
}
