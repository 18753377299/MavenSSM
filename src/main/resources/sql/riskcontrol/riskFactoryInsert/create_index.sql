--为十大模板和主表创建索引

--煤矿       
create index  RiskReport_CoalMine_single_index  on  RiskReport_CoalMine(riskfileno);      
create index  RiskReport_CoalMine_more_index  on  RiskReport_CoalMine(riskfileno,proSafeAccident,safeProLevel,judgeStand);

--地下矿山      
create index  RiskReport_CoalMine_single_index  on  RiskReport_CoalMine(riskfileno);      
create index  RiskReport_CoalMine_more_index  on  RiskReport_CoalMine(riskfileno,proSafeAccident,safeProLevel,judgeStand);

--露天矿山      
create index  RiskReport_CoalMine_single_index  on  RiskReport_CoalMine(riskfileno);      
create index  RiskReport_CoalMine_more_index  on  RiskReport_CoalMine(riskfileno,proSafeAccident,safeProLevel,judgeStand);


