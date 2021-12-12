package com.cuatroa.retotres.repository;

import com.cuatroa.retotres.model.Accessory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retotres.repository.crud.AccesoryCrudRepository;

/**
 *
 * @author desaextremo
 */
@Repository
public class AccesoryRepository {
    @Autowired
    private AccesoryCrudRepository accesoryCrudRepository;

    public List<Accessory> getAll() {
        return accesoryCrudRepository.findAll();
    }

    public Optional<Accessory> getAccesory(String reference) {
        return accesoryCrudRepository.findById(reference);
    }
    
    public Accessory create(Accessory accesory) {
        return accesoryCrudRepository.save(accesory);
    }

    public void update(Accessory accesory) {
        accesoryCrudRepository.save(accesory);
    }
    
    public void delete(Accessory accesory) {
        accesoryCrudRepository.delete(accesory);
    }
}
