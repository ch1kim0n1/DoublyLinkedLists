/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doublylinkedlists;

/**
 *
 * @author skyla
 */
class VNode {
    private int value;
    private VNode previous;
    private VNode next;

    public VNode(int value, VNode previous, VNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public VNode getPrevious() {
        return previous;
    }

    public void setPrevious(VNode previous) {
        this.previous = previous;
    }

    public VNode getNext() {
        return next;
    }

    public void setNext(VNode next) {
        this.next = next;
    }
}

