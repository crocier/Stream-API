/*
 *Problem : Sorting Key / values in Hash Map using stream 
 *
 *
 */
public static void compareInHashMap() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Ajai");
		map.put(5, "Vino");
		map.put(2, "Crocier");
		map.put(0, "Virginia");

		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
	}