package priorityqueue;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] elements = new int[10000000];
		Random rand = new Random();
		for(int i = 0; i < elements.length; i++){
			elements[i] = rand.nextInt(500000000) + 1;
		}
		PriorityQueue queue = new PriorityQueue(elements);
		queue.constructMinHeap();
		// removing all elements from heap.
		while(!queue.isEmpty()) {
			int el = queue.extractMin();
		}
	}

}
