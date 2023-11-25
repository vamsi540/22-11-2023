package com.vamsi.SpringPostDb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vamsi.SpringPost.service.StudentService;
import com.vamsi.SpringPostDb.model.StudentModel;

@RestController
	@RequestMapping("/student")
	public class StudentCont {
		
		@Autowired
		StudentService studentService;
		
		@GetMapping("/getByName/{name}")
		public List<StudentModel> getBySytudent(@PathVariable("name") String name) {
			return studentService.findByName(name);
			
		}
		
}

