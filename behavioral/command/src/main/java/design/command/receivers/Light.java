package design.command.receivers;

public class Light {
	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public String on() {
		System.out.println(location + " light is on");
        return "on";
	}

	public String off() {
		System.out.println(location + " light is off");
        return "off";
	}
}