package overrideaassignment;

public class Students {
public void getStudentInfo(int id) {System.out.println("Student Id is " +id);
	
}
public void getStudentInfo(int id,String name) {System.out.println("Student Id is " +id +" and Stueden tname is " +name );

}
public void getStudentInfo(String email, String Phonenumber) {System.out.println("Student email id is " +email +" and student phonenumber is " +Phonenumber);

}public static void main(String[] args) {
	Students studentinfo = new Students();
	studentinfo.getStudentInfo(1234);
	studentinfo.getStudentInfo(1234,"Saranya");
	studentinfo.getStudentInfo("sara@yahoo.com", "5678095445");
	
}
}
