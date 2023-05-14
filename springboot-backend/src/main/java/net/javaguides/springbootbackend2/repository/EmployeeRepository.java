package net.javaguides.springbootbackend2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springbootbackend2.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}