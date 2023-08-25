package StudentObject;

public class StudentApp {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.id=1;
		s1.name="Poojitha";
		s1.age=22;
		s1.branch="CSE";
		System.out.println(s1.id+" "+s1.name+" "+s1.age+" "+s1.branch);
		s1.eat();
		s1.sleep();
		
		s2.id=2;
		s2.name="usha";
		s2.age=21;
		s2.branch="ECE";
		System.out.println(s2.id+" "+s2.name+" "+s2.age+" "+s2.branch);
		s2.eat();
		s2.sleep();
	}

}
