package ru.project.springstudents.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.project.springstudents.Model.Student;

import java.util.List;

@RestController //Rest
@RequestMapping("/api/v1/students") //адрес

public class StudentController {

    @GetMapping("")
    public List<Student> findAllStudent(){
        return List.of(
                Student.builder().firstName("Олег").email("oleg1@gmail.com").age(52).build(),
                Student.builder().firstName("Олег2").email("oleg2@gmail.com").age(52).build(),
                Student.builder().firstName("Олег3").email("oleg3@gmail.com").age(52).build()
        );
    }
}
