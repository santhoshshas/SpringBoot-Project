package com.java.Springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.java.Springbootcrud.bean.Student;




public interface StudentRepository extends CrudRepository<Student,Integer>  
{

}
