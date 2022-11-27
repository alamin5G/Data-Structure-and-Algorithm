/**Algorithm for insertion*/
#include <stdio.h>
int main(){

    int i, k, j;
    int la[7] = {5, 7, 9, 15, 27, 33, 45};
    int tSize = sizeof(la)/sizeof(la[0]);
    int n=7; // before Deletion 
    printf("Before Deletion: ");
    for(i=0; i<n; i++){
        printf("%d ", la[i]);
    }
    
    k = 4; //numerical position
    int delItem = la[k-1]; 
   
    for(j=k-1; j<=n-1; j++){
        la[j] = la[j+1];
    }
    n=n-1;    
    printf("\nAfter Deletion : ");
    for(i=0; i<n; i++){
        printf("%d ", la[i]);
    }

    return 0;
}