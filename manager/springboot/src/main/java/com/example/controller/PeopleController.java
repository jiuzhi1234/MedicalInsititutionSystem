package com.example.controller;


import com.example.common.Result;
import com.example.entity.People;
import com.example.service.PeopleService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    @Resource
    private PeopleService peopleService;

    /**
     * 新增
     */
    @PostMapping("/add")
    public Result add(@RequestBody People people) {
        peopleService.add(people);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id) {
        peopleService.deleteById(id);
        return Result.success();
    }

    /**
     * 批量删除
     */
    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        peopleService.deleteBatch(ids);
        return Result.success();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result updateById(@RequestBody People people) {
        peopleService.updateById(people);
        return Result.success();
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id) {
        People people = peopleService.selectById(id);
        return Result.success(people);
    }

    /**
     * 查询所有
     */
    @GetMapping("/selectAll")
    public Result selectAll(People people ) {
        List<People> list = peopleService.selectAll(people);
        return Result.success(list);
    }

    /**
     * 分页查询
     */
    @GetMapping("/selectPage")
    public Result selectPage(People people,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<People> page = peopleService.selectPage(people, pageNum, pageSize);
        return Result.success(page);
    }
}
