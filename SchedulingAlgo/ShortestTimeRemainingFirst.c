#include <stdio.h>

int main()
{
    // Declare necessary variables and arrays for the program:
    int at[10], bt[10], rt[10], end, i, smallest;
    int remain = 0, n, time, sum_wt = 0, sum_ta = 0;

    // Ask user to enter the number of processes they want to run:
    printf("Enter no of Processes : ");
    scanf("%d", &n);

    // Iterate through each process to get their arrival times and burst times:
    for (i = 0; i < n; i++)
    {
        printf("Enter arrival time for Process P%d : ", i + 1);
        scanf("%d", &at[i]);
        printf("Enter burst time for Process P%d : ", i + 1);
        scanf("%d", &bt[i]);

        // Initialize remaining time for each process as its burst time:
        rt[i] = bt[i];
    }

    // Print the headers for the resultant data to be printed:
    printf("\n\nP\t AT\t BT\t TAT\t WT\n\n");

    // Set smallest remaining time as infinity for the comparison later on:
    rt[9] = 9999;

    // Iterate through each unit of time until all processes have completed execution:
    for (time = 0; remain != n; time++)
    {
        // Find the process with smallest remaining time that has already arrived:
        smallest = 9;
        for (i = 0; i < n; i++)
        {
            if (at[i] <= time && rt[i])
            {
                smallest = i;
            }
        }

        // Decrement remaining time for the chosen process:
        rt[smallest]--;

        // If process execution is complete:
        if (rt[smallest] == 0)
        {
            remain++;

            // Calculate end time, waiting time, and turnaround time for the process:
            end = time + 1;
            printf("\nP%d\t %d\t %d\t%d\t%d", smallest + 1, at[smallest], bt[smallest], end - at[smallest], end - bt[smallest] - at[smallest]);
            
            // Add waiting time and turnaround time to their respective sums:
            sum_wt += end - bt[smallest] - at[smallest];
            sum_ta += end - at[smallest];
        }
    }

    // Calculate average waiting time and average turnaround time for all processes:
    printf("\n\nAverage waiting time = %f\n", sum_wt * 1.0 / n);
    printf("Average Turnaround time = %f", sum_ta * 1.0 / 5);

    return 0;
}
