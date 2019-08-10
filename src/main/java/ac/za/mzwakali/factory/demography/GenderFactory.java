package ac.za.mzwakali.factory.demography;

import ac.za.mzwakali.domain.demography.Gender;

public class GenderFactory {

    public static Gender buildGender(int genderId, String genderDesc){
        return new Gender.Builder()
                .genderId(genderId)
                .genderDesc(genderDesc)
                .build();
    }
}
