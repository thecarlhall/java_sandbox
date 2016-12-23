package sandbox.simple_linked_list;

import sandbox.linked_list.StringLinkedNode;

public class StringLinkedListImpl implements StringLinkedList {
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public void add(String str) {
    }

    public void clear() {
    }

    public void resetPointer() {
    }

    public String next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    private static final class StringLinkedListNode {
        public StringLinkedListNode(String value) {
        }

        public StringLinkedListNode(String value, StringLinkedNode next) {
        }

        public boolean hasNext() {
            return false;
        }

        public StringLinkedListNode getNext() {
            return null;
        }

        public void setNext(StringLinkedNode next) {
        }
    }
}
