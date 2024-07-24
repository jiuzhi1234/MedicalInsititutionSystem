package com.example.service;

import cn.hutool.core.date.DateUtil;
import com.example.entity.Account;
import com.example.entity.Medicine;
import com.example.entity.Notice;
import com.example.mapper.MedicineMapper;
import com.example.mapper.NoticeMapper;
import com.example.utils.TokenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MedicineService {
    @Resource
    private MedicineMapper medicineMapper;

    /**
     * 新增
     */
    public void add(Medicine medicine) {
        medicineMapper.insert(medicine);
    }

    /**
     * 删除
     */
    public void deleteById(Integer id) {
        medicineMapper.deleteById(id);
    }

    /**
     * 批量删除
     */
    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            medicineMapper.deleteById(id);
        }
    }

    /**
     * 修改
     */
    public void updateById(Medicine medicine) {
        medicineMapper.updateById(medicine);
    }

    /**
     * 根据ID查询
     */
    public Medicine selectById(Integer id) {
        return medicineMapper.selectById(id);
    }

    /**
     * 查询所有
     */
    public List<Medicine> selectAll(Medicine medicine) {
        return medicineMapper.selectAll(medicine);
    }

    /**
     * 分页查询
     */
    public PageInfo<Medicine> selectPage(Medicine medicine, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Medicine> list = medicineMapper.selectAll(medicine);
        return PageInfo.of(list);
    }
}
