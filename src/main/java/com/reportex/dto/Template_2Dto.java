package com.reportex.dto;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Template_2Dto {
    private Integer id;
    private Integer srcId;
    private String srcNm;
    private Integer bankId;
    private String bankNm;
    private String rowCode;
    private String rowNm;
    private String colCode;
    private Integer amount;
    private Integer yrMnthDy;
    private Date dt;
    private Integer isPhqe;
    private Date etlDtTm;
}
