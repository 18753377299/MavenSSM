//package com.picc.riskctrl.typhoonearlywarning.common;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.picc.riskctrl.common.schema.RiskMapMain;
//import com.picc.riskctrl.common.schema.WzCorporeLs;
//import com.picc.riskctrl.common.schema.vo.RiskMapMainVo;
//import com.picc.riskctrl.map.vo.WzTFYbljVo;
//import com.picc.riskctrl.typhoonearlywarning.service.facade.TyphoonEarlyWarningService;
//import com.picc.riskctrl.typhoonearlywarning.vo.RiskWarningPushVo;
//import com.picc.riskctrl.typhoonearlywarning.vo.TyphoonHistoryPathVo;
//import com.picc.riskctrl.typhoonearlywarning.vo.TyphoonLatestInfoVo;
//
//import ins.framework.mail.MailService;
//
//public class JobDetailForTyphoonEarlyWaring {
//
//	@Autowired
//	TyphoonEarlyWarningService typhoonEarlyWarningService;
//
//	@Autowired
//	MailService mailService;
//
//	protected void execute() {
//		// 台风 半径 机构 总保费 总保额
//
//		// 1、查询当前台风编号，可能包含多个台风
//		List<TyphoonLatestInfoVo> typhoonLatestInfoVoList = typhoonEarlyWarningService.queryLatestTyphoon();
//		if (typhoonLatestInfoVoList != null) {
//			List<RiskWarningPushVo> riskWarningPushVoList = new ArrayList<RiskWarningPushVo>(0);
//			TyphoonHistoryPathVo typhoonHistoryPathVo = new TyphoonHistoryPathVo();
//			for (TyphoonLatestInfoVo typhoonLatestInfoVo : typhoonLatestInfoVoList) {
//				// 2、查找当前台风预警阈值 WZ_RISKWARNINGPUSH,每个台风可能包含多条
//				riskWarningPushVoList = typhoonEarlyWarningService.queryTyphoonEarlyWarningInfo(typhoonLatestInfoVo);
//				// 3、查找当前台风 最新路径信息
//				typhoonHistoryPathVo = typhoonEarlyWarningService.queryTyphoonHistoryPath(typhoonLatestInfoVo);
//				// 4、根据 最新路径信息 查找当前台风预警路径 WZ_TFYBLJ,可能包含多条
//				List<WzTFYbljVo> tfybljVoLIST = typhoonEarlyWarningService
//						.queryTyphoonEarlyWarningPath(typhoonHistoryPathVo);
//				if (tfybljVoLIST != null && riskWarningPushVoList != null && tfybljVoLIST.size() > 0
//						&& riskWarningPushVoList.size() > 0) {
//					for (RiskWarningPushVo riskWarningPushVo : riskWarningPushVoList) {
//						if (riskWarningPushVo != null) {
//							// 5、根据每个阈值和预警路径获取预警受灾标的，可能包含多条
//							Map<String, List<WzCorporeLs>> comItems = typhoonEarlyWarningService
//									.queryTyphoonEarlyWarningPathItems(tfybljVoLIST, riskWarningPushVo);
//							if (!comItems.isEmpty()) {
//								// 6、根据每个阈值下的预警受灾标的的保单信息 RiskMapMain，推送预警信息
//								for (String comcode : comItems.keySet()) {
//									List<RiskMapMain> riskMapMainList = typhoonEarlyWarningService
//											.queryTyphoonEarlyWarningPloicy(comItems.get(comcode));
//									if(riskMapMainList != null) {
//										typhoonEarlyWarningService.gatherTyphoonEarlyWarningPloicy(riskWarningPushVo,riskMapMainList);
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//
//	}
//
//}
