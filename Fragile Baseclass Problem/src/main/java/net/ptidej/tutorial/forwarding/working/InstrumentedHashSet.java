package net.ptidej.tutorial.forwarding.working;

import java.util.Collection;

import net.ptidej.tutorial.forwarding.CountingSet;

public class InstrumentedHashSet<E> extends ForwardingSet<E> implements CountingSet<E> {
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
