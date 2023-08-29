package com.example.pp_soeng_channach_spring_hw1.repository;

import com.example.pp_soeng_channach_spring_hw1.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void insertData(Employee employee){
        em.persist(employee);
    }

    @Transactional
    public void detachData(Employee employee){
        em.detach(employee);
    }

    @Transactional
    public void mergeData(Employee employee){
        employee.setFirstName("lyly");
        em.merge(employee);
    }

    @Transactional
    public void flushData(Employee employee){
        em.flush();
    }

    @Transactional
    public void findEmById(Long id){
        em.find(Employee.class,id);
    }

    @Transactional
    public void removeData(Employee employee){
        em.remove(em.contains(employee)? employee :em.merge(employee));
    }

}
