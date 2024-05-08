class Command {
	public static void main(String[] args) {
		int sum = 0;

		for (String arg : args) {
			int num = Integer.parseInt(arg);
			sum = sum + num;
		}

		double avg = (double) sum / args.length;

		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
	}
}