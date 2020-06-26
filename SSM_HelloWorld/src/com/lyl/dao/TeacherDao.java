package com.lyl.dao;

import com.lyl.bean.Teacher;

import java.util.List;

public interface TeacherDao {

    public Teacher getTeacherById(Integer id);

    public List<Teacher> getAll();

}
