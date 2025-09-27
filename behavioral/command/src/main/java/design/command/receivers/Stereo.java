package design.command.receivers;

public class Stereo {
    String location;

	public Stereo(String location) {
		this.location = location;
	}

	public String on() {
		System.out.println(location + " stereo is on");
        return "on";
	}

	public String off() {
		System.out.println(location + " stereo is off");
        return "off";
	}

	public String setCD() {
		System.out.println(location + " stereo is set for CD input");
        return "set CD";
	}

	public String setDVD() {
		System.out.println(location + " stereo is set for DVD input");
        return "set DVD";
	}

	public String setRadio() {
		System.out.println(location + " stereo is set for Radio");
        return "set Radio";
	}

	public String setVolume(int volume) {
		System.out.println(location + " stereo volume set to " + volume);
        return Integer.toString(volume);
	}
}
