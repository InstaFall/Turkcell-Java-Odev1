package org.odevGun3nLayeredKodlamaio;

import org.odevGun3nLayeredKodlamaio.business.CategoryManager;
import org.odevGun3nLayeredKodlamaio.business.CourseManager;
import org.odevGun3nLayeredKodlamaio.business.InstructorManager;
import org.odevGun3nLayeredKodlamaio.core.logging.DatabaseLogger;
import org.odevGun3nLayeredKodlamaio.core.logging.EmailLogger;
import org.odevGun3nLayeredKodlamaio.core.logging.FileLogger;
import org.odevGun3nLayeredKodlamaio.core.logging.Logger;
import org.odevGun3nLayeredKodlamaio.dataAccess.CategoryDao;
import org.odevGun3nLayeredKodlamaio.dataAccess.CourseDao;
import org.odevGun3nLayeredKodlamaio.dataAccess.HibernateDao;
import org.odevGun3nLayeredKodlamaio.dataAccess.JdbcDao;
import org.odevGun3nLayeredKodlamaio.entities.Category;
import org.odevGun3nLayeredKodlamaio.entities.Course;
import org.odevGun3nLayeredKodlamaio.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create entities
        Instructor instructor1 = new Instructor(0, "Engin", "Demiröğ");
        Instructor instructor2 = new Instructor(1, "Halit Enes", "Kalaycı");
        Instructor instructor3 = new Instructor(2, "John", "Doe");

        List<Instructor> instructors = new ArrayList<Instructor>();
        instructors.add(instructor1);
        instructors.add(instructor2);
        instructors.add(instructor3);
        Instructor[] instructors1 = {instructor2, instructor3};

        Category category1 = new Category(0, "All");
        Category category2 = new Category(1, "Programming");

        Course course1 = new Course(0, "Java", instructors, 300);
        Course course2 = new Course(1, "Front-End", instructor3, 200);
        Course course3 = new Course(2, "Kotlin", List.of(instructors1), -1);
        List<Course> courseList = new ArrayList<>();
        courseList.add(course1);


        // Create Daos, Loggers, Managers
        CourseDao[] courseDaos = {new JdbcDao(), new HibernateDao()};
        Logger[] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger()};

        CourseManager courseManager = new CourseManager(courseDaos, loggers, courseList);
        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);


        // CategoryDaos
        CategoryDao[] categoryDaos = {new JdbcDao(), new HibernateDao()};
        CategoryManager categoryManager = new CategoryManager(categoryDaos, loggers);
        System.out.println("\nCategory operations");
        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category1);

        InstructorManager instructorManager = new InstructorManager();


    }
}
