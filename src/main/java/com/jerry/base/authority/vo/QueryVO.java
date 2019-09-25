package com.jerry.base.authority.vo;

import lombok.*;

/**
 * Created by on 2019-08-19 21:50
 *
 * @Maintainance: jerryzshiyan@163.com
 * @author: Jerry
 * @Project: spring-jwt-security-demo
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QueryVO {

    private String keyword;

    private int pageNum;

    private int pageSize;
}
