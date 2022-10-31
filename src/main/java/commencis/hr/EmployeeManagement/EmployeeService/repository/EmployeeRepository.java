package commencis.hr.EmployeeManagement.EmployeeService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import commencis.hr.EmployeeManagement.EmployeeService.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>  {
    
}
