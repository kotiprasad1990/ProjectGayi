package com.mani.gayi.ds.queue;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PriorityQueueImpl extends AbstractCollection<Integer> {

	private Comparator<Integer> compa = new DefaultComparator<Integer>();
	private int size;
	private List<Integer> list;

	@SuppressWarnings("hiding")
	private static class DefaultComparator<Integer> implements
			Comparator<Integer> {
		@SuppressWarnings("unchecked")
		@Override
		public int compare(Integer arg0, Integer arg1) {
			return ((Comparable<Integer>) arg0).compareTo(arg1);
		}
	}

	private class PQItr implements Iterator<Integer> {
		private int myCursor = 1;

		public Integer next() {
			return list.get(myCursor);
		}

		public boolean hasNext() {
			return myCursor <= size;
		}

		public void remove() {
			throw new UnsupportedOperationException("Remove not supported");
		}
	}

	public PriorityQueueImpl() {
		list = new ArrayList<Integer>(32);
		list.add(null);
		size = 0;
	}

	public PriorityQueueImpl(Collection<Integer> coll) {
		this();
		list.addAll(coll);
		size = coll.size();

		for (int k = coll.size() / 2; k >= 1; k--) {
			heapify(k);
		}
	}

	public boolean add(Integer o) {
		list.add(o);
		size++;
		int k = size;

		while (k > 1 && compa.compare(list.get(k / 2), o) > 0) {
			list.set(k, list.get(k / 2));
			k /= 2;
		}
		list.set(k, o);

		return true;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Object remove() {
		if (!isEmpty()) {
			Object hold = list.get(1);

			list.set(1, list.get(size));
			list.remove(size);
			size--;
			if (size > 1) {
				heapify(1);
			}
			return hold;
		}
		return null;
	}

	public Object peek() {
		return list.get(1);
	}

	public Iterator<Integer> iterator() {
		return new PQItr();
	}

	private void heapify(int vroot) {
		Integer last = list.get(vroot);
		int child, k = vroot;
		while (2 * k <= size) {
			child = 2 * k;
			if (child < size
					&& compa.compare(list.get(child), list.get(child + 1)) > 0) {
				child++;
			}
			if (compa.compare(last, list.get(child)) <= 0) {
				break;
			} else {
				list.set(k, list.get(child));
				k = child;
			}
		}
		list.set(k, last);
	}

	public static void main(String args[]) {
		Integer[] array = { 34, 56, 78, 99, 33 };
		System.out.println("Items before Priority Queue: "
				+ Arrays.asList(array));

		PriorityQueueImpl pq = new PriorityQueueImpl(Arrays.asList(array));

		System.out.print("Items After Priority Queue : [");
		while (pq.size() > 0) {
			if (pq.size() == 1)
				System.out.print(pq.peek());
			else
				System.out.print(pq.peek() + ", ");
			pq.remove();
		}
		System.out.print("]");
	}
}
