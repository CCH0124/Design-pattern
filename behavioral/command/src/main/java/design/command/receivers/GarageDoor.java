package design.command.receivers;

public class GarageDoor {
    String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	public String up() {
		System.out.println(location + " garage Door is Up");
        return "up";
	}

	public String down() {
		System.out.println(location + " garage Door is Down");
        return "down";
	}

	public String stop() {
		System.out.println(location + " garage Door is Stopped");
        return "stop";
	}

	public String lightOn() {
		System.out.println(location + " garage light is on");
        return "light on";
	}

	public String lightOff() {
		System.out.println(location + " garage light is off");
        return "light off";
	}
}
