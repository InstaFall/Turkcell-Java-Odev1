package org.odevGun3nLayeredKodlamaio.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private List<Instructor> instructors;
    private double coursePrice;

    Course() {
    }

    public Course(int courseId, String courseName, List<Instructor> instructors, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructors = instructors;
        this.coursePrice = coursePrice;
    }

    // Only one instructor course
    public Course(int courseId, String courseName, Instructor instructor, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.instructors = new ArrayList<>();
        addInstructor(instructor);
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    public void addInstructor(Instructor instructor) {
        this.instructors.add(instructor);
    }

    public boolean removeInstructor(Instructor instructor) {
        return this.instructors.remove(instructor);
    }

    public boolean removeInstructorByName(String firstName, String lastName) {
        Iterator<Instructor> iterator = this.instructors.iterator();
        while (iterator.hasNext()) {
            Instructor instructor = iterator.next();
            if (instructor.getFirstName().equals(firstName) && instructor.getLastName().equals(lastName)) {
                iterator.remove(); // Safely remove the matching instructor
                return true; // Instructor found and removed
            }
        }
        return false; // No instructor found with the given name
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
