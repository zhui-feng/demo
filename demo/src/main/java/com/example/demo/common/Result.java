package com.example.demo.common;


import lombok.Data;

/**
 * @author 张良Alan   2023-01-09 1:33
 */
@Data
public class Result<T> {
    private static String SUCCESS = "操作成功";

    private static String FAILURE = "操作失败";

    public static final int OK = 0;

    public static final int NO = 1;

    public static final int ADD_FAIL = 1001;

    public static final int ACCESS_TOKEN_OVERTIME = 1003;

    protected int code;

    protected String message;

    protected T data;

    public Result<T> data(T data) {
        this.data = data;
        return this;
    }

    public Result<T> code(int code) {
        this.code = code;
        return this;
    }

    public Result<T> message(String message) {
        this.message = message;
        return this;
    }

    /**
     * 成功返回参数
     *
     * @param code
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(int code, String message, T data) {
        return new Result<T>().code(code).message(message).data(data);
    }

    public static <T> Result<T> success() {
        return success(Result.OK, Result.SUCCESS, null);
    }

    public static <T> Result<T> success(T data) {
        return success(Result.OK, Result.SUCCESS, data);
    }

    public static <T> Result<T> success(int code, String message) {
        return success(code, message, null);
    }

    public static <T> Result<T> success(String message, T data) {
        return success(Result.OK, message, data);
    }

    /**
     * 失败返回参数
     *
     * @param code
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> failure(int code, String message, T data) {
        return new Result<T>().code(code).message(message).data(data);
    }

    public static <T> Result<T> failure() {
        return success(Result.NO, Result.FAILURE, null);
    }

    public static <T> Result<T> failure(String message) {
        return success(Result.NO, message, null);
    }

    public static <T> Result<T> failure(int code, String message) {
        return success(code, message, null);
    }


}
