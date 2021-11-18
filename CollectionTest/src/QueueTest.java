
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student24
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> que=new PriorityQueue<>();
        que.add("bob");
         que.add("fred");
          que.add("carol");
          for(String s: que){
              System.out.println(s);
        
          }
           que.offer("flibflob");// same as add
    que.offer("anton");
     for(String s: que){
              System.out.println(s);
    }
   
}}
