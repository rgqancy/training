/**
 * SpeedTest.java
 * rgqancy
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年12月27日 		renguoqiang
 *
 * Copyright (c) 2016, yuanchuangyun All Rights Reserved.
*/

package rgqancy;
/**
 * ClassName:SpeedTest
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   renguoqiang
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年12月27日		上午11:31:01
 *
 * @see 	 
 */
public class SpeedTest {

	public static void main(String[] args) {
		SpeedTest test = new SpeedTest();

		System.out.println(System.currentTimeMillis());
		System.out.println(test.getClass());
		System.out.println(System.currentTimeMillis());

		System.out.println(System.currentTimeMillis());
		System.out.println(SpeedTest.class);
		System.out.println(System.currentTimeMillis());
	}

}

