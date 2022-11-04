package com.Ambition.dao;

import com.Ambition.pojo.Department;
import com.Ambition.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 员工dao
 * @Author: Ambition
 * @Date: 2022/07/31 15:47
 */

@Repository
public class EmployeeDao {

    @Autowired
    private DepartmentDao departments;

    private static Map<Integer, Employee> employeeMap = null;

    static {
        employeeMap = new HashMap<>();

        employeeMap.put(1001, new Employee(1001, "AA", "a123456@qq.com", 0, new Department(101, "教学部"), new Date()));
        employeeMap.put(1002, new Employee(1002, "BB", "b123456@qq.com", 1, new Department(102, "市场部"), new Date()));
        employeeMap.put(1003, new Employee(1003, "CC", "c123456@qq.com", 0, new Department(103, "教研部"), new Date()));
        employeeMap.put(1004, new Employee(1004, "DD", "d123456@qq.com", 1, new Department(104, "运营部"), new Date()));
        employeeMap.put(1005, new Employee(1005, "EE", "e123456@qq.com", 0, new Department(105, "后勤部"), new Date()));

    }

    /**
     * 主键自增
     */
    private static Integer initId = 1006;


    /**
     * 增加一个员工
     */
    public void add(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        //设置部门 入参中部门信息只传部门id
        employee.setDepartment(departments.getDepartmentById(employee.getDepartment().getId()));
        employeeMap.put(employee.getId(), employee);
    }

    /**
     * 修改
     */
    public void update(Employee employee) {
        //先校验当前员工和机构是否存在
        Integer id = employee.getId();
        Employee employeeOld = employeeMap.get(id);
        if (employeeOld == null) {
            return;
        }
        Department department = departments.getDepartmentById(employee.getDepartment().getId());
        if (department == null) {
            return;
        }
        //找到对应的机构
        employee.setDepartment(department);
        employeeMap.put(id, employee);
    }


    /**
     * 查询全部员工信息
     */
    public Collection<Employee> getEmployees() {
        return employeeMap.values();
    }

    /**
     * 通过id查询员工信息
     */
    public Employee getEmployeeById(Integer id) {
        return employeeMap.get(id);
    }

    /**
     * 删除一个员工
     */
    public void removeById(Integer id) {
        employeeMap.remove(id);
    }

}
