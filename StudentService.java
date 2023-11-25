package com.vamsi.SpringPost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamsi.SpringPostDb.Repository.StudentRepo;
import com.vamsi.SpringPostDb.model.StudentModel;

@Service
public class StudentService {
		@Autowired
		StudentRepo repo;
		
		public List<StudentModel> findByName(String name) {
			return repo.findByName(name);
		}
		//post method
		public StudentModel post(StudentModel student)
		{
			return repo.save(student);
		}
	 
}
