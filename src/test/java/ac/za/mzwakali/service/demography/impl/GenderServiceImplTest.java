package ac.za.mzwakali.service.demography.impl;

import ac.za.mzwakali.domain.demography.Gender;
import ac.za.mzwakali.domain.demography.Race;
import ac.za.mzwakali.factory.demography.GenderFactory;
import ac.za.mzwakali.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderServiceImplTest {

    private GenderServiceImpl genderService;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        genderService = GenderServiceImpl.getGenderService();
        gender = GenderFactory.buildGender(2,"Male");

    }

    @Test
    public void getAll() {
        Set<Gender> genderSet = genderService.getAll();
        Assert.assertNotNull(genderSet);
    }

    @Test
    public void create() {
        genderService.create(gender);
        Gender genderCreate = genderService.read(gender.getGenderId());
        Assert.assertNotNull(genderCreate);
    }

    @Test
    public void read() {
        genderService.create(gender);
        Gender genderRead = genderService.read(gender.getGenderId());
        Assert.assertNotNull(genderRead);
    }

    @Test
    public void update() {
        genderService.create(gender);
        Gender genderUpdate = genderService.read(gender.getGenderId());
        gender.setGenderDesc("Female");
        genderService.update(gender);
        Assert.assertEquals(gender.getGenderId(), genderUpdate.getGenderId());
    }

    @Test
    public void delete() {
        genderService.create(gender);
        Gender genderDelete = genderService.read(gender.getGenderId());
        Assert.assertNotNull(genderDelete);
        genderService.delete(gender.getGenderId());
        Gender rDeleted = genderService.read(gender.getGenderId());
        Assert.assertNull(rDeleted);
    }
}