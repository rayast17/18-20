package domrab2;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Alek", 
				"zhk. Lagera",
				"0894382454",
				"alek1213@gmail.com");
		Student student = new Student("Radi",
				"zhk. Hipodruma",
				"0182467384",
				"radi@radi.com",
				Student.FRESHMAN);
		Employee employee = new Employee("Ivan", 
				"zhk. Drujba",
				"0894385555",
				"ivan1213@gmail.com",
				"SMG",
				1000.0);
		Staff staff = new Staff(
				"Pesho", 
				"zhk. Mladost",
				"0884385555",
				"pesho1213@gmail.com",
				"NFSG",
				2000.0,
				"director");
		Faculty faculty = new Faculty(
				"MIsho", 
				"zhk. Izgrev",
				"0884385566",
				"misho@gmail.com",
				"NPMG",
				1000.0,
				"11:00 - 18:30",
				"Mater of arts");
		
		System.out.println(person.toString() + "\n");
		System.out.println(student.toString()+ "\n");
		System.out.println(employee.toString()+ "\n");
		System.out.println(staff.toString()+ "\n");
		System.out.println(faculty.toString()+ "\n");
		
	}

}
