package com.cuatroa.retotres.controller;

import com.cuatroa.retotres.model.Accessory;
import com.cuatroa.retotres.service.AccessoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author desaextremo
 */
@RestController
@RequestMapping("/api/accessory")
@CrossOrigin("*")
public class AccessoryController {

    @Autowired
    private AccessoryService accessoryService;

    @GetMapping("/all")
    public List<Accessory> getAll() {
        return accessoryService.getAll();
    }

    @GetMapping("/{reference}")
    public Optional<Accessory> getAccesory(@PathVariable("reference") String reference) {
        return accessoryService.getAccesory(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Accessory create(@RequestBody Accessory gadget) {
        return accessoryService.create(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Accessory update(@RequestBody Accessory gadget) {
        return accessoryService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return accessoryService.delete(reference);
    }
}
