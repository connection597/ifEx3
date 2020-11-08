//문제/ 19세 이하면 미성년자를 이상이면 성인을 출력하시오.
package ifEx3Test;

import java.util.Scanner;

public class IfEx3Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 :");
		
		int age = sc.nextInt();
		if(age <=19) {
			System.out.print("미성연자 입니다");
		}else {
			System.out.print("성인입니다");
		}

	}

}
