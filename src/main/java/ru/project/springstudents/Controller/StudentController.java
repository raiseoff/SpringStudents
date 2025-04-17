package ru.project.springstudents.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.project.springstudents.Model.Student;
import ru.project.springstudents.service.StudentService;

import java.util.List;

@RestController //Rest
@RequestMapping("/api/v1/students") //адрес
@AllArgsConstructor //Lombok за нас делает экземпляр service
// (Spring добавляет Service и Controller в контекст. Они оба содержат аннотацию компонент. И раз service - StudentService, то Spring внедрит экземпляр в контроллер через конструктор.
public class StudentController {


    private final StudentService service;

    @GetMapping("")
    public List<Student> findAllStudent(){
        return service.findAllStudent();
    }
}
