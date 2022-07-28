package com.reportex.service;

import com.reportex.dto.Template_1Dto;

import java.util.Date;
import java.util.List;

public interface Template_1Service {
    List<Template_1Dto> getTemp_1_2(String rowCode, String colCode, Date dt);
}
