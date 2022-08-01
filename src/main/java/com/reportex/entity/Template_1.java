package com.reportex.entity;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "template_1")
@Data
@NamedStoredProcedureQuery(name = "template_1.temp_1_2",
        procedureName = "f_temp_1_2",
        resultClasses = {Template_1.class},
        parameters = {@StoredProcedureParameter(type = void.class, mode = ParameterMode.REF_CURSOR),
                @StoredProcedureParameter(type = String.class, mode = ParameterMode.IN),
                @StoredProcedureParameter(type = String.class, mode = ParameterMode.IN),
                @StoredProcedureParameter(type = Integer.class, mode = ParameterMode.IN)})
public class Template_1 implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "src_id")
    private Integer srcId;

    @Column(name = "src_nm", length = 20)
    private String srcNm;

    @Column(name = "bank_id")
    private Integer bankId;

    @Column(name = "bank_nm", length = 100)
    private String bankNm;

    @Column(name = "row_code", length = 50)
    private String rowCode;

    @Column(name = "col_code", length = 50)
    private String colCode;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "yr_mnth_dy")
    private Integer yrMnthDy;

    @Column(name = "dt")
    private Date dt;

    @Column(name = "is_phqe")
    private Integer isPhqe;

    @Column(name = "etl_dt_tm")
    private Date etlDtTm;
}
