public class ZigZag {

	public static void main(String args[]) {
		int a[] = { 4, 3, 3, 1, 3, 3, 1, 3 };
		int max_cont_seq_number = 0;
		int count = 0;

		if (a.length == 2) {
			System.out.println(max_cont_seq_number);
			return;
		}

		for (int i = 1; i < a.length - 1; i++) {
			if ((a[i] < a[i - 1] && a[i] < a[i + 1])
					|| (a[i] > a[i - 1] && a[i] > a[i + 1])
					|| (a[i] == a[i - 1] && a[i] == a[i + 1])) {
				count++;
			} else {
				if (count > max_cont_seq_number)
					max_cont_seq_number = count;
				count = 0;
			}
		}

		if (count > max_cont_seq_number)
			max_cont_seq_number = count;

		max_cont_seq_number = max_cont_seq_number + 2;
		
		if(max_cont_seq_number == a.length) max_cont_seq_number--;
		
		System.out.println(max_cont_seq_number);
	}

}
