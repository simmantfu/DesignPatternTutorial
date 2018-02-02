package builder;

public class University {

	String collageName;
	int noStu;
	
	boolean highLevel;
	boolean midLevel;
	
	public String getCollageName() {
		return collageName;
	}
	
	public int getNoStu() {
		return noStu;
	}
	
	public boolean isHighLevel() {
		return highLevel;
	}
	public void setHighLevel(boolean highLevel) {
		this.highLevel = highLevel;
	}
	public boolean isMidLevel() {
		return midLevel;
	}
	public void setMidLevel(boolean midLevel) {
		this.midLevel = midLevel;
	}
	
	
	private University(UniversityBuilder builder){
		this.collageName = builder.collageName;
		this.noStu = builder.noStu;
		this.highLevel = builder.highLevel;
		this.midLevel = builder.midLevel;
	}
	
	
	static class UniversityBuilder{
		String collageName;
		int noStu;
		
		boolean highLevel;
		boolean midLevel;
		
		
		public UniversityBuilder(String collageName,int noStu){
			this.collageName = collageName;
			this.noStu = noStu;
		}


		public void setHighLevel(boolean highLevel) {
			this.highLevel = highLevel;
		}


		public void setMidLevel(boolean midLevel) {
			this.midLevel = midLevel;
		}
		
		public University build(){
			return new University(this);
		}
		
	}
}
