package com.cris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 员工表对应的实体
 *
 * @author zc-cris
 * @version 1.0
 **/
@Table(name = "emps")
@SuppressWarnings("unused")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Emp {
    @Id
    private Integer id;
    private String name;
    private Integer deptId;
    private String countryName;
}
