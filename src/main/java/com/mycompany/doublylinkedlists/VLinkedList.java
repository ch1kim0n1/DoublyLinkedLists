/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doublylinkedlists;

/**
 *
 * @author skyla
 */
class VLinkedList {
    VNode head;

    public void add(int value) {
        VNode newNode = new VNode(value, null, head);
        if (head != null) {
            head.setPrevious(newNode);
        }
        head = newNode;
    }

    public void deleteOdd() {
        VNode current = head;
        while (current != null) {
            VNode next = current.getNext();
            if (current.getValue() % 2 != 0) {
                if (current.getPrevious() != null) {
                    current.getPrevious().setNext(current.getNext());
                }
                if (current.getNext() != null) {
                    current.getNext().setPrevious(current.getPrevious());
                }
                if (current == head) {
                    head = current.getNext();
                }
            }
            current = next;
        }
    }

    public int size() {
        int size = 0;
        VNode current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }
}
