package com.cognizant.spring_learn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Department;
import com.cognizant.spring_learn.repository.DepartmentDao;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;
	
	public ArrayList<Department> getAllDepartments()
	{
		return departmentDao.getAllDepartments();
	}

}
