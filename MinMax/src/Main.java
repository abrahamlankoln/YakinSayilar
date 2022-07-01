import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] list = { 56, 34, 1, 8, 101, -2, -33 };
		int min = list[0];
		int max = list[0];
		int a;
		Scanner deger = new Scanner(System.in);
		System.out.print("bir deger giriniz: ");
		a=deger.nextInt();
		for (int i : list) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}
		for (int i : list) {
			if (i < a && i > min) {
				min = i;
			}
			if (i > a && i < max) {
				max = i;
			}
		}
		System.out.println("dizi: "+Arrays.toString(list));
		System.out.println("girilen sayi: "+a);
		System.out.println("girilen sayidan buyuk en yakin deger: "+max);
		System.out.println("girilen sayidan kucuk en yakin deger: "+min);
	}

}
