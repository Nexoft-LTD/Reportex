package com.reportex.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "template_2")
@Data
@NamedStoredProcedureQuery(name = "template_2.temp_2",
        procedureName = "f_temp_2",
        resultClasses = {Template_2.class},
        parameters = {@StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, type = void.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class)})
public class Template_2 implements Serializable {
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

    @Column(name = "row_nm", length = 50)
    private String rowNm;

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
