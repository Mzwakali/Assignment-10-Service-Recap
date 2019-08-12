package ac.za.mzwakali.repository.user.impl;

import ac.za.mzwakali.domain.user.EmployeeRace;
import ac.za.mzwakali.factory.user.EmployeeRaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceRepositoryImplTest {

    private EmployeeRaceRepositoryImpl repository;
    private EmployeeRace employeeRace;

    @Before
    public void setUp() throws Exception {
        repository = EmployeeRaceRepositoryImpl.getEmployeeRaceRepository();
        employeeRace = EmployeeRaceFactory.buildEmployeeRace(1,4);
    }

    @Test
    public void create() {
        assertNotNull(repository.create(employeeRace));
    }

    @Test
    public void read() {
        assertNull(repository.read(employeeRace.getEmpNum()));
    }

    @Test
    public void update() {
        assertNull(repository.update(employeeRace));
    }

    @Test
    public void delete() {
        repository.delete(employeeRace.getEmpNum());
    }
}