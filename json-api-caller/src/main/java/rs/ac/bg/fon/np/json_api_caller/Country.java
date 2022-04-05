package rs.ac.bg.fon.np.json_api_caller;

public class Country {

	private String name;
	private String capital;
	private String fullName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + ", fullName=" + fullName + "]";
	}
	
	
	
	
	
	
}
