package com.yk.mapper;

import com.yk.entity.Article;
import java.util.List;

public interface ArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated Tue Apr 02 23:34:13 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated Tue Apr 02 23:34:13 CST 2024
     */
    int insert(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated Tue Apr 02 23:34:13 CST 2024
     */
    Article selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated Tue Apr 02 23:34:13 CST 2024
     */
    List<Article> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated Tue Apr 02 23:34:13 CST 2024
     */
    int updateByPrimaryKey(Article record);
}