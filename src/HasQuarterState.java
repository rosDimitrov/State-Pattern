public class HasQuarterState implements State {

	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {

		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can`t insert another quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());

	}

	@Override
	public void turnCarnk() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void dipense() {

		System.out.println("No gumball dispensed");

	}

}
