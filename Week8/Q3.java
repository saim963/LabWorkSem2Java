package Week8;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Q3 {

    public static class NetworkException extends Exception {
        public NetworkException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) throws NetworkException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid link: ");
        String urlString = sc.nextLine();

        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(urlString).openConnection();
            connection.connect();
            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);
            if (responseCode == 200){
                System.out.println("Request has Succeeded!!");
            }
        } catch (IOException e) {
            throw new NetworkException("Failed to establish network connection: " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
            System.out.println("Network connection closed.");
        }
    }
}