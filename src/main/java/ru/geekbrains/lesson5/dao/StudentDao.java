package ru.geekbrains.lesson5.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.geekbrains.lesson5.entities.Student;

import java.util.List;

public class StudentDao {
    private SessionFactory sessionFactory;

    public StudentDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Student findById (Long id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        session.getTransaction().commit();
        return student;
    }

    public void add (Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
    }

    public void update (Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(student);
        session.getTransaction().commit();
    }

    public void deleteById (Long id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        session.delete(student);
        session.getTransaction().commit();
    }

    public void delete (Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(student);
        session.getTransaction().commit();
    }

    public List<Student> findAll () {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("select s from Student s").getResultList();
        session.getTransaction().commit();
        return students;
    }
}
