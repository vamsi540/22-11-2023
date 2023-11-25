package com.vamsi1.SpringPostDb;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.vamsi.SpringPost.service.StudentService;
import com.vamsi.SpringPostDb.model.StudentModel;

@WebMvcTest(value = StudentService.class)
	public class StudentTest {
		@Autowired
		MockMvc mockMvc;
		@MockBean
		
		StudentService studentService;
		
		
		@Test
		void testGetByName() {
			
			List<StudentModel> list = new ArrayList<>();
	 
			StudentModel student = new StudentModel("vamsi", 44, 40000000);
			list.add(student);
			when(studentService.findByName("vamsi")).thenReturn(list);
		}
}
