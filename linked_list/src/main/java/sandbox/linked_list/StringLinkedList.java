package sandbox.linked_list;

public interface StringLinkedList {
    int size();
    boolean isEmpty();

    void add(String str);
    String remove(int position);
    boolean remove(String str);
    int removeAll(String str);
    void clear();

    StringLinkedNode head();
}
