// 반지름이 20cm인 피자 2개와 30cm인 1개의 면적을 비교하여 큰 면적을 주문하자. 
// 조건 연산자 이용 
public class Pizza {

	public static void main(String[] args) {
		double area1 = 2 * 3.14 * 20 * 20;	// 20cm 피자 면적 
		double area2 = 3.14 * 30 * 30;	// 30cm 피자 면적 	
		
		System.out.println("20cm 피자 면적 : " + area1);
		System.out.println("30cm 피자 면적 : " + area2);
		
		System.out.println((area1 > area2) ? "20cm 피자 주문!" : "30cm 피자 주문!");
	}

}
