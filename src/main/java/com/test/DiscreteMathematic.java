package com.test;

import java.util.Scanner;

public class DiscreteMathematic {
	static int row, col, n;
	static int a;
	int b = 0;
	private int[][] A;
	private int[][] B;

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入矩阵的行数");
		row = in.nextInt();
		System.out.println("请输入矩阵的列数");
		col = in.nextInt();
		System.out.println("请输入n的规模");
		n = in.nextInt();
		DiscreteMathematic x = new DiscreteMathematic();
		x.A = new int[row][col];
		System.out.println("请输入矩阵的元素(仅为0或1)");
		for (int i = 0; i < row; i++) {
			System.out.print("请输入第" + (i + 1) + "行的元素: ");
			for (int j = 0; j < col; j++) {
				a = in.nextInt();
				x.A[i][j] = a;
			}
		}
		x.B = x.A;
		x.echo(x);
		x.pritn(x);
	}

	// 实现算法
	void echo(DiscreteMathematic x) {
		for (int num = 2; num < row; num++) {
			change(x);
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (x.A[i][j] == 1 || x.B[i][j] == 1) {
						x.B[i][j] = 1;
					}
				}
			}
		}
	}

	// 改变A的值
	void change(DiscreteMathematic x) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (x.A[i][j] == 1) {
					for (int k = 0; k < row; k++) {
						if (x.B[j][k] == 1) {
							x.A[i][k] = 1;
						}
					}
				}
			}
		}
	}

	// 在屏幕上打印出B
	void pritn(DiscreteMathematic x) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(x.B[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
