package com.example.service;

import com.example.entity.People;
import com.example.mapper.PeopleMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PeopleService {
    @Resource
    private PeopleMapper peopleMapper;

    /**
     * 新增
     */
    public void add(People people) {
        peopleMapper.insert(people);
    }

    /**
     * 删除
     */
    public void deleteById(Integer id) {
        peopleMapper.deleteById(id);
    }

    /**
     * 批量删除
     */
    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            peopleMapper.deleteById(id);
        }
    }

    /**
     * 修改
     */
    public void updateById(People people) {
        peopleMapper.updateById(people);
    }

    /**
     * 根据ID查询
     */
    public People selectById(Integer id) {
        return peopleMapper.selectById(id);
    }

    /**
     * 查询所有
     */
    public List<People> selectAll(People people) {
        return peopleMapper.selectAll(people);
    }

    /**
     * 分页查询
     */
    public PageInfo<People> selectPage(People people, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<People> list = peopleMapper.selectAll(people);
        return PageInfo.of(list);
    }
}
