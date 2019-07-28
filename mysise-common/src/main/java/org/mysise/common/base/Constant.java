package org.mysise.common.base;

/**
 * <p>
 *  常量
 * <p>
 *
 *
 * @since 2018/9/5 下午10:45
 */
public class Constant {

    /**
     * <p>
     *  全局状态码
     * <p>
     *
     * @since 2018/9/5 下午10:57
     */
    public static final String SUCCESS       = "0";
    public static final String TOKEN_INVALID = "-1";
    public static final String TOKEN_NULL    = "-2";
    public static final String FAILED         = "-3";
    public static final String TIMEOUT       = "-4";

    /**
     * <p>
     *  网络请求错误
     * <p>
     *
     * @since 2018/9/5 下午11:45
     */
    public static final String UNAUTHORIZE   = "401";
    public static final String FORBIDDEN     = "403";

    public static final String UID           = "uid";
    //在线
    public static final int ONLINE   =   1;
    //不在线
    public static final int OFFLINE  =   2;

}
