package com.example.po.request;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

import com.example.vo.RiskReportAssess;
import com.example.vo.RiskReportFireDanger;
import com.example.vo.RiskReportMain;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午3:57:35
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Data
public class RiskRequestVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private RiskReportMain riskReportMainVo;
	/**关联火灾风险排查表*/
	private List<RiskReportFireDanger>  riskReportFireDangerList;
    /**echarts打分信息保存*/
    private  RiskReportAssess riskReportAssess;
	/*页码*/
    private Integer pageNo;
    /*每页条数*/
    private Integer pageSize;

		public static long getSerialVersionUID() {
			return serialVersionUID;
		}

		public RiskReportMain getRiskReportMainVo() {
			return riskReportMainVo;
		}

		public void setRiskReportMainVo(RiskReportMain riskReportMainVo) {
			this.riskReportMainVo = riskReportMainVo;
		}

		public List<RiskReportFireDanger> getRiskReportFireDangerList() {
			return riskReportFireDangerList;
		}

		public void setRiskReportFireDangerList(List<RiskReportFireDanger> riskReportFireDangerList) {
			this.riskReportFireDangerList = riskReportFireDangerList;
		}

		public RiskReportAssess getRiskReportAssess() {
			return riskReportAssess;
		}

		public void setRiskReportAssess(RiskReportAssess riskReportAssess) {
			this.riskReportAssess = riskReportAssess;
		}

		public Integer getPageNo() {
			return pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
	}
