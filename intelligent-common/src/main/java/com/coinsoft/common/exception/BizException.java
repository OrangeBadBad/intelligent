package com.coinsoft.common.exception;

/**
 * Created by wenhuan.huang on  2018/10/17.
 * BR 业务异常
 */
public class BizException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public BizException() {
        super();
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

}
