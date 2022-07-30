package readersandwriters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TesteReaderAndWriter {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("cpfs.txt")));
    BufferedWriter bw = new BufferedWriter(new FileWriter("cpfsJSON.txt"));

    bw.write("{");
    bw.newLine();
    bw.write("  \"cpfs\": [");
    bw.newLine();

    Set<String> cpfs = new HashSet<>();
    String line = br.readLine();

    while (line != null) {
      cpfs.add(line);
      line = br.readLine();
    }
    List<String> cpfsList = cpfs.stream().map(x -> "    \"" + x + "\",").collect(Collectors.toList());

    try {
      int size = cpfsList.size() - 1;
      String lastCpf = cpfsList.get(size).replace(",", "");
      cpfsList.remove(size);
      cpfsList.add(lastCpf);
    } catch (IndexOutOfBoundsException e) {
      throw new RuntimeException(e.getMessage());
    }

    cpfsList.forEach(x -> {
      try {
        bw.write(x);
        bw.newLine();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    });
    bw.write("  ]\n}");

    br.close();
    bw.close();
  }
}
