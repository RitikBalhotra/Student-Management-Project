package com.controller;

import java.util.*;

import com.dto.Student;
import com.dto.Teacher;
import com.service.TeacherService;

public class TeacherController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TeacherService service = new TeacherService();

		System.out.println("------------$*** Student Management Application ***$------------------");
		System.out.println("______________________________________________________________________");

		while (true) {

			System.out.println("1. Insert Data\n2. Update Teacher Data\n3. Update Student Data\n4. Delete Data\n5. Display Data");
			int choice = scanner.nextInt();
			System.out.println("--------------------------------------------------------------------------");

			switch (choice) {

			// Insert Case....
			case 1: {
				System.out.println("How many Teachers you want to Enter?");
				int size = scanner.nextInt();
				List<Teacher> list1 = new ArrayList<Teacher>();
				List<Student> list2 = new ArrayList<Student>();
				for (int i = 1; i <= size; i++) {
					Teacher teacher = new Teacher();
					System.out.println("Enter " + i + " Teacher Name");
					String name = scanner.next();
					name += scanner.nextLine();
					teacher.setName(name);

					System.out.println("Enter " + i + " Teacher Email");
					teacher.setEmail(scanner.nextLine());

					System.out.println("Enter " + i + " Teacher Experience");
					teacher.setExperience(scanner.nextLine());

					System.out.println("Enter " + i + " Teacher Gender");
					teacher.setGender(scanner.nextLine());
					list1.add(teacher);

				}
				System.out.println("----------------------------------------------------");
				System.out.println("How many Students You Want to Enter?");
				int size1=scanner.nextInt();
				for (int i = 1; i <= size1; i++) {
					Student student = new Student();
					System.out.println("Enter " + i + " Student Name");
					String name1 = scanner.next();
					name1 += scanner.nextLine();
					student.setName(name1);

					System.out.println("Enter " + i + " Student Age");
					student.setAge(scanner.nextLine());

					System.out.println("Enter " + i + " Student Branch");
					student.setBranch(scanner.nextLine());

					System.out.println("Enter " + i + " Student Address");
					student.setAddress(scanner.nextLine());
					list2.add(student);
					student.setTeacher(list1);
				}
				
				for(Teacher teacher2:list1)
				{
					teacher2.setStudents(list2);
				}
				
				service.Insert(list1);
			}
				break;

			// Update case.....
			case 2: {
				Teacher teacher = new Teacher();

				System.out.println(
						"1. Update Teacher Name\n2. Update Teacher Email\n3. Update Teacher Experience\n4. Update Teacher Gender ");
				int choose = scanner.nextInt();
				switch (choose) {

				// Update Teacher Name Case
				case 1: {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("Enter id of Teacher Which you want to Update Name:");
					int id = scanner.nextInt();
					teacher.setId(id);
					System.out.println("Enter the new Name:");
					String name = scanner.next();
					name += scanner.nextLine();
					teacher.setName(name);

					service.updateteacher(teacher, id);
				}
					break;

				// Update Teacher Email Case.....
				case 2: {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("Enter id of Teacher Which you want to Update Email:");
					int id = scanner.nextInt();
					teacher.setId(id);
					System.out.println("Enter the new Email:");
					String name = scanner.next();
					name += scanner.nextLine();
					teacher.setEmail(name);

					service.updateteacher(teacher, id);
				}
					break;

				// Update Teacher Experience Case....
				case 3: {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("Enter id of Teacher Which you want to Update Experience:");
					int id = scanner.nextInt();
					teacher.setId(id);
					System.out.println("Enter the new Experience:");
					String name = scanner.next();
					name += scanner.nextLine();
					teacher.setExperience(name);

					service.updateteacher(teacher, id);
				}
					break;

				// Update Teacher Gender Case...
				case 4: {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("Enter id of Teacher Which you want to Update Gender:");
					int id = scanner.nextInt();
					teacher.setId(id);
					System.out.println("Enter the new Gender:");
					String name = scanner.next();
					name += scanner.nextLine();
					teacher.setGender(name);

					service.updateteacher(teacher, id);
				}
					break;

				default:
					break;
				}
			}
				break;

			// Update student Case...
			case 3: {
				Student student = new Student();
				System.out.println(
						"1.Update Student Name\n2. Update Student Age\n3. Update student Branch\n4. Update student Address");
				int choose1 = scanner.nextInt();
				switch (choose1) {

				// Update Student Name Case...
				case 1: {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("Enter id of Student Which you want to Updatem Name:");
					int id = scanner.nextInt();
					student.setId(id);
					System.out.println("Enter new name:");
					String name = scanner.next();
					name += scanner.nextLine();
					student.setName(name);
					service.updateStudent(student, id);

				}
					break;

				// Update Student Age Case...
				case 2: {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("Enter id of Student Which you want to Update Age:");
					int id = scanner.nextInt();
					student.setId(id);
					System.out.println("Enter new age:");
					String age = scanner.next();
					age += scanner.nextLine();
					student.setAge(age);
					service.updateStudent(student, id);

				}
					break;

				// Update Student Branch Case...
				case 3: {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("Enter id of Student Which you want to Update Branch:");
					int id = scanner.nextInt();
					student.setId(id);
					System.out.println("Enter new Branch:");
					String branch = scanner.next();
					branch += scanner.nextLine();
					student.setBranch(branch);
					service.updateStudent(student, id);

				}
					break;

				// Update Student Address Case...
				case 4: {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("Enter id of Student Which you want to Update Address:");
					int id = scanner.nextInt();
					student.setId(id);
					System.out.println("Enter new Address:");
					String address = scanner.next();
					address += scanner.nextLine();
					student.setAddress(address);
					service.updateStudent(student, id);

				}
					break;

				default:
					break;
				}

			}break;
			
			//Delete Case....
			case 4:{
				Teacher teacher=new Teacher();
				Student student=new Student();
				System.out.println("1. Delete Teacher\n2. Delete Student");
				int choose2=scanner.nextInt();
				switch (choose2) {
				
				//Delete Teacher Case....
				case 1:{
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("Enter Id of teacher which You want to Delete:");
					int id=scanner.nextInt();
					teacher.setId(id);
					service.deleteTeacher(id);
				}break;
				
				//Delete Student case....
				case 2:{
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("Enter id of Student which You want to Delete:");
					int id=scanner.nextInt();
					student.setId(id);
					service.deleteStudent(id);
				}

				default:
					break;
				}
			}break;
			
			//Display Data
			case 5:{
				for(Teacher teacher:service.displayData())
				{
					System.out.println("***** Details of Teacher *****");
					System.out.println("Teacher ID             :"+ teacher.getId());
					System.out.println("Teacher Name           :"+ teacher.getName());
					System.out.println("Teacher Email          :"+ teacher.getEmail());
					System.out.println("Teacher Experience     :"+ teacher.getExperience());
					System.out.println("Teacher Gemder         :"+ teacher.getGender());
					System.out.println("   ");
					System.out.println("***** Details of Students *****");
					for(Student student:teacher.getStudents()) {
						System.out.println("Student ID         :"+ student.getId());
						System.out.println("Student Name       :"+ student.getName());
						System.out.println("Student Age        :"+ student.getAge());
						System.out.println("Student Branch     :"+ student.getBranch());
						System.out.println("Student Address    :"+ student.getAddress());
						System.out.println("   ");
						
					}
				System.out.println("_________________________________________");	
				}
				
			}
			break;
			default:
				break;
			}
		}
	}

}
