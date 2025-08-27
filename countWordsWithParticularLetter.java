/*
 *Problem : Count words starting with a particular letter from a list of strings
 *
 *
 */public static void countWordsWithParticularLetter() {
		List<String> list = Arrays.asList("asdsdf", "aerfdsd", "lkjhasd", "auyweasd", "gasgdas");
		
		long count = list.stream().filter(l -> l.startsWith("a")).count();
		
		System.out.println("Count of Words :" + count);
	}