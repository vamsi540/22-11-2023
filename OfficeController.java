package com.vamsi.spingbootproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vamsi.spingbootproject.bean.Office;

@RestController
@RequestMapping("offices")
public class OfficeController {
	@GetMapping(value="office")
	public  Office getOffice() {
		
		Office office=new Office(2, "vamsi", "bhargavu");
		return office;
		
		
		
	}
	@GetMapping
	public List<Office> getOffices(){
		
	List<Office> offices=new ArrayList();
	offices.add(new Office(1,"siva","madire"));
	offices.add(new Office(2,"ganga","m"));
	offices.add(new Office(3,"hari","a"));

		return offices;
		
		
	}
	@GetMapping(value="{id}")
	public Office officePathVariable(@PathVariable int id) {
		Office office =new Office(id,"vamsi","bhargav");
		return office;
	}
	
	@GetMapping(value="{id}/{first-name}/{last-name}")
	public Office DifferentArgumentAndBody(@PathVariable("id") int officeid,
			@PathVariable("first-name") String firstname,@PathVariable("last-name") String lastname) {
		Office office=new Office(officeid,firstname,lastname);
		return office;
		
	}
	//http://localhost:8080/of/offfice?id=1   hereid=1 called as a query parameter
	@GetMapping("of/offfice")
	public Office requestparameter(@RequestParam int id) {
		Office office=new Office(id,"vamsi","bhargav");
		return office;
		
	}
	
	////http://localhost:8080/of/offfice?id=1&firstname=vamsi&lastname=bhargav
	@GetMapping(value="offices/officeees")
	public Office mutiplereuqestparam(@RequestParam  int id,@RequestParam  String firstname,@RequestParam  String lastname) {
		Office office=new Office(id,firstname,lastname);
		return null;
		
	}
	
	@PostMapping(value="create")
	@ResponseStatus(HttpStatus.CREATED)
	public Office createuserdata(@RequestBody Office office ) {
	System.out.println(office.getId());
	System.out.println(office.getFirstname());
	System.out.println(office.getLastname());
	return office;
	}
		
	@PutMapping(value="offices/{id}")
	public Office updatemapping(@RequestBody Office office,@PathVariable("id") int officeid) {
		System.out.println(office.getFirstname());
		System.out.println(office.getLastname());
		return office ;
		
	}
	
	@DeleteMapping("delete/{id}/delete")
	public String delete(@PathVariable("id") int  officeid) {
		System.out.println(officeid);
		return "Student deleted successfully";
		
	}
	
	//responsebody
	@GetMapping(value="office1")
	public ResponseEntity< Office> getOffic1e1() {
		
		Office office=new Office(2, "vamsi", "bhargavu");
		return ResponseEntity.ok(office);
		
		
		
	}
		
		
	}
	

	
