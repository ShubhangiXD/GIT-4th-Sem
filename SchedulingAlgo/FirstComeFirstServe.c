#include <stdio.h>

struct process
{
    int pid;          // process ID
    int arr; // arrival time of process
    int burst;   // burst time of process
};

int main()
{
    int n, i, j;
    float avgwt = 0, avgtat = 0;
    printf("Enter number of processes: ");
    scanf("%d", &n);
    struct process p[n], temp;
    printf("Enter process details (process ID, arrival time, burst time):\n");
    for (i = 0; i < n; i++)
    {
        printf("Process %d: ", i + 1);
        scanf("%d%d%d", &p[i].pid, &p[i].arr, &p[i].burst);
    }
   
    for (i = 0; i < n - 1; i++)
    {
        for (j = 0; j < n - i - 1; j++)
        {
            if (p[j].arr > p[j + 1].arr)
            {
                temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }
    
    int curr = 0;
    for (i = 0; i < n; i++)
    {
        if (curr < p[i].arr)
        {
            curr = p[i].arr;
        }
        avgwt += curr - p[i].arr;
        avgtat += curr - p[i].arr + p[i].burst;
        curr += p[i].burst;
    }
  
    avgwt /= n;
    avgtat /= n;
    printf("Process\tArrival Time\tBurst Time\tWaiting Time\tTurnaround Time\n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n", p[i].pid, p[i].arr, p[i].burst, curr - p[i].burst - p[i].arr, curr - p[i].arr);
    }
    printf("Average Waiting Time: %.2f\n", avgwt);
    printf("Average Turnaround Time: %.2f\n", avgtat);
    return 0;
}