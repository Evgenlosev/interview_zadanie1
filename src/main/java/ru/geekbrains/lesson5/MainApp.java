package ru.geekbrains.lesson5;

import lombok.extern.slf4j.Slf4j;
import ru.geekbrains.lesson5.dao.StudentDao;
import ru.geekbrains.lesson5.entities.Student;

import java.util.List;

@Slf4j
public class MainApp {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao(SessionFactoryUtils.getSessionFactory());

        System.out.println("Добавим в базу тысячу студентов" + "\n");
        for (int i = 0; i < 1000; i ++) {
            studentDao.add(new Student("Student #" + (i + 1), (int) (Math.random() * 100 + 1)));
        }

        System.out.println("Удалим всех студентов у которых оценка ниже 98 и выведем результат");
        List<Student> students = studentDao.findAll();
        for (Student student : students) {
            if (student.getMark() < 98) {
                studentDao.delete(student);
            }
        }
        System.out.println(studentDao.findAll() + "\n");

        System.out.println("Изменим имена и обнулим оценки оставщихся студентов");
        List<Student> students2 = studentDao.findAll();
        int i = 1;
        for (Student student : students2) {
            student.setMark(0);
            student.setName("NewName #" + i);
            i++;
            studentDao.update(student);
        }
        System.out.println(studentDao.findAll() + "\n");

        SessionFactoryUtils.shutdown();
    }
}
