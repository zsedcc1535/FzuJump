package com.Ambition.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Description: 员工
 * @Author: Ambition
 * @Date: 2022/07/31 15:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    /**
     * 0-女
     * 1-男
     */
    private Integer gender;
    private Department department;
    private Date birth;



}
