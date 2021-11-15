package com.blogbackend.objects;

public class ServerResponse {

    private int statusCode;
    private String message;

    public ServerResponse() {
        statusCode = 0;
        message = "";
    }

    public ServerResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
