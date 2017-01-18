/**
 * Validator.java
 * rgqancy.classinherit
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017年1月18日 		renguoqiang
 *
 * Copyright (c) 2017, yuanchuangyun All Rights Reserved.
*/

package rgqancy.classinherit;

import java.io.IOException;

/**
 * ClassName:Validator
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   renguoqiang
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年1月18日		下午5:06:52
 *
 * @see 	 
 */
public class Validator {

	public static void main(String[] args) {
		BaseClass b = new BaseClass();
		System.out.println("BaseClass b：" + b.className);

		ChildClass c = new ChildClass();
		System.out.println("ChildClass c：" + c.className);

		BaseClass bc = new ChildClass();
		System.out.println("BaseClass bc：" + bc.className);
		
		try {
			System.in.read();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

