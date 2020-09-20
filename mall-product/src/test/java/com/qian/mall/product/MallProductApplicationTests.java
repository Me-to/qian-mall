package com.qian.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qian.mall.product.entity.BrandEntity;
import com.qian.mall.product.service.BrandService;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class MallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("qian");
//        brandService.save(brandEntity);
//
        QueryWrapper<BrandEntity> queryWrapper=new QueryWrapper<>();
        queryWrapper.lambda().eq(BrandEntity::getBrandId,"1");
        List<BrandEntity> list=brandService.list(queryWrapper);
        list.forEach((item)->{
            System.out.println(item);
        });

    }

}
