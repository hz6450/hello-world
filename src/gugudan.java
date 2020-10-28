
public class gugudan {
	public static void main(String[] orgs) {
		int a = 2;
		int i = 1;
		while(a < 10) {
			System.out.println(a+"´Ü Ãâ·Â");
			while(i < 10) {
				int result = a * i;
				i = i + 1;
				System.out.println(result);
			}
			i = 1;
			a = a+1;
		}
	}

}
