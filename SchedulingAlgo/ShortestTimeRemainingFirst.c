
#include <stdio.h>
int main()
{
    int at[10], bt[10], rt[10], end, i, smallest;
    int remain = 0, n, time, sum_wt = 0, sum_ta = 0;
    printf("Enter no of Processes : ");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        printf("Enter arrival time for Process P%d : ", i + 1);
        scanf("%d", &at[i]);
        printf("Enter burst time for Process P%d : ", i + 1);
        scanf("%d", &bt[i]);
        rt[i] = bt[i];
    }
    printf("\n\nP\t AT\t BT\t TAT\t WT\n\n");
    rt[9] = 9999;
    for (time = 0; remain != n; time++)
    {
        smallest = 9;
        for (i = 0; i < n; i++)
        {
            if (at[i] <= time && rt[i])
            {
                smallest = i;
            }
        }
        rt[smallest]--;
        if (rt[smallest] == 0)
        {
            remain++;
            end = time + 1;
            printf("\nP%d\t %d\t %d\t%d\t%d", smallest + 1, at[smallest], bt[smallest], end - at[smallest], end - bt[smallest] - at[smallest]);
            sum_wt += end - bt[smallest] - at[smallest];
            sum_ta += end - at[smallest];
        }
    }
    printf("\n\nAverage waiting time = %f\n", sum_wt * 1.0 / n);
    printf("Average Turnaround time = %f", sum_ta * 1.0 / 5);
    return 0;
}