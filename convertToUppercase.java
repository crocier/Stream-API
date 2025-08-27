/*
 *Problem : Convert a list of strings to uppercase
 *
 *
 */
public static void convertToUppercase() {
		List<String> list = Arrays.asList("asdsdf", "aerfdsd", "lkjhasd", "auyweasd", "gasgdas");
		list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
	}