package UTIL;

import java.util.*;
class hashtablecl{
    private static Object yt;

    public static void main(String args[]){
    Hashtable ht=new Hashtable();
    Enumeration names;
    String str;
    double bal;
    ht.put("Valentin",new Double(32.25));
    ht.put("Ramy",new Double(23.45));
    ht.put("Soho",new Double(-25.45));

   names =ht.keys();
   while(names.hasMoreElements()){
     str=(String)names.nextElement();
    System.out.println(ht.get(str));
  }
  System.out.println();

 bal=((Double)ht.get("Valentin")).doubleValue();
 ht.put("Valentin",new Double(bal+200));
 System.out.println("new balance:"+ht.get("Valentin"));

  names =ht.keys();
        while(names.hasMoreElements()){
     str=(String)names.nextElement();
    System.out.println(ht.get(str));
  }
 }
}