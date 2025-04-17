package ru.project.springstudents.impl;

import org.springframework.stereotype.Service;
import ru.project.springstudents.Model.Student;
import ru.project.springstudents.service.StudentService;

import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAllStudent() {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public Student deleteStudent(String email) {
        return null;
    }
}
