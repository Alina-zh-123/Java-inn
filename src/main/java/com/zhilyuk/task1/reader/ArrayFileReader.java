package com.zhilyuk.task1.reader;

import java.io.IOException;
import java.util.List;

public interface ArrayFileReader {
    List<String> arrayReadFromFile(String path) throws IOException;
}
