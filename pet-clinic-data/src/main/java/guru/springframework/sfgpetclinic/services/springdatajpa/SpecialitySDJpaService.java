package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialtyService {

    private final SpecialtyService specialtyService;

    public SpecialitySDJpaService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialtyService.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialtyService.findById(aLong);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialtyService.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialtyService.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyService.deleteById(aLong);
    }
}