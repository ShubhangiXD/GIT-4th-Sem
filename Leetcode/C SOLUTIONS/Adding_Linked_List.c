#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

struct node *create()
{
    struct Node *ptr = NULL;
    int length;
    printf("Enter the size of your list: \n");
    scanf("%d", &length);
    struct Node *new, *temp;
    for (int i = 0; i < length; i++)
    {
        new = (struct node *)malloc(sizeof(struct Node));
        printf("Enter element:");
        scanf("%d", &new->data);
        new->next = NULL;
        if (ptr == NULL)
        {
            ptr = temp = new;
        }
        else
        {
            temp->next = new;
            temp = new;
        }
    }
    return ptr;
}

struct Node *mergeLists(struct Node *list1, struct Node *list2)
{
    if (!list1)
        return list2;
    if (!list2)
        return list1;

    struct Node *head;
    if (list1->data < list2->data)
    {
        head = list1;
        list1 = list1->next;
    }
    else
    {
        head = list2;
        list2 = list2->next;
    }
    struct Node *current = head;

    while (list1 && list2)
    {
        if (list1->data < list2->data)
        {
            current->next = list1;
            list1 = list1->next;
        }
        else
        {
            current->next = list2;
            list2 = list2->next;
        }
        current = current->next;
    }
    if (list1)
    {
        current->next = list1;
    }
    else
    {
        current->next = list2;
    }

    return head;
}

int main()
{
}