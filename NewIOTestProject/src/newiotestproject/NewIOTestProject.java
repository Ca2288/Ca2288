
package newiotestproject;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class NewIOTestProject {

  
    public static void main(String[] args) throws IOException {
//       Path path=Paths.get("c:\\temp\\ourFile.txt") ;
////        System.out.println("the new uri:"+path);
//        System.out.printf(" %s:%s","The path",path.toString());
//       System.out.printf("\n%s:%s","The absolute path",path.toAbsolutePath());
//        System.out.printf("\n%s:%s","Parent",path.getParent());
   //    System.out.printf("\n%s:%s","get name",path.getName(0)); 
//        System.out.printf("\n%s:%s","count",path.getNameCount());
//        System.out.printf("\n%s:%s","Root",path.getRoot());
//        System.out.println("--------------------------------------------------------");
//        String ourDir="c:\\temp\\brandon\\caroline";
//       
//        Path dirPath=Paths.get(ourDir);
       // Files.createDirectories(dirPath);
      //  System.out.println("---------------------------------------------------------");
//        Path ourFile=Paths.get("c:\\temp\\ourFile.txt");
//        System.out.println("File exits:"+Files.exists(ourFile));
//        List<String>lines =Files.readAllLines(ourFile);
//        lines.forEach(s->System.out.println(s));//using lambda
//        for(String s: lines){//using for loop
//            System.out.println(s);
//        }
//        System.out.println("the path"+path);
//        URI uri =path.toUri();
//        System.out.println("the uri:"+uri);
//        uri = new URI("file:///c:/temp/ourFile.txt");
//        System.out.println("the new uri:"+uri);
//        path=Paths.get(uri);
//        System.out.println("the new uri:"+path);
//     String ourDir="c:\\temp\\brandon\\caroline";
//   Files.delete(dirPath);
//   Path ourFile=Paths.get("c:\\temp\\test.txt");
//   Path thierFile=Paths.get("c:\\temp\\bob");
//   Files.move(thierFile,ourFile);//moves the file
//   Files.write(ourFile,"marry had a little lamb".getBytes());// instured of buffet writter .writting to a file
//   
//        System.out.println("File info:"+Files.isReadable(ourFile));//isexecutable
//   Files.copy(ourFile,thierFile);//copies file
//    Files.move(ourFile,thierFile);//moves the file
    
//    Path path1 = Paths.get("/projects/work/../fun");
//Path path2 = Paths.get("games");
//System.out.println(path1.resolve(path2));
  // Path path = Paths.get("c:\\Users\\mark");
  // path.getName(1);
// path.getRoot();
// path.getName(0);
//path.subpath(0,0);
        //System.out.println(path);
        Path path =
Paths.get("c:\\.\\temp\\data\\..\\.\\dir\\..\\file.txt");
try {
path = path.toRealPath();
} catch (IOException e) { }
System.out.println(path.subpath(2,5));
        
    }
    
}

