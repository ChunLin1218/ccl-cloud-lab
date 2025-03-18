package com.ccl.ds.controller;

import com.ccl.ds.service.DeepSeekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ds")
public class DeepSeekController {
    @Autowired
    private DeepSeekService deepSeekService;

}
