package DAO;


public class DaoPatternDemo {
	public static void main(String[] args) {
		
		StudentDao studentDao = new StudentDaoImpl();
		
		//Buscando por todos os Students da lista
		for (Student student : studentDao.getAllStudents()) {
			
			System.out.println("Student: [Roll No: " 
			+ student.getRollNo()
			+ "; Name: " 
			+ student.getName() + " ]");
			
		}		
		//Testando o update
		
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Patricia");

		System.out.println("Student: [Roll No: " 
		+ student.getRollNo()
		+ "; Name: " 
		+ student.getName() + " ]");
		
		
		//Obtendo um Student da lista
		studentDao.getStudent(0);
		
		System.out.println("Student: [Roll No: " 
		+ student.getRollNo()
		+ "; Name: " 
		+ student.getName() + " ]");
	}
}
