/**
 * Algorithm for Traversing Element in a Linear Array.
1. Set K = LB;
2. Repeat Step 3 and 4 while K<= UB;
3. 		Apply Process to LA[K];
4. 		Set K = K+1;
	[END OF STEP 2 LOOP]
5. Exit;
*/
#include <stdio.h>
#define n 7
int main(){
    int k;
    int LA[n] = {23, 45, 56, 1, -9, -12, 123};
    k=0; 
    printf("Traversing in the LA elements: ");
    while(k<=n-1){ //-1 is for counting from 0;
        printf("%d ", LA[k]);
        k++;
    }

    return 0;
}