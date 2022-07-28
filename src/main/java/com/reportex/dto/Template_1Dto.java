package com.reportex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Template_1Dto {
    private Integer id;
    private Integer srcId;
    private String srcNm;
    private Integer bankId;
    private String bankNm;
    private String rowCode;
    private String colCode;
    private Integer amount;
    private Integer yrMnthDy;
    private Date dt;
    private Integer isPhqe;
    private Date etlDtTm;
}
