package com.kalyani;

public interface Telephone {
//    power on
//    dial a number
//    answer phone call
//    call another phone
//    is ringing

    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();

}
