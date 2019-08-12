package ac.za.mzwakali.repository.demography.impl;

import ac.za.mzwakali.domain.demography.Gender;
import ac.za.mzwakali.factory.demography.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest {

    private GenderRepositoryImpl genderRepository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        genderRepository = GenderRepositoryImpl.getGenderRepository();
        gender = GenderFactory.buildGender(2,"Male");
    }

    @Test
    public void create() {
        assertNotNull(genderRepository.create(gender));
    }

    @Test
    public void read() {
        assertNull(genderRepository.read(gender.getGenderId()));
    }

    @Test
    public void update() {
        assertNotNull(genderRepository.update(gender));
    }

    @Test
    public void delete() {
        genderRepository.delete(gender.getGenderId());
    }
}