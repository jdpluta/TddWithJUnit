package com.jdp.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;
import com.jdp.logic.model.Fruit;

public class Test4Tester {
	@Test
	public void testEmptyList() {
	// given: an empty list
		List myList = new ArrayList();

		// when: we try to get the first element of the list
		when(myList).get(1);

		// then: we expect an IndexOutOfBoundsException
		then(caughtException())
		        .isInstanceOf(IndexOutOfBoundsException.class)
		        .hasMessage("Index: 1, Size: 0") 
		        .hasNoCause();
	}
	
	@Test
	public void testAssertIntegerList() {
		List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
		// All passed / true
		// 1. Test equal.
		assertThat((Collection<Integer>)actual, is((Collection<Integer>)expected));
		// 2. Check List has this value
		assertThat(actual, hasItems(2));
		// 3. Check List Size
		assertThat(actual, hasSize(4));
		assertThat(actual.size(), is(5));
		// 4. List order
		// Ensure Correct order
		assertThat(actual, contains(1, 2, 3, 4, 5));
		// Can be any order
		assertThat(actual, containsInAnyOrder(5, 4, 3, 2, 1));
		// 5. check empty list
		assertThat(actual, not(IsEmptyCollection.empty()));
		assertThat(new ArrayList<>(), IsEmptyCollection.empty());
		// 6. Test numeric comparisons
		assertThat(actual, everyItem(greaterThanOrEqualTo(1)));
		assertThat(actual, everyItem(lessThan(10)));
	}

	@Test
	public void testAssertList() {
		List<Fruit> list = Arrays.asList(new Fruit("Banana", 99), new Fruit("Apple", 20));
		// Test equals
		assertThat(list, hasItems(new Fruit("Banana", 99), new Fruit("Apple", 20)));
		assertThat(list, containsInAnyOrder(new Fruit("Apple", 20), new Fruit("Banana", 99)));
		// Test class property, and its value
		assertThat(list, containsInAnyOrder(hasProperty("name", is("Apple")), hasProperty("name", is("Banana"))));
	}
}
