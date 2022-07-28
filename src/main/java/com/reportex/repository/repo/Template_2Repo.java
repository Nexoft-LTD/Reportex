package com.reportex.repository.repo;

import com.reportex.dto.Template_2Dto;
import com.reportex.entity.Template_2;

public class Template_2Repo {
    public Template_2Dto convert(Template_2 template_2) {
        Template_2Dto template_2Dto = new Template_2Dto();
        template_2Dto.setId(template_2.getId());
        template_2Dto.setSrcId(template_2.getSrcId());
        template_2Dto.setSrcNm(template_2.getSrcNm());
        template_2Dto.setBankId(template_2.getBankId());
        template_2Dto.setBankNm(template_2.getBankNm());
        template_2Dto.setRowCode(template_2.getRowCode());
        template_2Dto.setRowNm(template_2.getRowNm());
        template_2Dto.setColCode(template_2.getColCode());
        template_2Dto.setAmount(template_2.getAmount());
        template_2Dto.setYrMnthDy(template_2.getYrMnthDy());
        template_2Dto.setDt(template_2.getDt());
        template_2Dto.setIsPhqe(template_2.getIsPhqe());
        template_2Dto.setEtlDtTm(template_2.getEtlDtTm());
        return template_2Dto;
    }
}
