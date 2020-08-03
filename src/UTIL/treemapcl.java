package UTIL;


import sun.text.normalizer.CodePointMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class treemapcl{


    public static void main(String args[])
  {
    TreeMap tm=new TreeMap();
    tm.put("Valentin",new Double(345.35));
    tm.put("Ramy",new Double(12.45));
    tm.put("Soho",new Double(90.25));
    
    Set s=tm.entrySet();
      CodePointMap set = null;
      Iterator i=set.iterator();
 
   while(i.hasNext()){
     Map.Entry m=(Map.Entry)i.next();
     System.out.print(m.getKey()+" ");
     System.out.println(m.getValue());
   }
   System.out.println();
   double d=((Double)tm.get("Ramy")).doubleValue();
   tm.put("Ramy",new Double(d+100));
   System.out.println("new value of Ravi:"+tm.get("Ramy"));
 }
}

  
    
