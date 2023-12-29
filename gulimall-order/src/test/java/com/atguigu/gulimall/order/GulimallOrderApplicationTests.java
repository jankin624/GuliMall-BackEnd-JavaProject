package com.atguigu.gulimall.order;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.atguigu.gulimall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallOrderApplicationTests {
    @Autowired
    private OrderService orderService;

    @Test
    void contextLoads() {
        OrderEntity order=new OrderEntity();
        order.setOrderSn("889988");
        orderService.save(order);
    }

}
