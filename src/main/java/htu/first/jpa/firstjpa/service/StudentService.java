package htu.first.jpa.firstjpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import htu.first.jpa.firstjpa.entity.StudentEntity;
import htu.first.jpa.firstjpa.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;

	public Boolean addOrUpdateStudent(StudentEntity student) {
		if (student.getNameEntity() == null || student.getNameEntity().isEmpty()) {
			return false;
		}
		repo.save(student);
		return true;

	}

	public Boolean deleteStudentById(Integer id) {
		if (id == null || id < 0)
			return false;
		repo.deleteById(id);
		return true;
	}

	public StudentEntity findStudentById(Integer id) {
		if (id == null || id < 0)
			return new StudentEntity();
		return repo.findById(id).orElse(new StudentEntity());
	}

	public List<StudentEntity> findAllStudent() {
		return repo.findAll();
	}

	public StudentEntity findByName(String name) {
		if (name == null || name.isEmpty())
			return new StudentEntity();
		return repo.findByNameEntity(name);
	}

	public List<StudentEntity> findByNameV2(String name) {
		if (name == null || name.isEmpty())
			return new ArrayList<>();
		return repo.findByNameV2(name);
	}
	public List<StudentEntity> findByNameV3(String name) {
		if (name == null || name.isEmpty())
			return new ArrayList<>();
		return repo.findByNameV3(name);
	}
	public List<StudentEntity> findByAge(Integer age) {
		if (age == null || age < 0)
			return new ArrayList<>();
		return repo.findByAge(age);
	}
}
