package sandbox.linked_list;

/**
 * Node for a linked list that holds strings.
 */
public interface StringLinkedNode {
    /**
     * @return The value of the node as provided.
     */
    String getValue();

    /**
     * @return The next node added/linked to the list.
     */
    StringLinkedNode getNext();

    /**
     * @return Whether there is another node in the list.
     */
    boolean hasNext();
}
