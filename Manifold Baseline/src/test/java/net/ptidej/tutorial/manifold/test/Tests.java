package net.ptidej.tutorial.manifold.test;

import org.junit.jupiter.api.Assertions;

import net.ptidej.tutorial.manifold.Person;
import net.ptidej.tutorial.manifold.Student1;
import net.ptidej.tutorial.manifold.Student2;
import net.ptidej.tutorial.manifold.Student3;

class Tests {

	@org.junit.jupiter.api.Test
	void test() {
		final Person person = new Person("Harry Potter");

		final Student1 student1 = new Student1(person, "Transfiguration");
		// We would expect "Student Harry Potter"
		Assertions.assertEquals("Person Harry Potter", student1.getTitledName());

		final Student2 student2 = new Student2(person, "Transfiguration");
		Assertions.assertEquals("Student Harry Potter", student2.getTitledName());

		final Student3 student3 = new Student3("Harry Potter", "Transfiguration");
		Assertions.assertEquals("Student Harry Potter", student3.getTitledName());
	}

}
