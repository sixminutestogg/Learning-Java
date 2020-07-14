package com.imooc.springboot.log.service;


import com.imooc.springboot.log.SpringbootApplication;
import com.imooc.springboot.log.service.TransactionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class TransactionServiceTest {

    @Autowired
    private TransactionService transactionService;

    @Test
    public void a() {
        transactionService.batchInsert();
    }
}