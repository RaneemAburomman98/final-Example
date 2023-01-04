package htu.first.jpa.firstjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import htu.first.jpa.firstjpa.entity.StudentEntity;
import htu.first.jpa.firstjpa.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;

	@PostMapping("/addStudent")
	public String addStudent(@RequestBody StudentEntity student) {

		if (service.addOrUpdateStudent(student))
			return "Succ";
		else
			return "Failed";
	}

	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody StudentEntity student) {
		if (service.addOrUpdateStudent(student))
			return "Succ";
		else
			return "Failed";
	}

	@DeleteMapping("/deleteStudentById")
	public String deleteStudent(@RequestParam Integer studentId) {
		if (service.deleteStudentById(studentId))
			return "Succ";
		else
			return "Failed";
	}

	@GetMapping("/findStudentById")
	public StudentEntity findUserById(@RequestParam Integer userId) {

		return service.findStudentById(userId);
	}

	@GetMapping("/findAllStudent")
	public List<StudentEntity> findAllStudent() {
		return service.findAllStudent();
	}

	@GetMapping("/findStudentByName")
	public StudentEntity findUserByName(@RequestParam String name) {

		return service.findByName(name);
	}

	@GetMapping("/findStudentByAge")
	public List<StudentEntity> findUsersByAge(@RequestParam Integer age) {

		return service.findByAge(age);
	}

	@GetMapping("/findStudentByNameV2")
	public List<StudentEntity> findUserByNameV2(@RequestParam String name) {

		return service.findByNameV2(name);
	}
	@GetMapping("/findStudentByNameV3")
	public List<StudentEntity> findUserByNameV3(@RequestParam String name) {

		return service.findByNameV3(name);
	}
}
