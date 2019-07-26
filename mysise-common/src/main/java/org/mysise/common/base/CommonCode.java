package org.mysise.common.base;

/**
 *  错误码公用实现接口
 *
 * @author fanwenjie
 * @since 2019/7/26 23:04
 */
public interface CommonCode {


    /**
     *  获取错误码
     *
     */
    String getCode();

    /**
     *  获取错误信息
     *
     */
    String getMessage();
}
