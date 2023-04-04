#include <stdio.h>
int main()
{
	int arr[100][4];
	int i, j, n, total = 0, index, temp;
	float avg_wt, avg_tat;
	printf("Enter number of process: ");
	scanf("%d", &n);
	printf("Enter Burst Time:\n");
	
	for (i = 0; i < n; i++) {
		printf("P%d: ", i + 1);
		scanf("%d", &arr[i][1]);
		arr[i][0] = i + 1;
	}
	
	for (i = 0; i < n; i++) {
		index = i;
		for (j = i + 1; j < n; j++)
			if (arr[j][1] < arr[index][1])
				index = j;
		temp = arr[i][1];
		arr[i][1] = arr[index][1];
		arr[index][1] = temp;

		temp = arr[i][0];
		arr[i][0] = arr[index][0];
		arr[index][0] = temp;
	}
	arr[0][2] = 0;
	
	for (i = 1; i < n; i++) {
		arr[i][2] = 0;
		for (j = 0; j < i; j++)
			arr[i][2] += arr[j][1];
		total += arr[i][2];
	}
	avg_wt = (float)total / n;
	total = 0;
	printf("P	 BT	 WT	 TAT\n");
	
	for (i = 0; i < n; i++) {
		arr[i][3] = arr[i][1] + arr[i][2];
		total += arr[i][3];
		printf("P%d	 %d	 %d	 %d\n", arr[i][0],
			arr[i][1], arr[i][2], arr[i][3]);
	}
	avg_tat = (float)total / n;
	printf("Average Waiting Time= %f", avg_wt);
	printf("\nAverage Turnaround Time= %f", avg_tat);
}
