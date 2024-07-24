package com.example.controller;


import com.example.common.Result;
import com.example.entity.Medicine;
import com.example.service.MedicineService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/medicine")
public class MedicineController {
    @Resource
    private MedicineService medicineService;

    /**
     * 新增
     */
    @PostMapping("/add")
    public Result add(@RequestBody Medicine medicine) {
        medicineService.add(medicine);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id) {
        medicineService.deleteById(id);
        return Result.success();
    }

    /**
     * 批量删除
     */
    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        medicineService.deleteBatch(ids);
        return Result.success();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result updateById(@RequestBody Medicine medicine) {
        medicineService.updateById(medicine);
        return Result.success();
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id) {
        Medicine medicine = medicineService.selectById(id);
        return Result.success(medicine);
    }

    /**
     * 查询所有
     */
    @GetMapping("/selectAll")
    public Result selectAll(Medicine medicine ) {
        List<Medicine> list = medicineService.selectAll(medicine);
        return Result.success(list);
    }

    /**
     * 分页查询
     */
    @GetMapping("/selectPage")
    public Result selectPage(Medicine medicine,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<Medicine> page = medicineService.selectPage(medicine, pageNum, pageSize);
        return Result.success(page);
    }
}
