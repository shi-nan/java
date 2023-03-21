public class Test {
	public static void main1(String[] args) {
		int i=0;
		int sum=0;
		while(i<=5){
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

	public static void main2(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println(i);
				continue;
			}
		}
	}

	public static void main3(String[] args) {
		int i=1;
		while(i<=100){
			if(i%15!=0){
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		int ret = 1;
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			ret *= i;
			sum += ret;
		}
		System.out.println(sum);
		}
	}


