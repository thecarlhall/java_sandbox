package sandbox.linked_list;

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
     * Remove a node from the list at a specific index.  The list will maintain the previous ordering less the removed
     * value.
     *
     * @param index Position of the value to remove.  Is 0 based.
     * @return The value removed from the list.
     */
    String remove(int index) throws IndexOutOfBoundsException;

    /**
     * Remove the first occurrence of a value from the list.  Subsequent values are left intact.  List order is
     * maintained.
     *
     * @param value Value to remove from the list.
     * @return Whether the value was found and removed.
     */
    boolean remove(String value);

    /**
     * Remove all occurrence of a value from the list.  List order is maintained.
     *
     * @param value Value to completely remove from the list.
     * @return How many copies of the value were removed.
     */
    int removeAll(String value);

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
