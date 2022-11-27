#include <stdio.h>
#define n 7
int main(){
    int k, i;
    int LA[n] = {23, 45, 56, 1, -9, -12, 123};
    k=0; 
    printf("Traversing the LA elements: ");
    while(k<=n-1){ //-1 is for counting from 0;
        printf("%d ", LA[k]);
        k++;
    }

    return 0;
}