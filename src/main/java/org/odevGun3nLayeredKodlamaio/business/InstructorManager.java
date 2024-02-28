package org.odevGun3nLayeredKodlamaio.business;

import org.odevGun3nLayeredKodlamaio.core.logging.Logger;
import org.odevGun3nLayeredKodlamaio.dataAccess.InstructorDao;
import org.odevGun3nLayeredKodlamaio.entities.Instructor;

import java.util.List;

public class InstructorManager {
    List<Instructor> instructorList;

    InstructorDao[] instructorDaos;
    Logger[] loggers;

    public InstructorManager() {
    }

    public InstructorManager(InstructorDao[] instructorDao) {
        this.instructorDaos = instructorDao;
    }

    public InstructorManager(List<Instructor> instructorList, InstructorDao[] instructorDaos) {
        this.instructorList = instructorList;
        this.instructorDaos = instructorDaos;
    }

    public void add(Instructor instructor) {
        // Check duplicate instructors
        if (isDuplicateInstructor(instructor)) {
            System.out.println("Instructor already exists");
            return;
        }

        instructorList.add(instructor);
        for (Logger logger : loggers) {
            logger.log("Added " + instructor.getFirstName() + " " + instructor.getLastName() + " " + "into the instructor list!");
        }

        System.out.println("\nAdding " + instructor.getFirstName() + " " + instructor.getLastName() + " into the databases...");
        for (InstructorDao instructorDao : instructorDaos) {
            instructorDao.add(instructor);
        }
    }

    private boolean isDuplicateInstructor(Instructor instructor) {
        for (Instructor instructorToCheck : instructorList) {
            if (instructorToCheck.getInstructorId() == instructor.getInstructorId() || (
                    instructorToCheck.getFirstName().equals(instructor.getFirstName()) &&
                            instructorToCheck.getLastName().equals(instructor.getLastName())))
                return true; // Found a duplicate
        }
        return false; // No duplicates found
    }

    // Async get function?
    List<Instructor> getInstructorListFromDatabase(InstructorDao instructorDao) {
        return instructorDao.getInstructorList();
    }

    void updateInstructorListFromDatabase(InstructorDao instructorDao) {
        setInstructorList(instructorDao.getInstructorList());
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }

    public InstructorDao[] getInstructorDaos() {
        return instructorDaos;
    }

    public void setInstructorDaos(InstructorDao[] instructorDaos) {
        this.instructorDaos = instructorDaos;
    }
}
