package lesson3;


import java.util.Arrays;

public class HW3 {
    //1 ������ ������������� ������, ��������� �� ��������� 0 � 1. ��������:
    // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. �������� �����, ���������� � �������� ������� 0 �� 1, 1 �� 0;
    public static int[] replacementNumber(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }
    //2 ������ ������ ������������� ������ ������ 100. � ������� ����� ��������� ��� ���������� 1 2 3 4 5 6 7 8 � 100;
    public static void fromAndto(int[] array, int step, int shift){
        for(int i = 0; i < 100; i ++){
            array[i] = shift + i * step;
        }
    }

    //3 ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], �������� �����, ����������� �� ���� ������ � ���������� ����� ������ 6 �� 2;

    public static void cycleGo(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] *= 2;
            }
        }
    }


    //4  ������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������),
    //� � ������� �����(-��) ��������� ��� ������������ �������� ��������� (����� ������ ���� �� ����������, ���� ��� ������).

    public static void createSquareArray(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*20);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }

    //5. �������� �����, ����������� �� ���� ��� ���������: len � initialValue, � ������������
    //���������� ������ ���� int ������ len, ������ ������ �������� ����� initialValue;

    public static void twoArguments(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    //6. * ������ ���������� ������ � ����� � ��� ����������� � ������������ ��������;
    public static int minInArray(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    public static int maxInArray(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
        }
        return max;
    }


    public static void main(String[] args){
        //1 ������ ������������� ������, ��������� �� ��������� 0 � 1. ��������:
        // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. �������� �����, ���������� � �������� ������� 0 �� 1, 1 �� 0;
        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(replacementNumber(array01)));

        //2 ������ ������ ������������� ������ ������ 100. � ������� ����� ��������� ��� ���������� 1 2 3 4 5 6 7 8 � 100;
        int[] arr2 = new int[100];
        fromAndto(arr2, 1, 1);
        System.out.println(Arrays.toString(arr2));

        //3 ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], �������� �����, ����������� �� ���� ������
        // � ���������� ����� ������ 6 �� 2;
        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        cycleGo(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));


        //4  ������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������),
        //� � ������� �����(-��) ��������� ��� ������������ �������� ��������� (����� ������ ���� �� ����������, ���� ��� ������).
        createSquareArray(5);

        //5. �������� �����, ����������� �� ���� ��� ���������: len � initialValue, � ������������
        //���������� ������ ���� int ������ len, ������ ������ �������� ����� initialValue;

        twoArguments(8, 3);

        //6. * ������ ���������� ������ � ����� � ��� ����������� � ������������ ��������;
        int[] minMaxArray = {9, 7, 65, 25, 31, 350, 175, 456, 2, 78, 56, 9, 23};
        System.out.println(minInArray(minMaxArray));
        System.out.println(maxInArray(minMaxArray));
    }

}



