package com.zvikag.aopdemo.controller;

import com.zvikag.aopdemo.aspects.LogInvocationTime;
import com.zvikag.aopdemo.service.BusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BusinessTestController {

    private final BusinessService businessService;


    @GetMapping("/hello")
    public String getDataFromService()
    {
        return businessService.getHelloFromService();
    }


}
