package db.tool.util;

import java.util.Random;

public class StringUtils {
	
	/**
	 * 长度 18位，不足前补0
	 * @param i
	 * @return
	 */
	public static String getAccountNo(long i){
		return String.format("%018d", i);
	}
	
	/**
	 * 6235688501000000001
	 * @param i
	 * @return
	 */
	public static String getFixAccountNo(long i){
		return "6235688501" + String.format("%09d", i);
	}
	
	public static String getContractId(long i){
		return "HT6235688501" + String.format("%09d", i);
	}
	
	/**
	 * 
	 * @return
	 */
	public static String getRandomAccountNo(){
		int x = new Random().nextInt(999999999);
		return getAccountNo(x);
	}
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++){
			//System.out.println(getFixAccountNo(i));
			System.out.println(getContractId(i));
		}
	}
}
