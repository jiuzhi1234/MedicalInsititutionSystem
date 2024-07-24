package com.example.controller;

import com.example.common.Result;
import com.example.entity.PersonnelVisitsInfo;
import com.example.service.PersonnelVisitsInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/personnelVisitsInfo")
public class PersonnelVisitsInfoController {
    @Resource
    private PersonnelVisitsInfoService personnelVisitsInfoService;

    /**
     * 新增
     */
    @PostMapping("/add")
    public Result add(@RequestBody PersonnelVisitsInfo personnelVisitsInfo) {
        personnelVisitsInfoService.add(personnelVisitsInfo);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id) {
        personnelVisitsInfoService.deleteById(id);
        return Result.success();
    }

    /**
     * 批量删除
     */
    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        personnelVisitsInfoService.deleteBatch(ids);
        return Result.success();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result updateById(@RequestBody PersonnelVisitsInfo personnelVisitsInfo) {
        personnelVisitsInfoService.updateById(personnelVisitsInfo);
        return Result.success();
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id) {
        PersonnelVisitsInfo personnelVisitsInfo = personnelVisitsInfoService.selectById(id);
        return Result.success(personnelVisitsInfo);
    }

    /**
     * 查询所有
     */
    @GetMapping("/selectAll")
    public Result selectAll(PersonnelVisitsInfo personnelVisitsInfo ) {
        List<PersonnelVisitsInfo> list = personnelVisitsInfoService.selectAll(personnelVisitsInfo);
        return Result.success(list);
    }

    /**
     * 分页查询
     */
    @GetMapping("/selectPage")
    public Result selectPage(PersonnelVisitsInfo personnelVisitsInfo,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<PersonnelVisitsInfo> page = personnelVisitsInfoService.selectPage(personnelVisitsInfo, pageNum, pageSize);
        return Result.success(page);
    }
}
