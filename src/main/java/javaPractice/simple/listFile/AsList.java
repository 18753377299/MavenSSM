package javaPractice.simple.listFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {
   public static void main(String [] args) {
     String  id = "BX11,BX12";
     String  [] ids = {"BX11","BX12"} ;
     String [] strArray = id.split(",");
     List<String> asStr = new ArrayList<String>(Arrays.asList(ids));
     for (String  str: asStr) {
    	 System.out.println("========="+str);
     }
   }
}
