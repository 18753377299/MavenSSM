package com.example.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class LeaveSpecialDate implements Serializable {
    @ApiModelProperty(value = "特殊节假日Id")
    private String id;

    @ApiModelProperty(value = "特殊节假日类型,0:本来该工作变成休息日,1:本来休息变成工作日,2:本来休息变成节日正日三薪日")
    private String dateType;

    @ApiModelProperty(value = "特殊节假日日期")
    private Date date;

    @ApiModelProperty(value = "插入时间")
    private Date insertTimeForHis;

    @ApiModelProperty(value = "修改时间")
    private Date operateTimeForHis;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType == null ? null : dateType.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getInsertTimeForHis() {
        return insertTimeForHis;
    }

    public void setInsertTimeForHis(Date insertTimeForHis) {
        this.insertTimeForHis = insertTimeForHis;
    }

    public Date getOperateTimeForHis() {
        return operateTimeForHis;
    }

    public void setOperateTimeForHis(Date operateTimeForHis) {
        this.operateTimeForHis = operateTimeForHis;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dateType=").append(dateType);
        sb.append(", date=").append(date);
        sb.append(", insertTimeForHis=").append(insertTimeForHis);
        sb.append(", operateTimeForHis=").append(operateTimeForHis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}