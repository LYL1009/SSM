package com.lyl.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyl.bean.Teacher;
import com.lyl.dao.TeacherDao;
import com.lyl.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping("/getTeacher")
    public String getTeacher(@RequestParam(value = "id",defaultValue = "1") Integer id, Model model) {
        Teacher teacher = teacherService.getTeacherById(id);
        model.addAttribute("msg",teacher);
        return "success";
    }

    @RequestMapping("/getAll")
    public String getAllTeachers(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model) {
        //紧跟它的查询就是一个分页查询
        PageHelper.startPage(pn,6);
        List<Teacher> teachers = teacherService.getTeachers();
        //我们可以将查询的结果使用，将查询结果放在pageInfo中这个pageInfo就有非常多能用的
        //第二个参数传入连续要显示的页码
        PageInfo<Teacher> pageInfo = new PageInfo<>(teachers,6);
        System.out.println("当前页码"+pageInfo.getPageNum());
        int[] nums = pageInfo.getNavigatepageNums();
        model.addAttribute("teachers",pageInfo);
        return "success";
    }
}
