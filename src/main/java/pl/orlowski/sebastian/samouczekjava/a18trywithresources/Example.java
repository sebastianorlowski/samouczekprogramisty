package pl.orlowski.sebastian.samouczekjava.a18trywithresources;

import java.io.*;

public class Example {

    public Example() {

    }

    public void readFile(String fileName) {
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
            fileReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void thisSameReadFile(String fileName) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            fileReader.readLine();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readAndWriteFile(String fileName) {
        try (
                BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
            fileReader.readLine();
            fileWriter.write(123);
        }
            catch(IOException e) {
                e.printStackTrace();
        }
        }
    }


