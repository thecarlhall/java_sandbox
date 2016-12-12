package sandbox.linked_list;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class RemovableStringLinkedListTest {
    private static final String[] WORDS = new String[]{"first", "second", "third"};
    private StringLinkedList list;

    @Before
    public void setUp() {
        // TODO instantiate your implementation of RemovableStringLinkedList
        // list = new StringLinkedListImpl();

        Assume.assumeNotNull(list);
    }

    @Test
    public void shouldRemoveNodeByIndex() {
        loadWords();

        // Remove the item at index 1 which should be "second"
        String removed = list.remove(1);
        Assert.assertEquals(WORDS[1], removed);

        Assert.assertEquals(2, list.size());
    }

    @Test
    public void shouldRemoveFirstOccurrenceOfString() {
        list.add("thing");
        list.add("thing");

        boolean removed = list.remove("thing");
        Assert.assertTrue(removed);

        Assert.assertEquals(1, list.size());
    }

    @Test
    public void shouldRemoveAllOccurrencesOfString() {
        list.add("thing");
        list.add("not thing");
        list.add("thing");

        int removed = list.removeAll("thing");
        Assert.assertEquals(2, removed);

        Assert.assertEquals(1, list.size());
    }

    private void loadWords() {
        // Load the linked list with words
        for (String word : WORDS) {
            list.add(word);
        }
    }
}
