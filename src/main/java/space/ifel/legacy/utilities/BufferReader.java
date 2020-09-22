package space.ifel.legacy.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class BufferReader {
    private String delimiter = ";";
    private Integer bufferSize = 256;
    private final InputStream stream;

    BufferReader(InputStream stream, String delimiter, Integer bufferSize) {
        if (delimiter != null) {
            this.delimiter = delimiter;
        }

        if (bufferSize != null) {
            this.bufferSize = bufferSize;
        }

        this.stream = stream;
    }

    BufferReader(InputStream stream, String delimiter) {
        if (delimiter != null) {
            this.delimiter = delimiter;
        }

        this.stream = stream;
    }

    BufferReader(InputStream stream, Integer bufferSize) {
        if (bufferSize != null) {
            this.bufferSize = bufferSize;
        }

        this.stream = stream;
    }

    BufferReader(InputStream stream) {
        this.stream = stream;
    }

    public String getMessage() throws IOException {
        try {
            Charset utf8 = StandardCharsets.UTF_8;
            Scanner scanner = new Scanner(this.stream, utf8.name());

            StringBuilder input = new StringBuilder();
            int readSoFar = 0;

            scanner.useDelimiter(this.delimiter);
            while (readSoFar < this.bufferSize && scanner.hasNext()) {
                input.append(scanner.next());
            }

            return input.toString();
        } catch (Exception e) {
            return null;
        }
    }
}
