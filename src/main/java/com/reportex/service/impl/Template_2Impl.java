package com.reportex.service.impl;

import com.reportex.dto.Template_2Dto;
import com.reportex.entity.Template_2;
import com.reportex.repository.repo.Template_2Repo;
import com.reportex.service.Template_2Service;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Template_2Impl implements Template_2Service {

    @PersistenceContext
    EntityManager em;

    private final Template_2Repo template_2Repo = new Template_2Repo();

    @Override
    @Transactional
    public List<Template_2Dto> getTemp_2(String rowCode, String colCode, String rowNm, Date dt) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Integer integerDate = new Integer(simpleDateFormat.format(dt));

        StoredProcedureQuery spq = em.createNamedStoredProcedureQuery("template_2.temp_2");
        spq.setParameter(2, rowCode);
        spq.setParameter(3, colCode);
        spq.setParameter(4, rowNm);
        spq.setParameter(5, integerDate);
        spq.execute();
        List<Template_2> template_2List = spq.getResultList();

        List<Template_2Dto> template_2DtoList = new ArrayList<>();
        for (Template_2 template_2 : template_2List) {
            if (template_2 != null) {
                Template_2Dto template_2Dto = template_2Repo.convert(template_2);
                template_2DtoList.add(template_2Dto);
            }
        }

        return template_2DtoList;
    }
}
