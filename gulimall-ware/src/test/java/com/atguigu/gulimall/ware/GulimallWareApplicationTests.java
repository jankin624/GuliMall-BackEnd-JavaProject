package com.atguigu.gulimall.ware;

import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import com.atguigu.gulimall.ware.service.PurchaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWareApplicationTests {
    @Autowired
    private PurchaseService purchaseService;
    @Test
    void contextLoads() {
        PurchaseEntity purchase=new PurchaseEntity();
        purchase.setPhone("测试ware模块");
        purchaseService.save(purchase);
    }

}
