package design.state;

public interface State {
    public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	
	default void refill() {}
}
