package sandbox.simple_linked_list;

public interface RemovableStringLinkedList extends StringLinkedList {
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
}
