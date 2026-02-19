//EmployeeDAO.java
package demos.springboot.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import demos.springboot.model.Employee;



@Repository
public interface EmployeeDAO extends PagingAndSortingRepository<Employee, Long> {

}
