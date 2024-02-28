package org.odevGun3nLayeredKodlamaio.business;

import org.odevGun3nLayeredKodlamaio.core.logging.Logger;
import org.odevGun3nLayeredKodlamaio.dataAccess.CourseDao;
import org.odevGun3nLayeredKodlamaio.entities.Course;
import org.odevGun3nLayeredKodlamaio.entities.Instructor;

import java.util.List;

public class CourseManager {
    //We have only 2 Dao options so fixed array is fine
    CourseDao[] courseDaos;
    Logger[] loggers;
    List<Course> courseList;

    CourseManager() {
    }

    public CourseManager(CourseDao[] courseDaos, Logger[] loggers) {
        this.courseDaos = courseDaos;
        this.loggers = loggers;
    }

    public CourseManager(CourseDao[] courseDaos, Logger[] loggers, List<Course> courseList) {
        this.courseDaos = courseDaos;
        this.loggers = loggers;
        this.courseList = courseList;
    }

    public void add(Course course) {
        // Condition checks
        if (isDuplicateCourse(course)) { // Duplicate course name
            System.out.println("Course " + course.getCourseName() + " already exists!");
            return;
        }
        if (course.getCoursePrice() < 0) { // Course price must be > 0
            System.out.println("Price (" + course.getCoursePrice() + ") of course " + course.getCourseName() + " is invalid!");
            return;
        }

        // Add to courseList
        courseList.add(course);
        for (Logger logger : loggers) {
            logger.log("Added " + course.getCourseName() + " into the course list!");
        }

        System.out.println("\nAdding " + course.getCourseName() + " to databases...");
        // Add to database
        for (CourseDao courseDao : courseDaos) {
            courseDao.add(course);
        }
    }

    private boolean isDuplicateCourse(Course course) {
        for (Course courseToCheck : courseList) {
            if (courseToCheck.getCourseId() == course.getCourseId() ||
                    courseToCheck.getCourseName().equals(course.getCourseName())) {
                return true; // Found a duplicate
            }
        }
        return false; // No duplicates found
    }

    public void listInstructors(Course course) {
        List<Instructor> instructorList = course.getInstructors();
        System.out.println("Instructor list of the " + course.getCourseName());
        for (Instructor instructor : instructorList) {
            System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }
}
