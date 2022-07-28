package com.reportex.controller;

import com.reportex.dto.Template_1Dto;
import com.reportex.entity.Template_1;
import com.reportex.service.Template_1Service;
import com.reportex.service.impl.Template_1Impl;
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
@RequestMapping("/user/template1")
@RequiredArgsConstructor
public class Template_1Controller {

    public final Template_1Service template_1Service;

    @GetMapping("/temp_1_2")
    public List<Template_1Dto> template1(@RequestParam(name = "rowCode", required = false) String rowCode,
                                         @RequestParam(name = "colCode", required = false) String colCode,
                                         @RequestParam(name = "dt") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dt) {
        return template_1Service.getTemp_1_2(rowCode, colCode, dt);
    }
}
