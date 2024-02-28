package org.odevGun3nLayeredKodlamaio.dataAccess;

import org.odevGun3nLayeredKodlamaio.entities.Instructor;

import java.util.List;

public interface InstructorDao {
    void add(Instructor instructor);

    List<Instructor> getInstructorList();
}
