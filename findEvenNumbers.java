/*
 *Problem : To find even numbers
 *
 */
public static void findEvenNumbers() {
		List<Integer> numberList = Arrays.asList(12, 45, 50, 43, 32, 31, 59);
		
		List<Integer> evenNumberList = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumberList);
	}
