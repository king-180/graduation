package io.renren.modules.book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.book.dao.OrderDao;
import io.renren.modules.book.entity.OrderEntity;
import io.renren.modules.book.service.OrderService;


@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, OrderEntity> implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderEntity> page = this.page(
                new Query<OrderEntity>().getPage(params),
                new QueryWrapper<OrderEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public boolean save(OrderEntity entity) {
        String id = UUID.randomUUID().toString().substring(0, 20);
        entity.setId(id);
        Date createTime = new Date();
        entity.setCreateTime(createTime);
        entity.setIsDelete(0);
        log.debug("entity --> " + entity);
        int result = orderDao.insert(entity);
        return result > 0;
    }

}