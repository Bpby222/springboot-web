package com.bpby.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Long id;//实体类的唯一标志
    private String name;//名称
    private String email;//邮箱

}
