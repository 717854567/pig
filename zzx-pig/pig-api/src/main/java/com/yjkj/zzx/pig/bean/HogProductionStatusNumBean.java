package com.yjkj.zzx.pig.bean;

import java.io.Serializable;

/**
 * 商品猪各个生产状态下猪只数量Bean
 * 
 * @author liuchao
 * @createDate 2018年5月24日
 *
 */
public class HogProductionStatusNumBean implements Serializable {

	private static final long serialVersionUID = 7015877874916503483L;

	private String num;
	private String type;
	private String typeName;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
