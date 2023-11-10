package com.example.springboot_demo.config;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class TestRunner implements ApplicationRunner {

    private final DataSource dataSource;


    /*
    * H2 DB연결 테스트
    * */

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Connection connection = dataSource.getConnection();
        log.info("DBCP : {} ", dataSource.getClass());
        log.info("URL : {}", connection.getMetaData().getURL());
        log.info("username : {}",connection.getMetaData().getUserName());
    }
}
