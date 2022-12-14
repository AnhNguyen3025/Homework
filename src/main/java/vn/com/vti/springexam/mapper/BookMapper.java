package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.Book;
import vn.com.vti.springexam.entity.BookExample;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    long countByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int deleteByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int deleteByPrimaryKey(String bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int insertSelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    List<Book> selectByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    Book selectByPrimaryKey(String bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByPrimaryKey(Book record);
}