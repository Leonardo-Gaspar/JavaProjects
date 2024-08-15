package DAO;

import java.util.ArrayList;
import java.util.List;

//Classe concreta - implementa a iterface StudentDao
public class StudentDaoImpl implements StudentDao{
	
	private List<Student> students;
	
	public StudentDaoImpl() {
		
		System.out.println("*-* Objeto Student criado *-*");
		//criando uma lista (ArrayList)
		
		students = new ArrayList<Student>();
		
		Student student1 = new Student("Sara", 0);
		Student student2 = new Student("Igor", 1);
		Student student3 = new Student("Claudio", 2);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
	}
	

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());;
		
	}

	@Override
	public void deleteStudent(Student student) {	
		students.remove(student.getRollNo());
		//Ou
//		students.remove(student); retorna um boolean
		
	}
	
	
	
}
