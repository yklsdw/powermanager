package com.neusoft.util;


public class ResultBean {
    private Integer code;
    private String msg;
    private Object obj;

  public enum Code{
        SUCCESS,FAIL,EXCEPTION
    }
    public ResultBean(){

    }

    public ResultBean(Code c){
        Code code=c;
        switch (code)
        {
            case SUCCESS:
                this.code=10000;
            msg="操作成功";
            break;
            case FAIL:
                this.code=20000;
                msg="操作失败";
                break;
            case EXCEPTION:
                this.code=30000;
                msg="异常";
                break;
        }

    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
