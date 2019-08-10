package ac.za.mzwakali.repository.demography.impl;

import ac.za.mzwakali.domain.demography.Gender;
import ac.za.mzwakali.repository.demography.GenderRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepositoryImpl genderRepository = null;
    private Map<Integer,Gender> genders;

    public GenderRepositoryImpl(){
        genders = new HashMap<>();
    }

    public static GenderRepositoryImpl getGenderRepository() {
        if (genderRepository == null){
            return new GenderRepositoryImpl();
        }
        return genderRepository;
    }

    @Override
    public Set<Gender> getAll() {
        return new HashSet<>(genders.values());
    }

    @Override
    public Gender create(Gender gender) {
        genders.put(gender.getGenderId(), gender);
        return gender;
    }

    @Override
    public Gender read(Integer id) {
        return genders.get(id);
    }

    @Override
    public Gender update(Gender gender) {
        Gender genderUpdate = read(gender.getGenderId());
        if (genderUpdate != null){
            genders.replace(gender.getGenderId(), gender);
            return create(gender);
        }
        return gender;
    }

    @Override
    public void delete(Integer id) {
        Gender genderDelete = read(id);
        if (genderDelete != null){
            genders.remove(id, genderDelete);
        }

    }
}
