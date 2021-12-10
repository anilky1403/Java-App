package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class fetchImpl implements fetch {

    @Autowired
    public PerformAction performAction;

    @Override
    public String getDetails() {
        return performAction.doThings("!!");
    }
}
