package com.hmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hmall.domain.dto.OrderDetailDTO;
import com.hmall.domain.po.Item;
import org.apache.ibatis.annotations.Update;

public interface ItemMapper extends BaseMapper<Item> {

    @Update("UPDATE item SET stock = stock - #{num} WHERE id = #{itemId}")
    void updateStock(OrderDetailDTO orderDetail);
}
