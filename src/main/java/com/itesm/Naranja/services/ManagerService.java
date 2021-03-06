package com.itesm.Naranja.services;

import com.itesm.Naranja.models.Manager;
import com.itesm.Naranja.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository managerRepository;

    public List<Manager> getAllManagers(){
        return managerRepository.findAllManagers();
    }

    public Manager getManagerByID(@PathVariable("ID") String ID){
        return managerRepository.findManagerByID(ID);
    }

    public Manager insertManager(Manager manager){
        return managerRepository.insertManager(manager);
    }

    public Manager deleteManager(@PathVariable("ID") String ID){
        return managerRepository.deleteManager(ID);
    }

    public Manager updateManagerName(@PathVariable("ID") String ID, @PathVariable("newName") String newName){
        return managerRepository.updateManagerName(ID, newName);
    }
}
