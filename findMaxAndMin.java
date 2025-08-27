/*
 *Problem : Finding Max and Min in an Integer List 
 *
 *
 */
public static void findMaxAndMin() {
		List<Integer> numberList = Arrays.asList(12, 12, 50, 50, 32, 32, 59);
		
		int max = numberList.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println("Max :" + max);
		
		int min = numberList.stream().mapToInt(Integer::intValue).min().getAsInt();
		System.out.println("Min :" + min);
		
		Integer maxInt = numberList.stream().max((n1, n2) -> n2.compareTo(n1)).get();
		System.out.println("max using comparator :" + maxInt);
		
	}