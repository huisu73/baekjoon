#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = 0;
    double dNum1 = num1;
    double dNum2 = num2;
    
    answer = (int) ((dNum1 / dNum2) * 1000);
    return answer;
}