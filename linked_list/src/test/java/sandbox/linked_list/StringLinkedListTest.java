package sandbox.linked_list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringLinkedListTest {
    private static final String[] WORDS = new String[]{"first", "second", "third"};
    private StringLinkedList list;

    @Before
    public void setUp() {
        list = new StringLinkedListImpl();
    }

    @Test
    public void shouldKnowHowManyNodesThereAre() {
        loadWords();

        Assert.assertEquals(WORDS.length, list.size());
    }

    @Test
    public void shouldKeepItemsInAddedOrder() {
        loadWords();

        StringLinkedNode node = list.head();

        // Check that the words from the list are in order
        for (int i = 0; i < WORDS.length; i++) {
            Assert.assertNotNull(node);
            Assert.assertEquals(WORDS[i], node.getValue());

            // Make sure that each node before the last one has a next node.
            if (i < WORDS.length - 1) {
                Assert.assertTrue(node.hasNext());
                node = node.getNext();
            }
        }

        Assert.assertFalse(node.hasNext());
    }

    @Test
    public void shouldClearAllNodes() {
        loadWords();

        // Remove the item at index 1 which should be "second"
        list.clear();
        Assert.assertEquals(0, list.size());

        Assert.assertTrue(list.isEmpty());
        Assert.assertNull(list.head());
    }

    private void loadWords() {
        // Load the linked list with words
        for (String word : WORDS) {
            list.add(word);
        }
    }
}
