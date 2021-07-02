#include<bits/stdc++.h>
using namespace std;
// #define MAX_value 100;

int arr[100];
int size = 0;

void push(int values){
       arr[size] = values;
       size++;
}

void peek(int arr[]){
       for(int i=size-1;i>=0; --i){
           cout<<arr[i]<<" ";
       }
}

void pop(){
    cout<<"pop last element of stack "<<arr[size-1]<<endl;
    --size;
}

void isEmpty(){
    if(size == -1){
        cout<<"Stack is Empty"<<endl;
    }
    else {
        cout<<"Stack is not Empty\n";
    }
}

int main()
{
   cout<<"Enter Number for push\n";
   int length, values;
   cin>>length;
   while(length--){
      cin>>values;
      push(values);
   }
   peek(arr);   

   pop();
   cout<<endl;
   peek(arr);
   cout<<endl;
   isEmpty();

}