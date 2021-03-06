
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
public class PrintCounter {
  static int counter = 0;
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = Executors.newSingleThreadExecutor();
    List<Future<?>> results = new ArrayList<>();
    IntStream.iterate(0,i -> i+1).limit(5).forEach(
       i -> results.add(service.execute(() -> counter++)) // n1
    );
    for(Future<?> result : results) {
       System.out.print(result.get()+" "); // n2
    }
    service.shutdown();
  }
