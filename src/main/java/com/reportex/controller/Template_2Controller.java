package com.reportex.controller;

import com.reportex.dto.Template_2Dto;
import com.reportex.service.Template_2Service;
import com.reportex.service.impl.Template_2Impl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user/template_2")
@RequiredArgsConstructor
public class Template_2Controller {

    public final Template_2Service template_2Service;

    @GetMapping("/temp_2")
    public List<Template_2Dto> getTemp_2(@RequestParam(name = "rowCode", required = false) String rowCode,
                                         @RequestParam(name = "colCode", required = false) String colCode,
                                         @RequestParam(name = "rowNm", required = false) String rowNm,
                                         @RequestParam(name = "dt") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dt) {
        return template_2Service.getTemp_2(rowCode, colCode, rowNm, dt);
    }
}
