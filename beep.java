import java.io.*;

public class beep{
    public static void main(String[] args) {
        // Set the drive and file size (in bytes)
        String drive = "C:";
        long fileSize = 1073741824; // 1 GB

        // Create the file
        File file = new File(drive + "/empty.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            return;
        }

        // Fill the file with empty data
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < fileSize; i++) {
                outputStream.write(0);
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void chrome(){
        // Set the file size to 16 GB in bytes
        final long FILE_SIZE = 16L * 1024L * 1024L * 1024L;

        // Set the file name
        final String FILE_NAME = "temp.bin";

        try (OutputStream outputStream = new FileOutputStream(FILE_NAME)) {
            // Create a file with the specified size
            for (long i = 0; i < FILE_SIZE; i++) {
                outputStream.write(0);
            }

            // Check the file size
            File file = new File(FILE_NAME);
            long fileSize = file.length();
            System.out.println("File size: " + fileSize + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
