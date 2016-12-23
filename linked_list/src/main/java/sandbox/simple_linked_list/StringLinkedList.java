package sandbox.simple_linked_list;

/**
 * Linked list for holding strings.
 */
public interface StringLinkedList {
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
     * Move the internal pointer to the first node in the list.
     */
    void resetPointer();

    /**
     * Get the next String in the list.
     *
     * @return {@link String} or {@code null}.
     */
    String next();

    /**
     * @return true if there is a next node.  false otherwise.
     */
    boolean hasNext();
}
