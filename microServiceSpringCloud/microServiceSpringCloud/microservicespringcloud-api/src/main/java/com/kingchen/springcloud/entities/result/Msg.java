package com.kingchen.springcloud.entities.result;

public class Msg {
    public static final int FAILURE_CODE;
    public static final int SUCCESS_CODE;
    public static final int NO_MSG;

    public static final String FAILURE_MSG;
    public static final String SUCCESS_MSG;

    static {
        FAILURE_CODE = 4001;
        SUCCESS_CODE = 2001;
        NO_MSG = 4003;
        FAILURE_MSG = "failure";
        SUCCESS_MSG = "success";
    }
}
