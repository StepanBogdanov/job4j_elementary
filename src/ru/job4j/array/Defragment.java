package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index; /* указатель на null ячейку. */
                for (int i = nullIndex; i < array.length; i++) {
                    if (array[i] != null) {
                        int notNullIndex = i; /* указатель на notNull ячейку */
                        SwitchArray.swap(array, nullIndex, notNullIndex);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
