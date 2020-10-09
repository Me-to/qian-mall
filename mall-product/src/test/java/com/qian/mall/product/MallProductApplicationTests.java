package com.qian.mall.product;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qian.mall.product.entity.BrandEntity;
import com.qian.mall.product.service.BrandService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
class MallProductApplicationTests {
//    @Autowired
//    BrandService brandService;
////@Autowired
////OSS oss;
//
//    @Test
//    public void contextLoads() {
////        BrandEntity brandEntity = new BrandEntity();
////        brandEntity.setName("qian");
////        brandService.save(brandEntity);
////
//        QueryWrapper<BrandEntity> queryWrapper=new QueryWrapper<>();
//        queryWrapper.lambda().eq(BrandEntity::getBrandId,"1");
//        List<BrandEntity> list=brandService.list(queryWrapper);
//        list.forEach((item)->{
//            System.out.println(item);
//        });
//
//    }
//    @Test
//    public void upload() throws IOException {
////// Endpoint以杭州为例，其它Region请按实际情况填写。
////        String endpoint = "https://oss-cn-zhangjiakou.aliyuncs.com";
////// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
////        String accessKeyId = "LTAI4GEPT8NWiyhQ3XHtbWRG";
////        String accessKeySecret = "o7gDXT6RfY8H9udojWZviW4ySGYbaI";
////      String simpleDateFormat=new SimpleDateFormat("yyy-MM-dd").format(new Date());
////        String bucketName = "qian-mall";
////// <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
////        String objectName = bucketName+"/";
//
////// 创建OSSClient实例。
////        oss = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//// 上传网络流。
//        InputStream inputStream = new FileInputStream("C:\\Users\\QIAN\\Pictures\\QQ图片20190204210639.jpg");
//        oss.putObject("qian-mall", "a.jpg", inputStream);
//// 关闭OSSClient。
//        oss.shutdown();
//    }

}
