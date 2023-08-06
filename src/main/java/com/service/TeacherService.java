package com.service;

import java.util.List;

import com.dao.TeacherDao;
import com.dto.Student;
import com.dto.Teacher;

public class TeacherService {

	TeacherDao dao = new TeacherDao();

	// insert method
	public void Insert(List<Teacher> teachers) {
		dao.Insert(teachers);
	}

	// Update teacher method
	public void updateteacher(Teacher teacher, int id) {
		dao.updateteacher(teacher, id);
	}

	// Update Student Case....
	public void updateStudent(Student student, int id) {
		dao.updateStudent(student, id);
	}

	// Delete Student Method
	public void deleteStudent(int id) {
		dao.deleteStudent(id);
	}

	// Delete Teacher Method
	public void deleteTeacher(int id) {
		dao.deleteTeacher(id);
	}

	// Display Method
	public List<Teacher> displayData(){
		return dao.displayData();
	}
}
