package com.reportex.service.impl;

import com.reportex.dto.Template_1Dto;
import com.reportex.entity.Template_1;
import com.reportex.repository.repo.Template_1Repo;
import com.reportex.service.Template_1Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Template_1Impl implements Template_1Service {

    @PersistenceContext
    EntityManager em;

    private final Template_1Repo template_1Repo = new Template_1Repo();

    @Override
    @Transactional
    public List<Template_1Dto> getTemp_1_2(String rowCode, String colCode, Date dt) {
        StoredProcedureQuery spq = em.createNamedStoredProcedureQuery("template1.temp_1_2");
        spq.setParameter(2, rowCode);
        spq.setParameter(3, colCode);
        spq.setParameter(4, dt);
        spq.execute();
        List<Template_1> template_1List = spq.getResultList();

        List<Template_1Dto> template_1DtoList = new ArrayList<>();
        for (Template_1 template_1 : template_1List) {
            Template_1Dto template_1Dto = template_1Repo.convert(template_1);
            template_1DtoList.add(template_1Dto);
        }

        return template_1DtoList;
    }
}
