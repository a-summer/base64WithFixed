package org.zky;

/**
 * base64算法，带混淆的
 */
public class Base64Utils {
    public static String decodeWithMix(String pwd){

       // pwd = "1451MDA0Mf311DE4MDUxOHwwOTY2VMzg=";
        String extrenal = pwd.substring(0,4);
        StringBuffer sb = new StringBuffer(extrenal);
        String hexStr = sb.reverse().toString();
        int desc = Integer.parseInt(hexStr,16);
        String descStr = String.valueOf(desc);
        String exHex =  pwd.substring(4,pwd.length());
        String first = exHex.substring(Integer.parseInt(descStr.substring(0,1)),Integer.parseInt(descStr.substring(0,1)) + Integer.parseInt(descStr.substring(1,2)));
        int start = exHex.length() - Integer.parseInt(descStr.substring(2,3));
        int counts = Integer.parseInt(descStr.substring(3,4)) ;
        String end = exHex.substring(start - counts,start);
        String real = exHex.replace(first,"").replace(end,"");
        // while(true){
        String realStr = new String(Base64.decode(real.getBytes()));
        return  realStr;
    }

    public static void main(String[] args) {

            System.out.println(decodeWithMix("4fa1MDA0MDjnN2oOZWZE4MDUxOHwwOTY2MzY="));

    }
}
