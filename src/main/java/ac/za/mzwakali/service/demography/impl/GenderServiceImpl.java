package ac.za.mzwakali.service.demography.impl;

import ac.za.mzwakali.domain.demography.Gender;
import ac.za.mzwakali.repository.demography.GenderRepository;
import ac.za.mzwakali.service.demography.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    private static GenderServiceImpl genderService = null;
    private GenderRepository genderRepository;

    public static GenderServiceImpl getGenderService() {
        if (genderService == null){
            return new GenderServiceImpl();
        }
        return genderService;
    }

    @Override
    public Set<Gender> getAll() {
        return genderRepository.getAll();
    }

    @Override
    public Gender create(Gender gender) {
        return genderRepository.create(gender);
    }

    @Override
    public Gender read(Integer id) {
        return genderRepository.read(id);
    }

    @Override
    public Gender update(Gender gender) {
        return genderRepository.update(gender);
    }

    @Override
    public void delete(Integer id) {
        genderRepository.delete(id);

    }
}
