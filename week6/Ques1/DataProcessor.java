package WEEK6.Ques1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataProcessor {

    public static class InvalidDataException extends Exception {
        public InvalidDataException(String message) {
            super(message);
        }
    }

    public List<Double> readValuesFromFile(String filePath) throws IOException, InvalidDataException {
        List<Double> values = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    values.add(Double.parseDouble(line.trim()));
                }
                catch (NumberFormatException e) {
                    throw new InvalidDataException("Invalid data found in file: " + line);
                }
            }
        }

        return values;
    }

    public List<Double> validateData(List<Double> values) throws InvalidDataException {
        List<Double> validValues = new ArrayList<>();

        for (Double value : values) {
            if (value != null && !Double.isNaN(value)) {
                validValues.add(value);
            }
            else {
                throw new InvalidDataException("Invalid data found in list: " + value);
            }
        }

        return validValues;
    }

    public double calculateAverage(List<Double> validValues) {
        if (validValues.isEmpty()) {
            throw new IllegalArgumentException("No valid values found to calculate average.");
        }

        double sum = 0;

        for (Double value : validValues) {
            sum += value;
        }

        return sum / validValues.size();
    }

    public void writeResultToFile(double average, String outputPath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write("Average: " + average);
        }
    }

    public static void main(String[] args) {
        String inputPath = "E:\\Documents\\MCA\\Lab\\LabWorkSem2Java\\WEEK6\\Ques1\\INPUT.txt";
        String outputPath = "E:\\Documents\\MCA\\Lab\\LabWorkSem2Java\\WEEK6\\Ques1\\OUTPUT.txt";

        try {
            DataProcessor processor = new DataProcessor();
            List<Double> values = processor.readValuesFromFile(inputPath);
            List<Double> validValues = processor.validateData(values);
            double average = processor.calculateAverage(validValues);
            processor.writeResultToFile(average, outputPath);

            System.out.println("Average successfully written to: " + outputPath);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        } catch (InvalidDataException e) {
            System.err.println("Invalid data: " + e.getMessage());
        }
    }
}
