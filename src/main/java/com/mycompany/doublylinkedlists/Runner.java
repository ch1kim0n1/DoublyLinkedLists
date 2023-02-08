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
        list.add(6);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(4);
        list.add(5);
        
        list.deleteOdd();
        printList(list);
    }

    public static void printList(VLinkedList list) {
        VNode current = list.head;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.print("]");
    }
}