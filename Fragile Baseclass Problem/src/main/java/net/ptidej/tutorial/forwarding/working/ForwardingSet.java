package net.ptidej.tutorial.forwarding.working;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ForwardingSet<E> implements Set<E> {
	private final Set<E> s = new HashSet<E>();

	public void clear() {
		s.clear();
	}

	public boolean contains(final Object o) {
		return s.contains(o);
	}

	public boolean isEmpty() {
		return s.isEmpty();
	}

	public int size() {
		return s.size();
	}

	public Iterator<E> iterator() {
		return s.iterator();
	}

	public boolean add(final E e) {
		return s.add(e);
	}

	public boolean remove(final Object o) {
		return s.remove(o);
	}

	public boolean containsAll(final Collection<?> c) {
		return s.containsAll(c);
	}

	public boolean addAll(final Collection<? extends E> c) {
		return s.addAll(c);
	}

	public boolean removeAll(final Collection<?> c) {
		return s.removeAll(c);
	}

	public boolean retainAll(final Collection<?> c) {
		return s.retainAll(c);
	}

	public Object[] toArray() {
		return s.toArray();
	}

	public <T> T[] toArray(final T[] a) {
		return s.toArray(a);
	}

	public boolean equals(final Object o) {
		return s.equals(o);
	}

	public int hashCode() {
		return s.hashCode();
	}

	public String toString() {
		return s.toString();
	}
}
