/*
 *Problem : Calculate total sum of an integer list using reduce
 *
 *
 */
public static void totalSum() {
		List<Integer> numberList = Arrays.asList(50, 50, 12, 12, 32, 32, 59);
		Integer totalSum = numberList.stream().reduce((n1, n2) -> n1 + n2).get();
		System.out.println("Total sum :" + totalSum);
	}