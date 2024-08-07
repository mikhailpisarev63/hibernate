package mysqllibrary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class WriteAndRead {
    public void writeSQLResultInList(Map<String, String> result) {
        try {
            PrintWriter writer = new PrintWriter("data/listSQL.txt");
            writer.write(String.valueOf(result));
            writer.close();
            writer.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String readTxtFile(String txtFile) {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> list = Files.readAllLines(Path.of(txtFile));
            builder.append(list);
            builder.append(System.lineSeparator());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return builder.toString();
    }
}
