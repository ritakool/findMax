import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap kich thuoc mang: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Kich thuoc mang khong qua 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Phan tu thu " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Mang vua nhap la: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + "\t");
        }
        int max = arr[0];
        int index = 1;
        for (int j = 1; j < size; j++){
            if (max < arr[j]){
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println();
        System.out.println("Phan tu lon nhat la: " + max + " nam o vi tri " +index);
    }
}

