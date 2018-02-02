package builder;

import builder.University.UniversityBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UniversityBuilder builder = new UniversityBuilder("test", 2);
		builder.setHighLevel(true);
		builder.setMidLevel(true);
		University university = builder.build();
		
        System.out.println(university.getCollageName());		
        System.out.println(university.getNoStu());
        System.out.println(university.isHighLevel());
        System.out.println(university.isMidLevel());
		
	}

}
