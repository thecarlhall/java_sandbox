package sandbox.linked_list;

/**
 * Linked list for holding strings.
 */
public interface StringLinkedList extends RemovableStringLinkedList {
    /**
     * @return The number of nodes in the list.
     */
    int size();

    /**
     * @return Whether the list has nodes.
     */
    boolean isEmpty();

    /**
     * Add a string to the list.  Values are stored in the order that they are added to the list.
     *
     * @param str Value to be added next in the list.
     */
    void add(String str);

    /**
     * Clear the list of all values.
     *
     * @see #isEmpty()
     */
    void clear();

    /**
     * @return A copy of the head node in the list.
     */
    StringLinkedNode head();
}
