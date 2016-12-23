package sandbox.simple_linked_list;

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

        int pos = 0;
        while (list.hasNext()) {
            String node = list.next();

            Assert.assertNotNull(node);
            Assert.assertEquals(WORDS[pos], node);

            // Make sure that each node before the last one has a next node.
            if (pos < WORDS.length - 1) {
                Assert.assertTrue(list.hasNext());
            }
        }

        Assert.assertEquals(pos + 1, WORDS.length);
    }

    @Test
    public void shouldClearAllNodes() {
        loadWords();

        // Remove the item at index 1 which should be "second"
        list.clear();
        Assert.assertEquals(0, list.size());

        Assert.assertTrue(list.isEmpty());
        Assert.assertNull(list.next());
    }

    private void loadWords() {
        // Load the linked list with words
        for (String word : WORDS) {
            list.add(word);
        }
    }
}
