package com.java.Springbootcrud.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Springbootcrud.bean.Student;
import com.java.Springbootcrud.repository.StudentRepository;


@Service
public class StudentService 
{
	@Autowired
	public StudentRepository studentRepo;
	
	public List<Student> getAllStudents()
	{
		List<Student> students=new ArrayList<>();
		studentRepo.findAll().forEach(students::add);
		return students;
	}
	
	public void createStudent(Student student)
	{
		studentRepo.save(student);
	}
	
	public void updateStudent(int id, Student student)
	{
		studentRepo.save(student);
	}
	
	public void deleteStudent(int id)
	{
		studentRepo.deleteById(id);
	}

}
