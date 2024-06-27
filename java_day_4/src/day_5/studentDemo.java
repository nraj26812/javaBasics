package day_5;

public class studentDemo {

	public static void main(String[] args) {
		
		student s1=new student();
		s1.setSid(102);
		s1.setSname("Raja");
		s1.setCity("Chennai");
		/*
		 * System.out.println("student id:"+s1.getSid());
		 * System.out.println("student name:"+s1.getSname());
		 * System.out.println("student city:"+s1.getCity());
		 */
		System.out.println(s1);//object printing calls the tostring()
		student s2=new student();
		s2.setSid(103);
		s2.setSname("king");
		s2.setCity("Chennai");
		System.out.println(s2);
		student s3=new student();
		s3.setSid(104);
		s3.setSname("rani");
		s3.setCity("Chennai");
		System.out.println(s3);
		
		 

	}

}
