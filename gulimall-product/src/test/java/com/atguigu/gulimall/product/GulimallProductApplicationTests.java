package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brand=new BrandEntity();
        brand.setName("gulimall-product模块测试mybatis-plus");
        brandService.save(brand);
    }

}
