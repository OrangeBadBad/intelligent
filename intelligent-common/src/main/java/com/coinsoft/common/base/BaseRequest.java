package com.coinsoft.common.base;


import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * Created by wenhuang huang on 2017-06-05.
 * 基础请求类
 */
public class BaseRequest extends BaseModel {
	private static final long serialVersionUID = -7279227158845533268L;
	/**
	 * 客户端版本号
	 */
	private String clientVersion;

	private Map<String, String> attributes = Maps.newHashMap();
	public Map<String, String> getAttributes() {
		return attributes;
	}

	public BaseRequest setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
		return this;
	}

	/**
	 * 增加单个属性
	 *
	 * @param name
	 * @param value
	 */
	public void addAttribute(String name, String value) {
		if (StringUtils.isBlank(name)) {
			throw new IllegalArgumentException("attribute name is null");
		}

		if (null == this.attributes) {
			this.attributes = Maps.newHashMap();
		}
		this.attributes.put(name, value);
	}

	/**
	 * 增加批量属性
	 *
	 * @param attributes
	 */
	public void addAttributes(Map<String, String> attributes) {
		if (null == attributes) {
			return;
		}

		if (null == this.attributes) {
			this.attributes = Maps.newHashMap();
		}

		this.attributes.putAll(attributes);
	}

	public String getClientVersion() {
		return clientVersion;
	}


	public BaseRequest setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		return this;
	}
}
