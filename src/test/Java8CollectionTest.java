package test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Java8CollectionTest {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("test.txt")), StandardCharsets.UTF_8);
        List<String> list = Arrays.asList(content.split(" "));
        long count = list.parallelStream().filter(a -> a.length() > 4).count();
        System.out.println(count);
    }
}
