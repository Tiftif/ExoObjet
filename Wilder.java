
public class Wilder {

    // attributs
    private String firstname;
    private int age;
    private boolean aware;

    // constructeurs
    
    public Wilder(String firstname, int age) {
    	this.setfirstname(firstname);
    	this.setAge(age);
    	this.setAware(false);
    }
    
    // methode 
    public String whoAmI() {
    	if (isAware() == true) {
    		return "Je m'appelle " + this.getfirstname() + " j'ai " + getAge() + " ans " + "et je suis aware";
    	} else {
    		return "Je m'appelle " + this.getfirstname() + " j'ai " + getAge() + " ans " + "et je ne suis pas aware";
    	}
        
    }

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}
}
