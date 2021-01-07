package io.renren.modules.book.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author wangxing
 * @email wangxing@gmail.com
 * @date 2021-01-07 17:29:02
 */
@Data
@TableName("t_order")
public class OrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    private String id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 订单金额
     */
    private BigDecimal money;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 逻辑删除
     */
    private Integer isDelete;
    /**
     * 图书id
     */
    private Long bookId;

}
