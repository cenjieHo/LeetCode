package algorithms.hashtable.easy.countPrimes;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		long startTime=System.currentTimeMillis();
		System.out.println(solution.countPrimes(10));
		System.out.println(solution.countPrimes(1));
		System.out.println(solution.countPrimes(499979));
		long endTime=System.currentTimeMillis();
		float excTime=(float)(endTime-startTime);
		System.out.println("Ö´ÐÐÊ±¼ä£º"+excTime+"ms");
	}
}
