package net.ptidej.tutorial.forwarding.working.manifold;

import java.util.Collection;
import java.util.HashSet;

import manifold.ext.delegation.rt.api.link;
import net.ptidej.tutorial.forwarding.CountingSet;

public class CountingHashSet<E> implements CountingSet<E> {
	private static final long serialVersionUID = 1L;

	@link
	HashSet<E> s;
	
	// Count of (attempted) added insertions
	private int addCount = 0;
	
	public CountingHashSet() {
		this.s = new HashSet<E>();
	}

	@Override
	public boolean add(final E e) {
		this.addCount++;
		return this.s.add(e);
	}

	@Override
	public boolean addAll(final Collection<? extends E> c) {
		this.addCount += c.size();
		return this.s.addAll(c);
	}

	@Override
	public int getAddCount() {
		return this.addCount;
	}
}
