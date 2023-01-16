public interface Phone {
    void powerOn();
    void callNumber(String phoneNumber);
    void receiveCall(String phoneNo);
    boolean answercall();
    boolean isRinging();
}
