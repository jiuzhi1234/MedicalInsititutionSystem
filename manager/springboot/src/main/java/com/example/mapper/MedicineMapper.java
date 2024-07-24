package com.example.mapper;

import com.example.entity.Medicine;
import java.util.List;

public interface MedicineMapper {
    /**
     * 新增
     */
    int insert(Medicine medicine);

    /**
     * 删除
     */
    int deleteById(Integer id);

    /**
     * 修改
     */
    int updateById(Medicine medicine);

    /**
     * 根据ID查询
     */
    Medicine selectById(Integer id);

    /**
     * 查询所有
     */
    List<Medicine> selectAll(Medicine medicine);
}
