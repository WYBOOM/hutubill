package util;

import java.awt.Color;

/*
 * 
 * ������ɫ
 	 	blueColor ����ɫ
		grayColor ��ɫ
		backgroundColor ����ɫ
		warningColor �����ɫ
 */

public class ColorUtil {
	public static Color blueColor = Color.decode("#3399FF");
    public static Color grayColor = Color.decode("#999999");
    public static Color backgroundColor = Color.decode("#eeeeee");
    public static Color warningColor = Color.decode("#FF3333");
    
    public static Color getByPercentage(int per){
    	if(per>100)
    		per =  100;
    	float rate = per/100f;
    	int r =51;
    	int g = 255;
    	int b = 51;
    	r = (int) ((255-51)*rate +51);
    	g =255-r+51; 
    	Color color = new Color(r, g, b);
    	return color;
    }

}
