#include <stdio.h>

struct process
{
    int pid;          // process ID
    int arrival_time; // arrival time of process
    int burst_time;   // burst time of process
};

int main()
{
    int n, i, j;
    float avg_wait_time = 0, avg_turnaround_time = 0;
    printf("Enter number of processes: ");
    scanf("%d", &n);
    struct process p[n], temp;
    printf("Enter process details (process ID, arrival time, burst time):\n");
    for (i = 0; i < n; i++)
    {
        printf("Process %d: ", i + 1);
        scanf("%d%d%d", &p[i].pid, &p[i].arrival_time, &p[i].burst_time);
    }
   
    for (i = 0; i < n - 1; i++)
    {
        for (j = 0; j < n - i - 1; j++)
        {
            if (p[j].arrival_time > p[j + 1].arrival_time)
            {
                temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }
    
    int current_time = 0;
    for (i = 0; i < n; i++)
    {
        if (current_time < p[i].arrival_time)
        {
            current_time = p[i].arrival_time;
        }
        avg_wait_time += current_time - p[i].arrival_time;
        avg_turnaround_time += current_time - p[i].arrival_time + p[i].burst_time;
        current_time += p[i].burst_time;
    }
  
    avg_wait_time /= n;
    avg_turnaround_time /= n;
    printf("Process\tArrival Time\tBurst Time\tWaiting Time\tTurnaround Time\n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n", p[i].pid, p[i].arrival_time, p[i].burst_time, current_time - p[i].burst_time - p[i].arrival_time, current_time - p[i].arrival_time);
    }
    printf("Average Waiting Time: %.2f\n", avg_wait_time);
    printf("Average Turnaround Time: %.2f\n", avg_turnaround_time);
    return 0;
}