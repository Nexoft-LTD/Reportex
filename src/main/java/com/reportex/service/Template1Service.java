package com.reportex.service;

import com.reportex.entity.Template1;

import java.util.Date;
import java.util.List;

public interface Template1Service {
    List<Template1> getTemp_1_2(String rowCode, String colCode, Date dt);
}
