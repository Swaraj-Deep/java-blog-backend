package com.blogbackend.objects;

import java.util.Date;

public class ErrorObject {
    private Date timeStamp;
    private int statusCode;
    private String message;
    private String path;

    public ErrorObject(Date timeStamp, int statusCode, String message, String path) {
        this.timeStamp = timeStamp;
        this.statusCode = statusCode;
        this.message = message;
        this.path = path;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPath() {
        return path;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
