/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certifico_quiz_2;

/**
 *
 * @author khian
 */

import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = next;
    }
       
}
public class Certifico_Quiz_2 {
     private Node head;
    private Node tail;
    private int size;

    private Node createNewNode(int data) {
        Node node = new Node(data);
        node.next = null;
        return node;
    }

    public void insert(int data) {
        Node newNode = createNewNode(data);

        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }
 
    public boolean search(int target) {
        Node current = head;

        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }

        return false;
    }
     public int searchPosition(int target) {
        Node current = head;
        int pos = 0;

        while (current != null) {
            if (current.data == target) {
                return pos;
            }
            current = current.next;
            pos++;
        }

        return -1;
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Certifico_Quiz_2 list = new Certifico_Quiz_2();
        Scanner scn = new Scanner(System.in);
        boolean start = true;

        while (start) {
            System.out.println("QUIZ # 2");
            System.out.println("[1] Search");
            System.out.println("[2] Insert");
            System.out.println("[3] Display");
            System.out.println("[4] Exit");

            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("");
                 System.out.println("Enter Target:");
                    int target = scn.nextInt();
                    boolean found = list.search(target);
                    if (found) {
                        System.out.println(target + " is found at Position " + list.searchPosition(target));
                    } else {
                        System.out.println(target + " is not found.");
                    }
                    break; 
                case 2:
                    
                     System.out.println("Enter Data:");
                    int data = scn.nextInt();
                    list.insert(data);
                    System.out.println(data + " is inserted.");
                    break;
                case 3:
                     if (list.size == 0) {
                        System.out.println("List is Empty.");
                    } else {
                        list.display();
                    }
                    break;
                case 4:
                    start = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
               
            }
        }
    }
}

