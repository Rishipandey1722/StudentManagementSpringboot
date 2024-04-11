package com.example.StudentManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentManagement.entity.Student;
import com.example.StudentManagement.repository.StudentRepository;

@Service
public class StudentServices {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return this.studentRepository.findAll();
	}

	public void addStudent(Student student) {

		this.studentRepository.save(student);

	}

	public Student getStudentById(Long id) {
		return this.studentRepository.findById(id).get();
	}

	public Student updateStudent(Student student) {

		return this.studentRepository.save(student);
	}

	public void deleteStudentById(Long id) {
		
		this.studentRepository.deleteById(id);
		
	}

}
