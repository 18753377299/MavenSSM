--为十大模板和主表创建索引，分别创建单个索引和联合索引

--煤矿  
drop index if exists  RiskReport_CoalMine_single_index; 
create index  RiskReport_CoalMine_single_index  on  RiskReport_CoalMine(riskfileno); 

drop index if exists  RiskReport_CoalMine_more_index;  
create index  RiskReport_CoalMine_more_index  on  RiskReport_CoalMine(riskfileno,proSafeAccident,safeProLevel,judgeStand);

--地下矿山     
drop index if exists  RiskReport_UndergroundMine_single_index;   
drop index if exists  RiskReport_UndergroundMine_more_index;   
create index  RiskReport_UndergroundMine_single_index  on  RiskReport_UndergroundMine(riskfileno);      
create index  RiskReport_UndergroundMine_more_index  on  RiskReport_UndergroundMine(riskfileno,safeprosaleratio,safeproaccident,safestandlevel,basehiddendanger);

--露天矿山 
drop index if exists  RiskReport_AbovegroundMine_single_index;   
drop index if exists  RiskReport_AbovegroundMine_more_index;      
create index  RiskReport_AbovegroundMine_single_index  on  RiskReport_AbovegroundMine(riskfileno);      
create index  RiskReport_AbovegroundMine_more_index  on  RiskReport_AbovegroundMine(riskfileno,safeprosaleratio,safeproaccident,safestandlevel,basehiddendanger);

---尾矿库
drop index if exists  RiskReport_TailingsLibrary_single_index;   
drop index if exists  RiskReport_TailingsLibrary_more_index; 
create index  RiskReport_TailingsLibrary_single_index  on  RiskReport_TailingsLibrary(riskfileno);      
create index  RiskReport_TailingsLibrary_more_index  on  RiskReport_TailingsLibrary(riskfileno,safeproaccident,safestandlevel,basehiddendanger);

---矿山排土场
drop index if exists  RISKREPORT_DUMPMINE_single_index;   
drop index if exists  RISKREPORT_DUMPMINE_more_index; 
create index  RISKREPORT_DUMPMINE_single_index  on  RISKREPORT_DUMPMINE(riskfileno);      
create index  RISKREPORT_DUMPMINE_more_index  on  RISKREPORT_DUMPMINE(riskfileno,safeProductionPercentage,safeStandardization,majorDangersCriteria);

---危险化学品
drop index if exists  RISKREPORT_CHEMICALS_single_index;   
drop index if exists  RISKREPORT_CHEMICALS_more_index; 
create index  RISKREPORT_CHEMICALS_single_index  on  RISKREPORT_CHEMICALS(riskfileno);      
create index  RISKREPORT_CHEMICALS_more_index  on  RISKREPORT_CHEMICALS(riskfileno,operatingRate,safeProductionInvestment,majorDangers);

---烟花爆竹
drop index if exists  RISKREPORT_FIRECRACKER_single_index;   
drop index if exists  RISKREPORT_FIRECRACKER_more_index; 
create index  RISKREPORT_FIRECRACKER_single_index  on  RISKREPORT_FIRECRACKER(riskfileno);      
create index  RISKREPORT_FIRECRACKER_more_index  on  RISKREPORT_FIRECRACKER(riskfileno,operatingRate,safeProductionRatio,majorHazard,majorDanger);

---建筑施工
drop index if exists  RISKREPORT_FACTORYCONSTRUCTION_single_index;   
drop index if exists  RISKREPORT_FACTORYCONSTRUCTION_more_index; 
create index  RISKREPORT_FACTORYCONSTRUCTION_single_index  on  RISKREPORT_FACTORYCONSTRUCTION(riskfileno);      
create index  RISKREPORT_FACTORYCONSTRUCTION_more_index  on  RISKREPORT_FACTORYCONSTRUCTION(riskfileno,financialRisk,majorDangerRectification,majorSafeHazards);

---民用爆炸品
drop index if exists  RISKREPORT_CIVILIANEXPLOSIVE_single_index;   
drop index if exists  RISKREPORT_CIVILIANEXPLOSIVE_more_index; 
create index  RISKREPORT_CIVILIANEXPLOSIVE_single_index  on  RISKREPORT_CIVILIANEXPLOSIVE(riskfileno);      
create index  RISKREPORT_CIVILIANEXPLOSIVE_more_index  on  RISKREPORT_CIVILIANEXPLOSIVE(riskfileno,safeProductionInvestment,productionSafeAccident,safeStandardization);

---金属冶炼
drop index if exists  RiskReport_SmeltMetal_single_index;   
drop index if exists  RiskReport_SmeltMetal_more_index; 
create index  RiskReport_SmeltMetal_single_index  on  RiskReport_SmeltMetal(riskfileno);      
create index  RiskReport_SmeltMetal_more_index  on  RiskReport_SmeltMetal(riskfileno,safeproaccident,safestandlevel,prodesignabilityratio,safeprosaleratio,basehiddendanger);

---main表
drop index if exists  riskreport_safefactorymain_single_index;   
drop index if exists  riskreport_safefactorymain_more_index; 
create index  riskreport_safefactorymain_single_index  on  riskreport_safefactorymain(riskfileno);      
create index  riskreport_safefactorymain_more_index  on  riskreport_safefactorymain(riskfileno,riskModel,underwriteFlag,rectifyFlag,score);



