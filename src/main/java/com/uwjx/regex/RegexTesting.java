package com.uwjx.regex;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class RegexTesting {

    @PostConstruct
    public void run(){
        log.warn("开始");
    }
}
