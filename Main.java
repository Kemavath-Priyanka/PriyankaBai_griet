import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
Date d=new Date();
Student st=new Student(67,"Kemavath Priyanka",d,85);
st.getId();
st.setId(678);
st.getFullName();
st.setFullName("Priyanka Bai");
st.getBirthDate();
//st.setBirthDate(1997-07-22);
st.getAvgMark();
st.setAvgMark(86);
StudentGroup sg=new StudentGroup(5);
sg.getStudents();
sg.getStudent(1);
sg.setStudent(st,3);
sg.addFirst(st);
sg.addLast(st);
sg.add(st,2);
sg.remove(st);
sg.removeFromIndex(1);
sg.removeFromElement(st);
sg.removeToIndex(2);
sg.removeFromElement(st);
sg.bubbleSort();


	}

}
