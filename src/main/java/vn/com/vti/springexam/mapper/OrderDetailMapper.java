package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.OrderDetail;
import vn.com.vti.springexam.entity.OrderDetailExample;
import vn.com.vti.springexam.entity.OrderDetailKey;

public interface OrderDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    long countByExample(OrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int deleteByExample(OrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int deleteByPrimaryKey(OrderDetailKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int insert(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int insertSelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    List<OrderDetail> selectByExample(OrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    OrderDetail selectByPrimaryKey(OrderDetailKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByPrimaryKeySelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByPrimaryKey(OrderDetail record);
}