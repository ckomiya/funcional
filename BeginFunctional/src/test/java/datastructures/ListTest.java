package datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import static datastructures.ListModule.*;

public class ListTest {

	List<String> EMPTYLS = emptyList(); // The String parameter is inferred!
	List<Long> EMPTYLL = emptyList();

	@Test(expected = EmptyListHasNoHead.class)
	public void callingHeadOnAnEmptyListRaises() {
		EMPTYLS.head();
	}

	@Test(expected = EmptyListHasNoTail.class)
	public void callingTailOnAnEmptyListRaises() {
		EMPTYLS.tail();
	}

	@Test
	public void callingTailOnAListWithMultiplElementsReturnsANonEmptyList() {
		List<String> tail = list("one", list("two", EMPTYLS)).tail();
		assertEquals(list("two", EMPTYLS), tail);
	}

	@Test
	public void callingHeadOnANonEmptyListReturnsTheHead() {
		String head = list("one", EMPTYLS).head();
		assertEquals("one", head);
	}

	@Test
	public void AllEmptyListsAreEqual() {
		assertEquals(EMPTYLS, EMPTYLL);
	}

	@Test
	public void ListsAreRecursiveStructures() {
		List<String> list1 = list("one", list("two", list("three", EMPTYLS)));
		assertEquals("(one, (two, (three, ())))", list1.toString());
	}
}
