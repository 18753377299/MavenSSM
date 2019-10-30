/*package com.picc.riskctrl.map.utils;

*//**
 * 地图相关数据处理
 *//*
public class MapUtil {

//    private static final Logger log = LoggerFactory.getLogger(MapUtil.class);
    
    public void geneXmlByDom(JSONObject json, double t){
		//step1:获得一个DocumentBuilderFactory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//step2:获得一个DocumentBuilder
		DocumentBuilder db;
		try {
			db = factory.newDocumentBuilder();
			//step3:新建一个Document对象
			Document document = db.newDocument();
			//step4:创建一个根节点
			Element rootElement = document.createElement("searchresult");
			rootElement.setAttribute("version", "v2.0.0");
			//创建status节点
			Element status = document.createElement("status");
			String statusValue = "E1";
			if(json.has("status") && json.getString("status").equals("0")) {
				statusValue ="E0";
			}
			status.setTextContent(statusValue);
			rootElement.appendChild(status);
			//创建time节点
			Element time = document.createElement("time");
			time.setTextContent(String.valueOf(t));
			rootElement.appendChild(time);
			//创建count节点
			int size = 0;
			JSONArray resultJsonArray = new JSONArray();
			if(json.has("result")) {
				resultJsonArray = json.getJSONArray("result");
				size = resultJsonArray.length();
				System.out.println(size+"==length");
			}
			Element count = document.createElement("count");
			count.setTextContent(String.valueOf(size));
			rootElement.appendChild(count);
			//创建list节点
			Element list = document.createElement("list");
			list.setAttribute("type", "list");
			rootElement.appendChild(list);
			for (int i=0;i<size;i++) {
				//step5:创建一个节点
				Element tip = document.createElement("tip");
				//step6:为该节点设定属性
				//为节点设定文本内容
				JSONObject result = resultJsonArray.getJSONObject(i);
				//取百度的name放入xml
				Element name = document.createElement("name");
				String nameJson = result.getString("name");
				name.setTextContent(nameJson);
				//拼接百度的city+district放入百度的district
				String cityJson = result.getString("city");
				String districtJson = result.getString("district");
				Element district = document.createElement("district");
				district.setTextContent(cityJson+" "+districtJson);
				//
				Element adcode = document.createElement("adcode");
				adcode.setTextContent("adcode_"+i);
				tip.appendChild(name);
				tip.appendChild(district);
				tip.appendChild(adcode);
				//step7:为某一元素节点设立子节点
				rootElement.appendChild(tip);
			}
			//step8:把刚刚建立的根节点添加到document对象中
			document.appendChild(rootElement);
			OutputFormat format = new OutputFormat(document,"GBK",true);  
	        //format.setIndenting(true);//设置是否缩进，默认为true  
	        //format.setIndent(4);//设置缩进字符数  
	        //format.setPreserveSpace(false);//设置是否保持原来的格式,默认为 false  
	        //format.setLineWidth(500);//设置行宽度  
			StringWriter stringWriter = new StringWriter();
	         XMLSerializer serializer = new XMLSerializer(stringWriter,format);  
	         serializer.asDOMSerializer();  
	         serializer.serialize(document);  
	         String result = stringWriter.toString();  
	         System.out.println(result);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
    /**
	 * 
	 * @Title: packageGaodeSuggestionResp
	 * @Description: 解析百度地图录入提示返回的xml
	 * @Author: MaXiao
	 * @param @param result
	 * @return void
	 * @throws
	 
	public void packageGaodeSuggestionResp(String result, double time){
		JSONObject resultJson = JSONObject.fromString(result);
		//判断状态码 status=0：成功2：参数错误 3：权限或配额校验失败
		geneXmlByDom(resultJson, time);
	
	}
	
	/**
	 * 
	 * @Title: getFirstCoordFromGeoCodingJsonString
	 * @Description: 解析Suggestion API的地址转坐标
	 * @Author: MaXiao
	 * @param @param CoordsString
	 * @param @param usingDistrictCoord
	 * @param @return
	 * @return AddressCoord
	 * @throws
	 
	public static AddressCoord getFirstCoordFromGeoCodingJsonString(String CoordsString, boolean usingDistrictCoord) {
		if (CoordsString == null || "".equals(CoordsString)) {
			return null;
		}
		AddressCoord addressCoord = null;
		try {
			String addrName = "";
			JSONObject coordsJson = JSONObject.fromString(CoordsString);
			if (!coordsJson.has("status")) {
				return null;
			}
			if (!coordsJson.has("result")) {
				return null;
			}
			JSONArray resultJsonArray = coordsJson.getJSONArray("result");
			if(resultJsonArray.length()<=0) {
				return null;
			}
			JSONObject resultJson = resultJsonArray.getJSONObject(0);
			System.out.println(resultJson.toString());
			if(!resultJson.has("location")) {
				return null;
			}
			JSONObject locationJson = resultJson.getJSONObject("location");
			if(!locationJson.has("lat")|| !locationJson.has("lng")) {
				return null;
			}
			double lat = locationJson.getDouble("lat");
			double lng = locationJson.getDouble("lng");
			String name = "";
			if(resultJson.has("name")) {
				name = resultJson.getString("name");
			}
			addressCoord = new AddressCoord(addrName
					+ name, "GEOCODE", "",
					lng, lat);
		} catch (Exception e) {
			log.error("解析地址错误！");
			log.error(CoordsString);
			log.error("地址解析", e);
		}
		return addressCoord;
	}

    
    /**
     * 获取地址转坐标字符串中的第一个坐标
     * @param CoordsString
     * @return
     
    public static AddressCoord getFirstCoordFromGeoCodingJsonString(String CoordsString, boolean usingDistrictCoord){

        if(CoordsString == null || "".equals(CoordsString))
        {
            return null;
        }
        AddressCoord addressCoord = null;
        try
        {
            String addrName = "";
            JSONObject jsonObject = JSONObject.fromString(CoordsString);
            if(jsonObject.has("list")) {
                JSONArray jsonArray = jsonObject.getJSONArray("list");
                if(jsonArray.length() > 0) {
                    jsonObject = jsonArray.getJSONObject(0);
                    if(jsonObject.has("nearhns"))
                    {
                        addrName = jsonObject.getString("name");
                        jsonArray = jsonObject.getJSONArray("nearhns");
                        if(jsonArray == null || jsonArray.length()==0)
                        {
                            return null;
                        }
                        jsonObject =jsonArray .getJSONObject(0);
                    }
                    // 涉及到区县、市、省的定位不处理
                    String level ="";
                    if(jsonObject.has("level")){
                        level = jsonObject.getString("level");
                        if("GL_CITY".equals(level) || "GL_PROVINCE".equals(level)  || "GL_COUNTRY".equals(level)){
                        	return null;
                        }
                        if(!usingDistrictCoord && "GL_DISTRICT".equals(level)){
                            return null;
                        }

                    }
                    addressCoord = new AddressCoord(addrName+jsonObject.getString("name"),"GEOCODE",level,jsonObject.getDouble("x"),jsonObject.getDouble("y"));
                }
            }
        }
        catch (Exception e)
        {
            log.error("解析地址错误！");
            log.error(CoordsString);
            log.error("地址解析",e);
        }

        return addressCoord;
    }


    *//**
     * 获取地址转坐标字符串中的第一个POI坐标点，如果没有找到poi坐标点则返回
     * 现仅仅自动调度使用
     * @param CoordsString
     * @return
     
    public static AddressCoord getFirstPoiCoordFromGeoCodingJsonString(String CoordsString){
        if(CoordsString == null || "".equals(CoordsString))
        {
            return null;
        }
        AddressCoord addressCoord = null;
        try
        {
            String addrName = "";
            JSONObject jsonObject = JSONObject.fromString(CoordsString);
            if(jsonObject.has("list")) {
                JSONArray jsonArray = jsonObject.getJSONArray("list");
                if(jsonArray.length() > 0) {
                    jsonObject = jsonArray.getJSONObject(0);
                    if(jsonObject.has("nearhns"))
                    {
                        addrName = jsonObject.getString("name");
                        jsonArray = jsonObject.getJSONArray("nearhns");
                        if(jsonArray == null || jsonArray.length()==0)
                        {
                            return null;
                        }
                        jsonObject =jsonArray .getJSONObject(0);
                        addressCoord = new AddressCoord(addrName+jsonObject.getString("name"),jsonObject.getDouble("x"),jsonObject.getDouble("y"));
                    }
                }
            }
        }
        catch (Exception e)
        {
            log.error("解析地址错误！");
            log.error(CoordsString);
            log.error("地址解析",e);
        }
        return addressCoord;
    }
*//*
	*//**
	 * 
	 * @Title: getFirstPoiCoordFromPOIJsonString
	 * @Description: 解析POI搜索返回的json
	 * @Author: MaXiao
	 * @param @param CoordsString
	 * @param @return
	 * @return AddressCoord
	 * @throws
	 
	public static AddressCoord getFirstPoiCoordFromPOIJsonString(
			String CoordsString) {
		AddressCoord addressCoord = null;
		try {
			// MaXiao change gaode to baidu 解析POI搜索返回的json

			JSONObject poiJson = JSONObject.fromString(CoordsString);
			
			if (!poiJson.has("status")
					|| !"0".equals(poiJson.getString("status"))) {
				return null;
			}
			if (poiJson.has("results")) {
				if (poiJson.get("results") instanceof JSONArray) {
					JSONArray resultsJsonArray = poiJson.getJSONArray("results");
					if (resultsJsonArray.length() > 0) {
						JSONObject resultJson = resultsJsonArray.getJSONObject(0);
						String name = "";
						if(resultJson.has("name")) {
							name = resultJson.getString("name");
						}
						String match = "";
						double x =0.0;
						double y =0.0;
						if(resultJson.has("location")) {
							JSONObject locJson = resultJson.getJSONObject("location");
							
							if(locJson.has("lat") && locJson.has("lng")) {
								x = locJson.getDouble("lng");
								y = locJson.getDouble("lat");
							}
						}
						addressCoord = new AddressCoord(name, "POI", match, x, y);
						System.out.println(name+" "+ "POI"+" "+ match+" "+ x+" " +y);
					}
				} 
			}
		} catch (Exception e) {
			log.error("解析POI搜索结果错误！");
			log.error(CoordsString);
			log.error("error", e);
		}
		return addressCoord;
	}
    /**
     * 获取地址转坐标字符串中的第一个POI坐标点，如果没有找到poi坐标点则返回
     * 现仅仅自动调度使用
     * @param CoordsString
     * @return
     
    public static AddressCoord getFirstPoiCoordFromPOIJsonString(String CoordsString){
        AddressCoord addressCoord = null;
        try
        {
//            String addrName = "";
            JSONObject jsonObject = JSONObject.fromString(CoordsString);
            if(!jsonObject.has("status") || !"E0".equals(jsonObject.getString("status")))
            {
                return null;
            }
            if(jsonObject.has("list") ) {
                if(jsonObject.get("list") instanceof JSONArray)
                {
                    JSONArray jsonArray = jsonObject.getJSONArray("list");
                    if(jsonArray.length() > 0) {
                        jsonObject = jsonArray.getJSONObject(0);
                        addressCoord = new AddressCoord(jsonObject.getString("name"),"POI",jsonObject.getString("match"),jsonObject.getDouble("x"),jsonObject.getDouble("y"));
                    }
                }
                else {
                    jsonObject = jsonObject.getJSONObject("list");
                    if(jsonObject.has("poi"))
                    {
                        jsonObject = jsonObject.getJSONObject("poi");
                        addressCoord = new AddressCoord(jsonObject.getString("name"),"POI",jsonObject.getString("match"),jsonObject.getDouble("x"),jsonObject.getDouble("y"));
                    }
                }
            }
        }
        catch (Exception e)
        {
            log.error("解析POI搜索结果错误！");
            log.error(CoordsString);
            log.error("error",e);
        }
        return addressCoord;
    }
*//*
	
	*//**
	 * 
	 * @Title: getDistanceFromNavigateJsonStringBD
	 * @Description: 处理详细导航的返回字符串
	 * @Author: MaXiao
	 * @param @param navStr
	 * @param @return
	 * @return double
	 * @throws
	 
	public static double getDistanceFromNavigateJsonStringBD(String navStr) {
		if (navStr == null || "".equals(navStr)) {
			return 0;
		}
		JSONObject navJson = JSONObject.fromString(navStr);
		//判断状态码 status=0：成功2：参数错误 3：权限或配额校验失败
		if (!navJson.has("status")) {
			return 0;
		} else if(navJson.getString("status").equals("2")) {
			log.error("导航路线失败 2：参数错误");
			return 0;
		} else if(navJson.getString("status").equals("3")) {
			log.error("导航路线失败 3：权限或配额校验失败");
			return 0;
		}
		if (!navJson.has("result")) {
			return 0;
		}
		JSONObject resultJson = navJson.getJSONObject("result");
		System.out.println(resultJson.toString());
		if (!resultJson.has("routes")) {
			return 0;
		}
		JSONArray routesJson = resultJson.getJSONArray("routes");
		System.out.println(routesJson.toString());
		if (routesJson.length()<=0) {
			return 0;
		}
		JSONObject routeJson = routesJson.getJSONObject(0);
		System.out.println(routeJson.toString());
		if (!routeJson.has("distance")) {
			return 0;
		}
//		JSONObject distanceJson = elementJson.getJSONObject("distance");
//		System.out.println(distanceJson.toString());
//		if (!distanceJson.has("value")) {
//			return 0;
//		}
		String distanceValue = routeJson.getString("distance");
		double distance = str2Double(distanceValue);
		return distance;
	}

	/**
	 * TODO
	 * @Title: getDistanceFromNavigateJsonStringBD
	 * @Description: 处理简略导航的返回字符串
	 * @Author: MaXiao
	 * @param @param navDec
	 * @param @return
	 * @return double
	 * @throws 
	 * return：{"status":0,"message":"ok","info":{"copyright":{"text":"@2015 Baidu - Data","imageUrl":"http:\/\/api.map.baidu.com\/images\/copyright_logo.png"}},"result":{"elements":[{"distance":{"text":"28.5公里","value":28464},"duration":{"text":"59分钟","value":3510}}]}}
	 
	public static double getDistanceFromRouteJsonStringBD(String navStr) {
		if (navStr == null || "".equals(navStr)) {
			return 0;
		}
		JSONObject navJson = JSONObject.fromString(navStr);
		//判断状态码 status=0：成功2：参数错误 3：权限或配额校验失败
		if (!navJson.has("status")) {
			return 0;
		} 
		if(navJson.getString("status").equals("2")) {
			log.error("导航路线失败 2：参数错误");
			return 0;
		} else if(navJson.getString("status").equals("3")) {
			log.error("导航路线失败 3：权限或配额校验失败");
			return 0;
		} else if(!navJson.getString("status").equals("0")) {
			
		}
		if (!navJson.has("result")) {
			return 0;
		}
		JSONObject resultJson = navJson.getJSONObject("result");
		System.out.println(resultJson.toString());
		if (!resultJson.has("elements")) {
			return 0;
		}
		JSONArray elementsJson = resultJson.getJSONArray("elements");
		System.out.println(elementsJson.toString());
		if (elementsJson.length()<=0) {
			return 0;
		}
		JSONObject elementJson = elementsJson.getJSONObject(0);
		System.out.println(elementJson.toString());
		if (!elementJson.has("distance")) {
			return 0;
		}
		JSONObject distanceJson = elementJson.getJSONObject("distance");
		System.out.println(distanceJson.toString());
		if (!distanceJson.has("value")) {
			return 0;
		}
		String distanceValue = distanceJson.getString("value");
		double distance = str2Double(distanceValue);
		return distance;
	}
    /**
     * 计算距离
     * @param navDec 高德导航返回的字符串
     * @return
     
    public static double getDistanceFromNavigateJsonString(String navDec)
    {
        if(navDec == null || "".equals(navDec))
        {
            return 0;
        }
        JSONObject jsonObject = JSONObject.fromString(navDec);
        if(!jsonObject.has("list")){
        	return 0;
        }
        JSONArray jsonArray = jsonObject.getJSONArray("list");
        double distance = 0;
        for(int i=0; i<jsonArray.length(); i++)
        {
            String strRoadLength = jsonArray.getJSONObject(i).getString("roadLength");
            if(strRoadLength.indexOf("千米")>0){
                distance += str2Double(strRoadLength.replace("千米",""))*1000;
            }else{
                distance += str2Double(strRoadLength.replace("米",""));
            }
        }
        // 老版本高德返回数据
//        JSONObject jsonObject = JSONObject.fromString(navDec);
//        if(!jsonObject.has("segmengList"))
//            return 0;
//        JSONArray jsonArray = jsonObject.getJSONArray("segmengList");
//        double distance = 0;
//        for(int i=0; i<jsonArray.length(); i++)
//        {
//            distance+=jsonArray.getJSONObject(i).getDouble("roadLength");
//        }
        return distance;
    }
*//*
    *//**
     * 字符串转double
     * @param str
     * @return
     *//*
    private static double str2Double(String str)
    {
        try
        {
            return Double.parseDouble(str);
        }
        catch (Exception e)
        {
            log.error("异常:",e);
            return 0;
        }
    }
    *//**
     * 根据当前登录人的数据权限，获取对应的地图url和中心点位置
     * @return
     *//*
//    public static MapConfig getMapZoomData(List<PermitCompany> permits)
//    {
//        MapConfig config = new MapConfig();
//        if(permits == null || permits.size()==0){
//            return config;
//        }
//        try
//        {
//            SystemConfigManager configManager = SystemConfigManager.getInstance();
//            String mapUrl = configManager.getConfig("map",permits.get(0).getCOMCODE(),"mapurl",config.getMapUrl() );
//            double centerX = Double.parseDouble(configManager.getConfig("map",permits.get(0).getCOMCODE(),"mapCenterX",Double.toString(config.getCenterX())));
//            double centerY = Double.parseDouble(configManager.getConfig("map",permits.get(0).getCOMCODE(),"mapCenterY",Double.toString(config.getCenterY())));
//            String useGaoDe = configManager.getConfig("map",permits.get(0).getCOMCODE(),"mapUseGaoDeMap","false");
//            int level = Integer.parseInt(configManager.getConfig("map",permits.get(0).getCOMCODE(),"mapLevel",Integer.toString(config.getLevel())));
//            config.setCenterX(centerX);
//            config.setCenterY(centerY);
//            config.setLevel(level);
//            config.setMapUrl(mapUrl);
//            config.setUseGaoDeMap(useGaoDe);
//            config.setMapType(getCurMapType(permits.get(0).getCOMCODE()));
//            //配置百度地图的ak
//            String ak = configManager.getBDKeyByShengComCode(permits.get(0).getCOMCODE());
////            String ak = MapConfig.mapConfig.getProperty(permits.get(0).getCOMCODE());
//            config.setAk(ak);
//        }
//        catch (Exception e)
//        {
//            log.error("获取地图显示配置时发生错误！",e);
//        }
//        return config;
//    }

    *//**
     * 米转换成经纬度
     * @param mx
     * @param my
     * @return
     *//*
    public static double[] metersToLonLat(double mx,double my)
    {
        double originShift = 2 * Math.PI * 6378137/2;
        double lon =(mx / originShift) * 180.0;
        double lat =(my / originShift) * 180.0;
        lat=180 / Math.PI * (2 * Math.atan(Math.exp(lat * Math.PI / 180.0)) - Math.PI / 2.0);
        return new double[]{lon,lat};
    }

    *//**
     * 将经纬度坐标转换成以米的坐标
     * @param lon
     * @param lat
     * @return
     *//*
    public static double[] lonLatToMeters(double lon,double lat)
    {
        double originShift = 2 * Math.PI * 6378137/2;
        double mx = lon * originShift / 180;
        double my = Math.log(Math.tan((90 + lat) * Math.PI / 360)) / (Math.PI / 180);
        my=my * originShift / 180;
        return new double[]{mx, my};
    }

    *//**
     * 计算两点间距离
     * @param point1
     * @param point2
     * @return
     *//*
    public static double calDistanceByTowPoint(double[] point1,double[] point2)
    {
        return Math.pow(Math.pow(point1[0]-point2[0],2)+Math.pow(point1[1]-point2[1],2),0.5);
    }

    *//**
     * 将米的距离转换成经纬度距离
     * @param meterDistance
     * @return
     *//*
    public static double meterDistanceToDegreeDistance(double x,double y, double meterDistance)
    {
        double[] point = new double[]{x,y};
        // 将xy，转换成以米为单位的坐标
        double[] meterXY = lonLatToMeters(x,y);
        // 计算横坐标偏移点坐标
        double[] hOffsetCoord = metersToLonLat(meterXY[0]+meterDistance,meterXY[1]);
        // 计算纵坐标便宜点坐标
        double[] vOffsetCoord = metersToLonLat(meterXY[0],meterXY[1]+meterDistance);
        return (calDistanceByTowPoint(point,hOffsetCoord)+calDistanceByTowPoint(point,vOffsetCoord))/2;
    }

    *//**
     * 通过经纬度获取距离
     * @param longitude
     * @param latitude
     * @param longitude1
     * @param latitude1
     * @return
     *//*
    public static double getDistanceFromDegreeCoords(double longitude, double latitude, Double longitude1, Double latitude1) {
        double[] point1 = lonLatToMeters(longitude,latitude);
        double[] point2 = lonLatToMeters(longitude1,latitude1);
        return calDistanceByTowPoint(point1,point2);
    }

    *//**
     * 从地址中获取坐标
     * @param address
     * @return
     *//*
//    public static AddressCoord getCoordByAddress(String address){
//        AddressCoord addressCoord = null;
//        String regexp = "\\[((\\d+\\.\\d+)|(\\d+)),((\\d+\\.\\d+)|(\\d+))\\]";
//        Pattern pattern = Pattern.compile(regexp);
//        Matcher matcher = pattern.matcher(address);
//        if (matcher.find()) {
//            String coordStr = matcher.group();
//            String[] coordStrArr = coordStr.substring(1, coordStr.length() - 1).split(",");
//            double[] coord = new double[2];
//            addressCoord = new AddressCoord(address,Double.parseDouble(coordStrArr[0]),Double.parseDouble(coordStrArr[1]));
//        }
//        return addressCoord;
//    }

    *//**
     * 判断坐标是否有效
     * @param longitude
     * @param latitude
     * @return
     *//*
    public static boolean isValid(Double longitude, Double latitude){
        if (longitude == null || latitude == null) {
            return false;
        }
        if (longitude > 73.55 && longitude < 135.08333333333333333 && latitude > 3.85 && latitude < 53.55) {
            return true;
        }
        return false;
    }
    *//**
     * 新添加
     * @param comCode
     * @return
     *//*
//	public static String getCurMapType(String comCode) {
//		String shengComCode = DictionaryManager.getShengComCode(comCode);
//		SystemConfigManager systemConfigManager =SystemConfigManager.getInstance();
//		String mapType=systemConfigManager.getConfig("mapType",shengComCode,"mapType","true");
//		if(mapType.equals(MapDefaultParams.MAPTYPE_NAME_BD)) {
//			return MapDefaultParams.MAPTYPE_NAME_BD;
//		} else if(mapType.equals(MapDefaultParams.MAPTYPE_NAME_GD)) {
//			return MapDefaultParams.MAPTYPE_NAME_GD;
//		} else {
//			return MapDefaultParams.MAPTYPE_NAME_GD;
//		}
//	}
}*/