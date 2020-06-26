package com.lyl.service;

import com.lyl.bean.Teacher;
import com.lyl.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherDao teacherDao;

    public Teacher getTeacherById(Integer id) {
        return teacherDao.getTeacherById(id);
    }

    public List<Teacher> getTeachers() {
        return teacherDao.getAll();
    }
}
