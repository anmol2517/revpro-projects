//EmployeeService.java
package demos.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import demos.springboot.model.Employee;
import demos.springboot.repository.EmployeeDAO;



@Service
public class EmployeeService {
	
	@Autowired
    private EmployeeDAO dao;
     
    public List<Employee> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy)
    {
    	
    	//-----------------only paging----------------------------
    	/*
    	Pageable pageable = PageRequest.of(pageNo, pageSize);
    	Page<Employee> pagedResult = dao.findAll(pageable); 
    	if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Employee>();
        }
        */
        
    	
    	//--------------only sorting---------------------
    	/*
    	Sort sortOrder = Sort.by(sortBy); 
    	List<Employee> list = new ArrayList<Employee>();
    	
    	Iterable<Employee> it = dao.findAll(sortOrder);
    	it.forEach(employee -> {
    		list.add(employee);
    	});
    	
    	return list;
    	*/
    	
    	
        
    	
    	//---------------paging with sorting-----------------
    	
       Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Page<Employee> pagedResult = dao.findAll(pageable);
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Employee>();
        }
        
        //return null;
    }

}
