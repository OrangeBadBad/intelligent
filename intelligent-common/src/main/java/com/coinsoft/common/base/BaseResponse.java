package com.coinsoft.common.base;

import com.github.pagehelper.PageInfo;

/**
 * 基础响应类
 */
public class BaseResponse extends BaseModel {
	private static final long serialVersionUID = -8360494373049378798L;
	/**
	 * 操作是否成功,0
	 */
	private int respCode = 0;
	/**
	 * 返回结果信息
	 */
	private String message="成功";

    private String attributes;
    /**
     * 分页信息
     */
    private PageInfo pageInfo=new PageInfo();

	public int getRespCode() {
		return respCode;
	}

	public void setRespCode(int respCode) {
		this.respCode = respCode;
	}

    public BaseResponse() {
    }

    public BaseResponse(int respCode, String message) {
        this.respCode = respCode;
        this.message = message;
    }

    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
