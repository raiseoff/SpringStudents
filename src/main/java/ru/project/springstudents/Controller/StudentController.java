package ru.project.springstudents.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student){
        service.saveStudent(student);
        return "Student is succesfully saved";
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
    }

}
