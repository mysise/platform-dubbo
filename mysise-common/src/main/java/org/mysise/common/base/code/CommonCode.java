package org.mysise.common.base.code;


import org.mysise.common.base.Constant;

/**
 * 100xx
 *
 * @since 2018年9月5日 下午10:52:44
 */
public enum CommonCode implements BaseCode {

	SUCCESS(Constant.SUCCESS,"SUCCESS"),
	TOKEN_INVALID(Constant.TOKEN_INVALID, "TOKEN_INVALID"),
	TOKEN_NULL(Constant.TOKEN_NULL,"TOKEN_NULL"),
	FORBIDDEN(Constant.FORBIDDEN,"Forbidden"),
	;

	private String code;
	private String message;

	CommonCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
