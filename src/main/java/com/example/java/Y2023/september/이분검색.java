package com.example.java.Y2023.september;

import java.util.Scanner;

/**
 설명
 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.

 입력
 첫 줄에 한 줄에 자연수 N(3<=N<=1,000,000)과 M이 주어집니다.
 두 번째 줄에 N개의 수가 공백을 사이에 두고 주어집니다.

 출력
 첫 줄에 정렬 후 M의 값의 위치 번호를 출력한다.

 예시 입력 1
 8 32
 23 87 65 12 57 32 99 81

 예시 출력 1
 3
 */
public class 이분검색 {
    private void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(scanner.next());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int first = list[i];
                if (first < list[j]) {
                    int second = list[j];
                    list[i] = second;
                    list[j] = first;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (list[i] == m) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
