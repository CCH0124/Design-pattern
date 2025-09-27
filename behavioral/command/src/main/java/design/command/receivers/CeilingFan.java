package design.command.receivers;

public class CeilingFan {
    String location = "";
	int level;
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

 
	public CeilingFan(String location) {
		this.location = location;
	}

    public String high() {
		// turns the ceiling fan on to high
		level = HIGH;
		System.out.println(location + " ceiling fan is on high");
        return "high";
 
	} 

	public String medium() {
		// turns the ceiling fan on to medium
		level = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
        return "medium";
	}

	public String low() {
		// turns the ceiling fan on to low
		level = LOW;
		System.out.println(location + " ceiling fan is on low");
        return "low";
	}
 
	public String off() {
		// turns the ceiling fan off
		level = OFF;
		System.out.println(location + " ceiling fan is off");
        return "off";
	}
 
	public int getSpeed() {
		return level;
	}
}
