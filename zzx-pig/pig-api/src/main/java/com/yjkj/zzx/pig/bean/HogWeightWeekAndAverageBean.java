package com.yjkj.zzx.pig.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 测重周记录(用于向前台返回记录)
 * 
 * @author cz
 * @createDate 2018年05月24日
 *
 */
public class HogWeightWeekAndAverageBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private float averageWeight;// 平均重量

	private String houseName;// 栋舍名称

	private String fieldCode;// 栏位编码

	private String batchCode;// 批次编码

	private String pigVarietyName;// 品种名称

	private String goodCapacity;// 正常猪数量

	private String growingDays;// 生长天数

	private Date bornDate;// 商品猪出生日期

	private Date forecastEndTime;// 预计出栏日期

	private String[] WeightY;// 当前周重量数组

	private String[] WeightBig;// 当前周重量最大数组

	private String[] WeightSmall;// 当前周重量最小数组

	private String[] CycleDataX; // 测重周期x周日期

	public float getAverageWeight() {
		return averageWeight;
	}

	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getFieldCode() {
		return fieldCode;
	}

	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getPigVarietyName() {
		return pigVarietyName;
	}

	public void setPigVarietyName(String pigVarietyName) {
		this.pigVarietyName = pigVarietyName;
	}

	public String getGoodCapacity() {
		return goodCapacity;
	}

	public void setGoodCapacity(String goodCapacity) {
		this.goodCapacity = goodCapacity;
	}

	public String getGrowingDays() {
		return growingDays;
	}

	public void setGrowingDays(String growingDays) {
		this.growingDays = growingDays;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public Date getForecastEndTime() {
		return forecastEndTime;
	}

	public void setForecastEndTime(Date forecastEndTime) {
		this.forecastEndTime = forecastEndTime;
	}

	public String[] getWeightY() {
		return WeightY;
	}

	public void setWeightY(String[] weightY) {
		this.WeightY = weightY;
	}

	public String[] getWeightBig() {
		return WeightBig;
	}

	public void setWeightBig(String[] weightBig) {
		this.WeightBig = weightBig;
	}

	public String[] getWeightSmall() {
		return WeightSmall;
	}

	public void setWeightSmall(String[] weightSmall) {
		this.WeightSmall = weightSmall;
	}

	public String[] getCycleDataX() {
		return CycleDataX;
	}

	public void setCycleDataX(String[] cycleDataX) {
		this.CycleDataX = cycleDataX;
	}

}
