package com.zvikag.aopdemo.service;

import com.zvikag.aopdemo.aspects.LogInvocationTime;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BusinessServiceImpl implements BusinessService {
    private static final long randomFactor = 2329898731627l;
    @Override
    @LogInvocationTime
    public String getHelloFromService() {

        long randomNumber = (long) (Math.random() * randomFactor);
        try {
            Thread.sleep(randomNumber % 10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello from BusinessServiceImpl, time is " + LocalDateTime.now();

    }
}
