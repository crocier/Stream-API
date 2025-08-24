/*
 *Problem : To find distinct elements in the list
 *
 */
public static void findDistinctElements() {
		List<Integer> numberList = Arrays.asList(12, 12, 50, 50, 32, 32, 59);
		
		List<Integer> distinctElements = numberList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctElements);
		
		
	}