/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication77;

/**
 *
 * @author Student24
 */
public class JavaApplication77 {
public void addAndPrintItems(BlockingDeque<Integer> deque) {
    }
    public static void main(String[] args) {
        
  deque.offer(103);
  deque.offerFirst(20, 1, TimeUnit.SECONDS);
  deque.offerLast(85, 7, TimeUnit.HOURS);
  System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
  System.out.print(" "+deque.pollLast(1, TimeUnit.MINUTES));
 }
    }
    

