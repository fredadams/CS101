public class BinarySwitch {
    
	private boolean switchOn;

	public void setOn(boolean On) {
		this.switchOn = On;
	}

    public void setSwitchStateOn() {
    	setOn(true);
    }

    public void setSwitchStateOff() {
    	setOn(false);
    }

    public String stateOfSwitch() {
    	String state;
    	if (switchOn) {
    		state = "The switch in On";
    	} 
    	else {
    		state = "The switch is Off";
    	}
    	return state;
    }

    public static void main(String[] args) {
        BinarySwitch mySwitch = new BinarySwitch();
        System.out.println(mySwitch.stateOfSwitch());		//print current state of mySwitch
        mySwitch.setSwitchStateOn();					//set mySwitch state to On
        System.out.println(mySwitch.stateOfSwitch());
        mySwitch.setSwitchStateOff();					//set mySwitch state to Off
        System.out.println(mySwitch.stateOfSwitch());
    }
}