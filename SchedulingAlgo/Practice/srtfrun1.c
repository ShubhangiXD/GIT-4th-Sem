#include <stdio.h>
int main()
{
    int at[10], bt[10], time, sum_wt, sum_tat, p[10], smallest, end, remain;
    int n, i, rt[10];
    printf("Enter no of Processes : ");
    scanf("%d", &n);
    remain = n;
    for (i = 0; i < n; i++)
    {
        printf("Enter arrival time for Process P%d : ", i + 1);
        scanf("%d", &at[i]);
        printf("Enter burst time for Process P%d : ", i + 1);
        scanf("%d", &bt[i]);
        rt[i] = bt[i];
        p[i] = i + 1;
    }
    printf("Process \t\tAT\t\tBT\t\tWT\t\tTAT\n");

    rt[9] = 9999;
    for (time = 0; remain != 0; time++)
    {
        smallest = 9;
        for (i = 0; i < n; i++)
        {
            if (at[i] <= time && rt[i] < rt[smallest] && rt[i] > 0)
            {
                smallest = i;
            }
        }

        rt[smallest]--;
        if (rt[smallest] == 0)
        {
            remain--;
            end = time + 1;
            sum_wt += end - at[smallest] - bt[smallest];
            sum_tat += end - at[smallest];
            printf("#%d \t\t%d\t\t%d\t\t%d\t\t%d\n", smallest + 1, at[smallest], bt[smallest], end - at[smallest], end - bt[smallest] - at[smallest]);
        }
    }
    printf("\nAverage waiting time = %f\n", sum_wt * 1.0 / n);
    printf("Average Turnaround time = %f\n", sum_tat * 1.0 / n);
}