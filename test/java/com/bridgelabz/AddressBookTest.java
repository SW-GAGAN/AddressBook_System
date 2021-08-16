package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class AddressBookTest {
    private static String HOME = System.getProperty("user.dir");
    private static String checkContacts = "Employee Details";

    @Test
    public void givenPathWhenCheckedThenConfirm(String checkCntacts) throws IOException {
        System.out.println(HOME);
        /* Check File Exist */
        Path homePath = Paths.get(HOME);
        Assert.assertTrue(Files.exists(homePath));

        /* Delete File and Check File Not Exist */
          Path path = Paths.get(HOME + "/" + checkContacts);
        if (Files.exists(path)) Files.delete(path);
        Assert.assertTrue(Files.notExists(path));

        /* Creating  directory */
        Files.createDirectories(path);
        Assert.assertTrue(Files.exists(path));

        /* Creating File */
       IntStream.range(1, 10).forEach(cntr -> {
            Path tempFile = Paths.get(path + "/temp" + cntr);
            Assert.assertTrue(Files.notExists(tempFile));
            try {
                Files.createFile(tempFile);
            } catch (IOException e) {
            }
            Assert.assertTrue(Files.exists(tempFile));
        });

        /* List Files, Directories as well as Files with Extension */
        Files.list(path).filter(Files::isRegularFile).forEach(System.out::println);
        Files.newDirectoryStream(path).forEach(System.out::println);
        Files.newDirectoryStream(path, path1 -> path.toFile().isFile() && path.toString().startsWith("temp")).forEach(System.out::println);

    }
}
