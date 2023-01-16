public class Landline implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging=false;
        isPowerOn=true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String phoneNumber) {

        if(isPowerOn==true){
            System.out.println("You are dialing the no: "+phoneNumber);
        }
        else{
            System.out.println("Your Phone is off");
        }
        return;
    }

    @Override
    public void receiveCall(String phoneNo) {

        if(isPowerOn&& myPhoneNo.equals(phoneNo)){
            this.isRinging=true;
            System.out.println("Hey "+myPhoneNo+" You have a call");
        }
        else {
            System.out.println("Call not recieved");
        }
        return;
    }

    @Override
    public boolean answercall() {
        if(isRinging==true){
            System.out.println("Call answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
