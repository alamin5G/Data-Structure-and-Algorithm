/**
 * Algorithm for Inserting Element in a Linear Array.
1. Set J = N;
2. Repeat Step 3 and 5 while J>=K;
3. 		Set LA[J+1] = LA[J];
4. 		Set J = J-1;
	[END OF STEP 2 LOOP]
5. Set LA[K] = ITEM;
6. Set N = N+1;
7. EXIT;
*/
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