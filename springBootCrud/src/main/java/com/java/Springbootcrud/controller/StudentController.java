package com.java.Springbootcrud.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.Springbootcrud.bean.Student;
import com.java.Springbootcrud.service.StudentService;


@RestController
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/students")
	public void createStudent(@RequestBody Student student)
	{
		studentService.createStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/students/{id}")
	public void updateStudent(@PathVariable int id, @RequestBody Student student)
	{
		studentService.updateStudent(id,student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/students/{id}")
	public void DeleteSubject(@PathVariable int id)
	{
		studentService.deleteStudent(id);
	}

}
