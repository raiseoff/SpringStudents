package ru.project.springstudents.impl;

import org.springframework.stereotype.Service;
import ru.project.springstudents.Model.Student;
import ru.project.springstudents.service.StudentService;

import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Олег").email("oleg1@gmail.com").age(52).build(),
                Student.builder().firstName("Олег2").email("oleg2@gmail.com").age(52).build(),
                Student.builder().firstName("Олег3").email("oleg3@gmail.com").age(52).build()
        );
    }
}
