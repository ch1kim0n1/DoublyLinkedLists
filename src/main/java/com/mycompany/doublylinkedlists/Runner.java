/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doublylinkedlists;

/**
 *
 * @author skyla
 */
class Runner {
    public static void main(String[] args) {
        VLinkedList list = new VLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("List before deleting odd: ");
        printList(list);
        list.deleteOdd();
        System.out.print("List after deleting odd: ");
        printList(list);
    }

    public static void printList(VLinkedList list) {
        VNode current = list.head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}