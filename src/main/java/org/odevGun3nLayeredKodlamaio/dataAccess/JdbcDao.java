package org.odevGun3nLayeredKodlamaio.dataAccess;

import org.odevGun3nLayeredKodlamaio.entities.Category;
import org.odevGun3nLayeredKodlamaio.entities.Course;
import org.odevGun3nLayeredKodlamaio.entities.Instructor;

import java.util.List;

public class JdbcDao implements CategoryDao, CourseDao, InstructorDao {

    @Override
    public void add(Category category) {
        System.out.println("Category " + category.getCategoryName() + " added into database with JDBC!");
    }

    @Override
    public void add(Course course) {
        System.out.println("Course " + course.getCourseName() + " added into database with JDBC!");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor " + instructor.getFirstName() + " " +instructor.getLastName() + " " + " added into database with JDBC!");
    }

    @Override
    public List<Instructor> getInstructorList() {
        return null; // Actual jdbc code comes here
    }
}
