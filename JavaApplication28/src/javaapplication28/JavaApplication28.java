
package javaapplication28;


public class JavaApplication28 {

   
    public static void main(String[] args) {
  
  String[][] chs=new String[2][];
  chs[0]=new String [2];
  chs[1]=new String[5];
  int i=97;
        for (String[] ch : chs) {
            for (int b = 0; b < chs.length; b++) {
                ch[b] = ""+ i;
                i++;
            }
        }
        for (String ca[]:chs) {
          for (String c :ca) {
              System.out.print(c + " ");  
        }  
            System.out.println();
    }
    }
}