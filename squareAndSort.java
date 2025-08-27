/*
 *Problem : Square and sort numbers from a list
 *
 *
 */
public static void squareAndSort() {
		List<Integer> numberList = Arrays.asList(50, 50, 12, 12, 32, 32, 59);
		numberList.stream().map(n -> n * n).distinct().sorted().forEach(System.out::println);
	}