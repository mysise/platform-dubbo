package org.mysise.common.base;

import org.mysise.common.base.code.BaseCode;
import org.mysise.common.base.code.CommonCode;

import java.io.Serializable;

/**
 * <p>
 *  返回的数据实体
 * <p>
 *
 *
 * @since 2018/4/21 15:29
 */
public class FeedResult<T> implements Serializable {

    /**
     * <p>
     *  状态码，默认为0成功
     * <p>
     *
     * @since 2018/4/21 15:29
     */
    private String code= Constant.SUCCESS;

    /**
     * <p>
     *  内容
     * <p>
     *
     * @since 2018/4/21 15:30
     */
    private String message;


    /**
     * <p>
     *  结果集
     * <p>
     *
     * @since 2018/4/21 15:32
     */
    private T result;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public FeedResult(BaseCode baseCode){
        this.code=baseCode.getCode();
        this.message=baseCode.getMessage();
    }
    public FeedResult() {
        this(CommonCode.SUCCESS);
    }

    public FeedResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public FeedResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "FeedResult{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
