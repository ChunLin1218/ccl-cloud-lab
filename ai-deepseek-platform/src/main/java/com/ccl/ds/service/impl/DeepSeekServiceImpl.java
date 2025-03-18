package com.ccl.ds.service.impl;

import com.ccl.ds.service.DeepSeekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeepSeekServiceImpl implements DeepSeekService {

    @Value("${deepseek.api.key}")
    private String dsApiKey;
    @Value("${deepseek.api.url}")
    private String dsApiUrl;

    @Autowired
    private RestTemplate restTemplate;

    public void gtxt() {

    }
}
