/*Given pointer to the head node of a linked list, the task is to reverse the linked list. We need to reverse the list by changing the links between nodes.

Examples: 

Input: Head of following linked list 
1->2->3->4->NULL 
Output: Linked list should be changed to, 
4->3->2->1->NULL

Input: Head of following linked list 
1->2->3->4->5->NULL 
Output: Linked list should be changed to, 
5->4->3->2->1->NULL

Input: NULL 
Output: NULL



Input: 1->NULL 
Output: 1->NULL 
*/


#include <iostream>
#include<cstdlib>
using namespace std;
 
typedef struct node
{
  int val;
  struct node* next;
}node;
 
node* head=NULL;
 
int count(node* head) // code to count the no. of nodes
{
  node* p=head;
  int k=1;
  while(p!=NULL)
  {
    p=p->next;
    k++;
  }
  return k;
}
 
node *ll_reverse(node* head)  // to reverse the linked list
{
  node* p=head;
  long int i=count(head),j=1;
  long int arr[i];
  while(i && p!=NULL)
  {
    arr[j++]=p->val;
    p=p->next;
    i--;
  }
  j--;
  while(j) // loop will break as soon as j=0
  {
    cout<<arr[j--]<<" ";
  }
   
  return head;
}
 
node* insert_end(node* head,int data)  //code to insert at end of ll
{
  node* q=head,*p=(node*)malloc(sizeof(node));
  p->val=data;
  while(q->next!=NULL)
  {
    q=q->next;
  }
  q->next=p;
  p->next=NULL;
  return head;
}
 
node *create_ll(node* head,int data)  //create ll
{
  node* p=(node*)malloc(sizeof(node));
  p->val=data;
  if(head==NULL)
  {
    head=p;
    p->next=NULL;
    return head;
  }
  else
  {
    head=insert_end(head,data);
    return head;
  }
}
 

 
int main()
{
  int i=5,j=1; 
  while(i--)
  {
    head=create_ll(head,j++);
  }
  head=ll_reverse(head); 
    return 0;
}
