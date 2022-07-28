package com.reportex.controller;

import com.reportex.entity.Template1;
import com.reportex.service.impl.Template1Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/template1")
public class Template1Controller {

    @Autowired
    public Template1Impl templateImpl1;

    @GetMapping("/temp_1_2")
    public List<Template1> template1(@RequestParam(name = "rowCode", required = false) String rowCode,
                                     @RequestParam(name = "colCode", required = false) String colCode,
                                     @RequestParam(name = "dt") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dt) {
        return templateImpl1.getTemp_1_2(rowCode, colCode, dt);
    }
}
