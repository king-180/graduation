package io.renren.modules.book.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.book.dao.BuserDao;
import io.renren.modules.book.entity.BuserEntity;
import io.renren.modules.book.service.BuserService;


@Service("buserService")
public class BuserServiceImpl extends ServiceImpl<BuserDao, BuserEntity> implements BuserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BuserEntity> page = this.page(
                new Query<BuserEntity>().getPage(params),
                new QueryWrapper<BuserEntity>()
        );

        return new PageUtils(page);
    }

}