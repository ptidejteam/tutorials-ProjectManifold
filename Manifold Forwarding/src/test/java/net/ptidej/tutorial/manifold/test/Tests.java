package net.ptidej.tutorial.manifold.test;

import org.junit.jupiter.api.Assertions;

import net.ptidej.tutorial.manifold.Person;
import net.ptidej.tutorial.manifold.Student;

class Tests {

	@org.junit.jupiter.api.Test
	void test() {
		final Person person = new Person("Harry Potter");
		final Student student = new Student(person, "Transfiguration");
		Assertions.assertEquals("Person Harry Potter", student.getTitledName());
	}

}
