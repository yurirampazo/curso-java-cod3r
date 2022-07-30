package readersandwriters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class TesteWriter {

  public static void main(String[] args) throws IOException {

    Locale.setDefault(Locale.US);

    FileOutputStream fos = new FileOutputStream("numbers.txt");
    OutputStreamWriter osr = new OutputStreamWriter(fos);
    BufferedWriter bw = new BufferedWriter(osr);

    bw.write("41202702");
    bw.newLine();
    bw.write("41202701");
    bw.newLine();
    bw.write("41202702");

    bw.close();
  }
}

