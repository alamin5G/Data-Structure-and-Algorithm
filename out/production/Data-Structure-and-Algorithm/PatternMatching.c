#include <stdio.h>
#include <string.h>
#include <conio.h>

void main()
{
    char P[80] = {"bab"};
    char T[80] = {"aabbbabb"};
    int R, S, K, L, MAX, INDEX;
    

    R = strlen(P);
    S = strlen(T);
    K = 0;
    MAX = S - R;

    while(K <= MAX)
    {
        for (L = 0; L < R; L++)
        {
            if (P[L] != T[K + L])
            {
                break;
            }

            if (L == R)
            {
                INDEX = K;
                break;
            }
            else
            {
                K = K + 1;
            }
        }
    }

    if (K>MAX)
    {
        INDEX=-1;
    }

    printf("P = %s ", P);
    printf("\n\nT = %s", T);

    if (INDEX!=-1)
    {
        printf("\n\nIndex of P in T is %d", INDEX);
    }else{
        printf("\n\nP does not exist in T");
    }

    getch();
}
