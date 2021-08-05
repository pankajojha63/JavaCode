package com.rest.webservices.restfulwebservices.filter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping(path = "/filtering")
	public Employee retrieveAllEmployee() {
		return new Employee("Pankaj", "Pankaj", "100000");
	}

	@GetMapping(path = "/filtering-list")
	public List<Employee> retrieveListOfEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Pankaj1", "Pankaj1", "100000"));
		list.add(new Employee("Pankaj2", "Pankaj2", "100000"));
		return list;
	}

	// field1,field2
	@GetMapping(path = "/filteringEmp")
	public MappingJacksonValue filterEmployee() {
		Employee emp = new Employee("Pankaj", "Pankaj", "100000");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("EmployeeFilter", filter);

		MappingJacksonValue map = new MappingJacksonValue(emp);
		map.setFilters(filters);
		return map;
	}

	// field2,field3
	@GetMapping(path = "/filtering-list-Emp")
	public MappingJacksonValue filterListOfEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Pankaj1", "Pankaj1", "100000"));
		list.add(new Employee("Pankaj2", "Pankaj2", "100000"));
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
		FilterProvider filters = new SimpleFilterProvider().addFilter("EmployeeFilter", filter);

		MappingJacksonValue map = new MappingJacksonValue(list);
		map.setFilters(filters);
		
		return map;
	}
}
