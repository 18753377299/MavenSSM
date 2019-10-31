package com.example.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class LeaveBasic implements Serializable {
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "工号")
    private String jobNum;

    @ApiModelProperty(value = "员工姓名")
    private String employeeName;

    @ApiModelProperty(value = "所属团队代码")
    private String teamCode;

    @ApiModelProperty(value = "所属团队名称")
    private String teamName;

    @ApiModelProperty(value = "所属项目代码")
    private String projectCode;

    @ApiModelProperty(value = "所属项目名称")
    private String projectName;

    @ApiModelProperty(value = "年假总天数")
    private Byte annualDay;

    @ApiModelProperty(value = "已用年假天数")
    private Byte usedAnnualDay;

    @ApiModelProperty(value = "倒休总天数")
    private Byte retreatDay;

    @ApiModelProperty(value = "已用倒休天数")
    private Byte usedRetreatDay;

    @ApiModelProperty(value = "病假总天数")
    private Byte sickDay;

    @ApiModelProperty(value = "已用病假天数")
    private Byte usedSickDay;

    @ApiModelProperty(value = "插入时间")
    private Date insertTimeForHis;

    @ApiModelProperty(value = "更新时间")
    private Date operateTimeForHis;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum == null ? null : jobNum.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode == null ? null : teamCode.trim();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public Byte getAnnualDay() {
        return annualDay;
    }

    public void setAnnualDay(Byte annualDay) {
        this.annualDay = annualDay;
    }

    public Byte getUsedAnnualDay() {
        return usedAnnualDay;
    }

    public void setUsedAnnualDay(Byte usedAnnualDay) {
        this.usedAnnualDay = usedAnnualDay;
    }

    public Byte getRetreatDay() {
        return retreatDay;
    }

    public void setRetreatDay(Byte retreatDay) {
        this.retreatDay = retreatDay;
    }

    public Byte getUsedRetreatDay() {
        return usedRetreatDay;
    }

    public void setUsedRetreatDay(Byte usedRetreatDay) {
        this.usedRetreatDay = usedRetreatDay;
    }

    public Byte getSickDay() {
        return sickDay;
    }

    public void setSickDay(Byte sickDay) {
        this.sickDay = sickDay;
    }

    public Byte getUsedSickDay() {
        return usedSickDay;
    }

    public void setUsedSickDay(Byte usedSickDay) {
        this.usedSickDay = usedSickDay;
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
        sb.append(", jobNum=").append(jobNum);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", teamCode=").append(teamCode);
        sb.append(", teamName=").append(teamName);
        sb.append(", projectCode=").append(projectCode);
        sb.append(", projectName=").append(projectName);
        sb.append(", annualDay=").append(annualDay);
        sb.append(", usedAnnualDay=").append(usedAnnualDay);
        sb.append(", retreatDay=").append(retreatDay);
        sb.append(", usedRetreatDay=").append(usedRetreatDay);
        sb.append(", sickDay=").append(sickDay);
        sb.append(", usedSickDay=").append(usedSickDay);
        sb.append(", insertTimeForHis=").append(insertTimeForHis);
        sb.append(", operateTimeForHis=").append(operateTimeForHis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}