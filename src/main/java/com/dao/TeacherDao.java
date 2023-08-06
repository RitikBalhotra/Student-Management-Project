package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Student;
import com.dto.Teacher;

public class TeacherDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ritik");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// insert method
	public void Insert(List<Teacher> teachers) {
		entityTransaction.begin();

		for (Teacher teacher : teachers) {
			List<Student> students = teacher.getStudents();

			for (Student student : students) {
				entityManager.persist(student);
			}

			entityManager.persist(teacher);
		}
		entityTransaction.commit();
		System.out.println("Data is inserted...........!!!");
		System.out.println("--------------------------------------------------------------------------");
	}

	// Update teacher method
	public void updateteacher(Teacher teacher, int id) {
		Teacher teacher2 = entityManager.find(Teacher.class, id);

		if (teacher.getName() != null) {
			entityTransaction.begin();
			teacher2.setName(teacher.getName());
			entityManager.merge(teacher2);
			entityTransaction.commit();
			System.out.println("Teacher Name Updated..!!");
			System.out.println("--------------------------------------------------------------------------");
		} else if (teacher.getEmail() != null) {
			entityTransaction.begin();
			teacher2.setEmail(teacher.getEmail());
			entityManager.merge(teacher2);
			entityTransaction.commit();
			System.out.println("Teacher Email Updated..!!");
			System.out.println("--------------------------------------------------------------------------");
		} else if (teacher.getExperience() != null) {
			entityTransaction.begin();
			teacher2.setExperience(teacher.getExperience());
			entityManager.merge(teacher2);
			entityTransaction.commit();
			System.out.println("Teacher Experience Updated..!!");
			System.out.println("--------------------------------------------------------------------------");
		} else if (teacher.getGender() != null) {
			entityTransaction.begin();
			teacher2.setGender(teacher.getGender());
			entityManager.merge(teacher2);
			entityTransaction.commit();
			System.out.println("Teacher Gender Updated..!!");
			System.out.println("--------------------------------------------------------------------------");
		}
	}

	// Update Student Case....
	public void updateStudent(Student student, int id) {
		Student student2 = entityManager.find(Student.class, id);

		if (student.getName() != null) {
			entityTransaction.begin();
			student2.setName(student.getName());
			entityManager.merge(student2);
			entityTransaction.commit();
			System.out.println("Student Name Updated..!!");
			System.out.println("--------------------------------------------------------------------------");
		} else if (student.getAge() != null) {
			entityTransaction.begin();
			student2.setAge(student.getAge());
			entityManager.merge(student2);
			entityTransaction.commit();
			System.out.println("Student Age Updated..!!");
			System.out.println("--------------------------------------------------------------------------");
		} else if (student.getBranch() != null) {
			entityTransaction.begin();
			student2.setBranch(student.getBranch());
			entityManager.merge(student2);
			entityTransaction.commit();
			System.out.println("Student Branch Updated..!!");
			System.out.println("--------------------------------------------------------------------------");
		} else if (student.getAddress() != null) {
			entityTransaction.begin();
			student2.setAddress(student.getAddress());
			entityManager.merge(student2);
			entityTransaction.commit();
			System.out.println("Student Address Updated..!!");
			System.out.println("--------------------------------------------------------------------------");
		}
	}

	// Delete Student Method
	public void deleteStudent(int id) {
		Student student = entityManager.find(Student.class, id);

		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			System.out.println("Student Deleted.....");
			System.out.println("--------------------------------------------------------------------------");

		}
	}

	// Delete Teacher Method
	public void deleteTeacher(int id) {
		Teacher teacher = entityManager.find(Teacher.class, id);

		if (teacher != null) {
			entityTransaction.begin();
			entityManager.remove(teacher);
			entityTransaction.commit();
			System.out.println("Teacher Deleted.....");
			System.out.println("--------------------------------------------------------------------------");

		}
	}
	
	
	//Display Method
	public List<Teacher> displayData()
	{
		return entityManager.createQuery("Select t from Teacher t",Teacher.class).getResultList();
	}

}
