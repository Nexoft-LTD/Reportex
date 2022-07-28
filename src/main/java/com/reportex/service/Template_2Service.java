package com.reportex.service;

import com.reportex.dto.Template_2Dto;

import java.util.Date;
import java.util.List;

public interface Template_2Service {
    List<Template_2Dto> getTemp_2(String rowCode, String colCode, String rowNm, Date dt);
}
