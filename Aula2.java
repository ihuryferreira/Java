package aula2;

import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {
        
        Scanner app = new Scanner(System.in);
        
        int n = 5;
        
        System.out.println("\n\n\n\n");
		for (int i = 1; i <=n; i++){
			for (int j = i; j <= n; j++){
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++){
				System.out.print("1 ");
			}
			for (int j = 1; j <=n; j++){
				System.out.print("1 ");
			}
			System.out.println();
		}
		for (int i = 1; i <= (n - 2); i++){
			for (int j = 1; j <=(n*2+1); j++){
				System.out.print("1 ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n+2; i++){
			for (int j = 1; j <= n; j++){
				System.out.print("  ");
			}
			for (int j = 1; j <=n+1; j++){
				System.out.print("1 ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n*3+1; j++){
				System.out.print("1 ");
			}
			System.out.println();
		}

	}

}
