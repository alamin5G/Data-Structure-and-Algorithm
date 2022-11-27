/**Algorithm for insertion*/
#include <stdio.h>
int main(){

    int i, k, j;
    int la[8] = {5, 7, 9, 15, 27, 33, 45};
    int tSize = sizeof(la)/sizeof(la[0]);
    int n=7; // before insertion 
    printf("Before Insertion: ");
    for(i=0; i<n; i++){
        printf("%d ", la[i]);
    }
    
    int insertItem = 21;
    k = 5; 
    j=n-1; //-1 is for counting from 0;
   
    while(j>=k-1){ 
        la[j+1] = la[j];
        j--;
    }

    la[k-1] = insertItem;

    n = n+1;
    printf("\nAfter Inserting : ");
    for(i=0; i<n; i++){
        printf("%d ", la[i]);
    }

    return 0;
}