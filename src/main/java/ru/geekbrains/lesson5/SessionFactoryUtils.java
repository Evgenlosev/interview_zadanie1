package ru.geekbrains.lesson5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtils {
    private static SessionFactory sessionFactory;

//    public void init() {
//        try {
//            factory = new Configuration()
//                    .configure("hibernate.cfg.xml")
//                    .buildSessionFactory();
//        } catch (Exception e) {
//            System.out.println("Не удалось подключиться к базе данных");
//            e.printStackTrace();
//        }
//
//    }

    public static SessionFactory getSessionFactory () {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
            return sessionFactory;
        } catch (Exception e) {
            System.out.println("Не удалось подключиться к базе данных");
            e.printStackTrace();
        }
        return null;
    }

    public static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}
