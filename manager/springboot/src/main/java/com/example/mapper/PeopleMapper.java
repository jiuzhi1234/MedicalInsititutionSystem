package com.example.mapper;

import com.example.entity.People;
import java.util.List;

public interface PeopleMapper {
    /**
     * 新增
     */
    int insert(People people);

    /**
     * 删除
     */
    int deleteById(Integer id);

    /**
     * 修改
     */
    int updateById(People people);

    /**
     * 根据ID查询
     */
    People selectById(Integer id);

    /**
     * 查询所有
     */
    List<People> selectAll(People people);
}
