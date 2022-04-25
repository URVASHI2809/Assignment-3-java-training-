package com.rakuten;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomPassword {
        public static String generateRandomPassword(int len)
        {
           final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            SecureRandom random = new SecureRandom();
            return IntStream.range(0, len)
                    .map(i -> random.nextInt(chars.length()))
                    .mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex)))
                    .collect(Collectors.joining());
        }

        public static void main(String[] args)
        {
            int len = 10;
            System.out.println(generateRandomPassword(len));
        }
}
