package ac.za.mzwakali.service.user.impl;

import ac.za.mzwakali.domain.user.EmployeeRace;
import ac.za.mzwakali.factory.user.EmployeeRaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRaceServiceImplTest {

    private EmployeeRaceServiceImpl employeeRaceService;
    private EmployeeRace employeeRace;

    @Before
    public void setUp() throws Exception {
        this.employeeRaceService = EmployeeRaceServiceImpl.getEmployeeRaceService();
        employeeRace = EmployeeRaceFactory.buildEmployeeRace(1,2);
    }

    @Test
    public void getAll() {
        Set<EmployeeRace> raceSet = employeeRaceService.getAll();
        Assert.assertNotNull(raceSet);
    }

    @Test
    public void create() {
        assertEquals(employeeRaceService.create(employeeRace),employeeRaceService.create(employeeRace));
    }

    @Test
    public void read() {
        employeeRaceService.create(employeeRace);
        EmployeeRace race = employeeRaceService.read(employeeRace.getEmpNum());
        Assert.assertNotNull(race);
    }

    @Test
    public void update() {
        employeeRaceService.create(employeeRace);
        EmployeeRace race = employeeRaceService.read(employeeRace.getEmpNum());
        employeeRace.setEmpNum(1);
        employeeRaceService.update(employeeRace);
        Assert.assertEquals(employeeRace.getEmpNum(),race.getEmpNum());
    }

    @Test
    public void delete() {
        employeeRaceService.create(employeeRace);
        EmployeeRace race = employeeRaceService.read(employeeRace.getEmpNum());
        Assert.assertNotNull(race);
        employeeRaceService.delete(employeeRace.getEmpNum());
        EmployeeRace raceDeleted = employeeRaceService.read(employeeRace.getEmpNum());
        Assert.assertNull(raceDeleted);
    }
}