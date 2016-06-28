package com.cabin.sites;

import com.cabin.entity.UpworkBid;

import java.util.List;

public class ResponceContainer<T> {

    private T data = null;
    private int code = 0;
    private String message = null;
    private PageContainer pageContainer;

    public T getData() {
        return data;
    }

    public PageContainer getPageContainer() {
        return pageContainer;
    }

    public void setPageContainer(PageContainer pageContainer) {
        this.pageContainer = pageContainer;
    }

    public void setData(List<UpworkBid> data) {
        this.data = (T) data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setError(RestError error) {
        code = error.getAppErrorCode();
        message = error.getAppErrorMessage();
    }

}

