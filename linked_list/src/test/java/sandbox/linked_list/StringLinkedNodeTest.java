package sandbox.linked_list;

import org.junit.Assert;
import org.junit.Test;

public class StringLinkedNodeTest {
    @Test
    public void shouldSetValue() {
        String value = "value word";
        StringLinkedNode node = new StringLinkedNodeImpl(value);

        Assert.assertEquals(value, node.getValue());
        Assert.assertFalse(node.hasNext());
        Assert.assertNull(node.getNext());
    }

    @Test
    public void shouldSetNextInCtor() {
        String nextValue = "next value word";
        StringLinkedNode nextNode = new StringLinkedNodeImpl(nextValue);
        Assert.assertEquals(nextValue, nextNode.getValue());
        Assert.assertFalse(nextNode.hasNext());

        String value = "value word";
        StringLinkedNode node = new StringLinkedNodeImpl(value, nextNode);
        Assert.assertEquals(value, node.getValue());
        Assert.assertTrue(node.hasNext());
    }

    @Test
    public void shouldSetNext() {
        String value = "value word";
        StringLinkedNodeImpl node = new StringLinkedNodeImpl(value);
        Assert.assertEquals(value, node.getValue());
        Assert.assertFalse(node.hasNext());

        String nextValue = "next value word";
        StringLinkedNode nextNode = new StringLinkedNodeImpl(nextValue);
        Assert.assertEquals(nextValue, nextNode.getValue());
        Assert.assertFalse(nextNode.hasNext());

        node.setNext(nextNode);
        Assert.assertTrue(node.hasNext());
        Assert.assertEquals(nextNode, node.getNext());
    }
}
