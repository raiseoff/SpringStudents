//Здесь бизнес-логика
package ru.project.springstudents.service;

import org.springframework.stereotype.Service;
import ru.project.springstudents.Model.Student;

import java.util.List;


public interface StudentService {
    List<Student> findAllStudent();
}
