package com.kingchen.springcloud.entities.result;

import lombok.Data;

@Data
public class Response<T> {

    private int code;
    private String message;
    private T data;

    public Response(int code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Response get(int code,String message,Object data){return new Response(code,message,data);}

    public static Response get(int code,String message){return new Response(code,message,null);}

}
