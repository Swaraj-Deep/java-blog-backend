package com.blogbackend.objects;

import org.springframework.http.HttpStatus;

public class ServerResponse<T> {

    private int statusCode;
    private T data;

    public ServerResponse(int statusCode, T data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public T getData() {
        return this.data;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ServerResponse{" +
                "statusCode=" + statusCode +
                ", data=" + data +
                '}';
    }
}
