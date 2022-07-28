package com.reportex.repository.repo;

import com.reportex.dto.Template_1Dto;
import com.reportex.entity.Template_1;

public class Template_1Repo {
    public Template_1Dto convert(Template_1 template_1) {
        Template_1Dto template_1Dto = new Template_1Dto();
        template_1Dto.setId(template_1.getId());
        template_1Dto.setSrcId(template_1.getSrcId());
        template_1Dto.setSrcNm(template_1.getSrcNm());
        template_1Dto.setBankId(template_1.getBankId());
        template_1Dto.setBankNm(template_1.getBankNm());
        template_1Dto.setRowCode(template_1.getRowCode());
        template_1Dto.setColCode(template_1.getColCode());
        template_1Dto.setAmount(template_1.getAmount());
        template_1Dto.setYrMnthDy(template_1.getYrMnthDy());
        template_1Dto.setDt(template_1.getDt());
        template_1Dto.setIsPhqe(template_1.getIsPhqe());
        template_1Dto.setEtlDtTm(template_1.getEtlDtTm());
        return template_1Dto;
    }
}
