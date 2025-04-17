package ru.project.springstudents.Model;

import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

// Lombok который указан в pom.xml сам создаёт геттеры и сеттеры
//@Getter
//@Setter
// Lombok создаёт конструктор со всеми полями и без полей
//@NoArgsConstructor
//@AllArgsConstructor
//Заставляет выбрать обязательные поля, для этого над необходимым полем прописываем @NotNull
//@RequiredArgsConstructor
@Data //Содержит все анатации выше, а так же Hashcode и Equals
@Builder
public class Student {
    private String firstName;
    private String secondName;
    private LocalDate dateOfBirth;
    private String email;
    private int age;
}
