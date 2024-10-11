package net.ptidej.tutorial.forwarding.broken;

import java.util.Collection;
import java.util.HashSet;

import net.ptidej.tutorial.forwarding.CountingSet;

public class CountingHashSet<E> extends HashSet<E> implements CountingSet<E> {
	private static final long serialVersionUID = 1L;

	// Count of (attempted) added insertions
	private int addCount = 0;

	@Override
	public boolean add(final E e) {
		this.addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(final Collection<? extends E> c) {
		this.addCount += c.size();
		return super.addAll(c);
	}

	@Override
	public int getAddCount() {
		return this.addCount;
	}
}
