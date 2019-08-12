package ac.za.mzwakali.factory.demography;

import ac.za.mzwakali.domain.demography.Gender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    private Gender gender;

    @Before
    public void setUp() throws Exception {
        gender = GenderFactory.buildGender(2,"Male");
    }

    @Test
    public void buildGender() {
        assertNotNull(gender);
    }
}