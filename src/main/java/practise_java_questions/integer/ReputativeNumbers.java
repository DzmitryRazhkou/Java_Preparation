package practise_java_questions.integer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReputativeNumbers {
            public static void main(String[] args) {
                Integer[] numbers = {1, 5, 5, 89, 15, 12, 55, 99, 12, 75, 75, 12};
                List<Integer> list = Arrays.asList(numbers);
                Set<Integer> set = new HashSet<Integer>(Arrays.asList(numbers));


                for (Integer number : set) {
                    int count = 0;
                    for (Integer j : list) {
                        if (j == number) {
                            count++;
                        }
                    }

                    if (count > 1) {
                        System.out.println(number);
                    }
                }

            }

        }

