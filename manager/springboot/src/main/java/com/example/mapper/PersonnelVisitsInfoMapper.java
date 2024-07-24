package com.example.mapper;

import com.example.entity.PersonnelVisitsInfo;

import java.util.List;

public interface PersonnelVisitsInfoMapper {
    /**
     * 新增
     */
    int insert(PersonnelVisitsInfo personnelVisitsInfo);

    /**
     * 删除
     */
    int deleteById(Integer id);

    /**
     * 修改
     */
    int updateById(PersonnelVisitsInfo personnelVisitsInfo);

    /**
     * 根据ID查询
     */
    PersonnelVisitsInfo selectById(Integer id);

    /**
     * 查询所有
     */
    List<PersonnelVisitsInfo> selectAll(PersonnelVisitsInfo personnelVisitsInfo);
}
