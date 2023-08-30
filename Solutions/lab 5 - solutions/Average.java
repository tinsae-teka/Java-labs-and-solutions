public class Average{
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("No arguments");
			return;
		}

		int total = 0;
		System.out.println("Your input: ");
		for (int i=0; i < args.length; i++) {
			total += (Integer.parseInt(args[i]));
			System.out.println(args[i]);
		}
		System.out.println("Average: " + (total/args.length));
	}
}