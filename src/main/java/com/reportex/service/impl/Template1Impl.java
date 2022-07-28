package com.reportex.service.impl;

import com.reportex.entity.Template1;
import com.reportex.service.Template1Service;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class Template1Impl implements Template1Service {

    @PersistenceContext
    EntityManager em;


    @Override
    @Transactional
    public List<Template1> getTemp_1_2(String rowCode, String colCode, Date dt) {
        StoredProcedureQuery spq = em.createNamedStoredProcedureQuery("template1.temp_1_2");
        spq.setParameter(2, rowCode);
        spq.setParameter(3, colCode);
        spq.setParameter(4, dt);
        spq.execute();
        return spq.getResultList();
    }
}
