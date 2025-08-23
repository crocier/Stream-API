/*
 *Problem : To fetch second highest salary employee object using stream 
 *
 */
public static void fetchSecondHighestSalaryEmployee() {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Ajai", 500000.00));
		empList.add(new Employee("Crocier", 500000.00));
		empList.add(new Employee("Vijay", 600000.00));
		empList.add(new Employee("Vetri", 300000.00));
		empList.add(new Employee("Velu", 100000.00));

		Optional<Double> secondHighestSalary = empList.stream().map(e -> e.getSalary())
				.sorted(Comparator.reverseOrder()).skip(1).findFirst();
		if (secondHighestSalary.isPresent()) {
			Optional<Employee> secondHighestSalaryEmployee = empList.stream()
					.filter(e -> secondHighestSalary.get() == e.getSalary()).findFirst();
			if (secondHighestSalary.isPresent()) {
				System.out.println(secondHighestSalaryEmployee.get().getSalary());
			}
		}
	}