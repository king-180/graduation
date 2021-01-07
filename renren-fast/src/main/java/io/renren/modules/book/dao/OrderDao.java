package io.renren.modules.book.dao;

import io.renren.modules.book.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author wangxing
 * @email wangxing@gmail.com
 * @date 2021-01-07 17:29:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

    int insert(OrderEntity entity);
}
