package com.qian.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qian.common.utils.PageUtils;
import com.qian.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zhangqian
 * @email 694656210@qq.com
 * @date 2020-09-19 14:06:00
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

