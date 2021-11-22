package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
                String [] stringArray = {"hello", "a", "c"};
                orderedGuests(stringArray);
            }

            public static void orderedGuests(String[] hotel)
            {
                Arrays.sort(hotel);
                System.out.println(Arrays.toString(hotel));

            }
        }

