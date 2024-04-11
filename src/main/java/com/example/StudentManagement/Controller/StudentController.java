package com.example.StudentManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.StudentManagement.entity.Student;
import com.example.StudentManagement.services.StudentServices;


@Controller
public class StudentController {


	@Autowired
	private StudentServices studentServices;


	
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		
		model.addAttribute("students" , studentServices.getAllStudents());
		return "students";
		
	}
	
	@GetMapping("/student/new")
	public String addNewStudent(Model model) {
		
		Student student = new Student();
		model.addAttribute("student" , student);
		
		return "createStudent";
		
	}
	
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		this.studentServices.addStudent(student);
		
		return "redirect:/students";
		
	}
	
	@GetMapping("/student/edit/{id}")
	public String update(@PathVariable Long id , Model model) {
		
		model.addAttribute("student" , this.studentServices.getStudentById(id));
		
//		this.studentServices.updateStudent(this.studentServices.getStudentById(id));
		
		return "editStudent";
		
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id , @ModelAttribute("student") Student student, Model model) {
		
		Student existingStudent = this.studentServices.getStudentById(id);
		
		existingStudent.setId(student.getId());
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		this.studentServices.updateStudent(existingStudent);
		
		return "redirect:/students";
	}
	
	@GetMapping("/student/delete/{id}")
	public String delete(@PathVariable Long id) {
		
		this.studentServices.deleteStudentById(id);
		
		return "redirect:/students";
	}
}
