package com.example.service;

import com.example.entity.PersonnelVisitsInfo;
import com.example.mapper.PersonnelVisitsInfoMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;
import java.util.List;

public class PersonnelVisitsInfoService {
    @Resource
    private PersonnelVisitsInfoMapper personnelVisitsInfoMapper;

    /**
     * 新增
     */
    public void add(PersonnelVisitsInfo personnelVisitsInfo) {
        personnelVisitsInfoMapper.insert(personnelVisitsInfo);
    }

    /**
     * 删除
     */
    public void deleteById(Integer id) {
        personnelVisitsInfoMapper.deleteById(id);
    }

    /**
     * 批量删除
     */
    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            personnelVisitsInfoMapper.deleteById(id);
        }
    }

    /**
     * 修改
     */
    public void updateById(PersonnelVisitsInfo personnelVisitsInfo) {
        personnelVisitsInfoMapper.updateById(personnelVisitsInfo);
    }

    /**
     * 根据ID查询
     */
    public PersonnelVisitsInfo selectById(Integer id) {
        return personnelVisitsInfoMapper.selectById(id);
    }

    /**
     * 查询所有
     */
    public List<PersonnelVisitsInfo> selectAll(PersonnelVisitsInfo personnelVisitsInfo) {
        return personnelVisitsInfoMapper.selectAll(personnelVisitsInfo);
    }

    /**
     * 分页查询
     */
    public PageInfo<PersonnelVisitsInfo> selectPage(PersonnelVisitsInfo personnelVisitsInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PersonnelVisitsInfo> list = personnelVisitsInfoMapper.selectAll(personnelVisitsInfo);
        return PageInfo.of(list);
    }
}
