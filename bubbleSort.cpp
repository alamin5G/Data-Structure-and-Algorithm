/**
 * @file bubbleSort.cpp
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-10-27
 * 
 * @copyright Copyright (c) 2022
 * 
 */
#include <bits/stdc++.h>

using namespace std;


int main()
{
    int n;
    cin >> n;
    int a[n];
    for(auto i=0; i<n; i++){
        cin>> a[i];
    }
    int totalSwap=0;
    for(auto i=0; i<n; i++){
        int numberOfSwap=0;
        for(auto j=0; j<n-(i+1); j++){
            if(a[j]>a[j+1]){
                swap(a[j], a[j+1]);
                numberOfSwap++;
            }
        }
        totalSwap+= numberOfSwap;
        if(numberOfSwap==0){
            break;
        }
    }
    
            cout << "Array is sorted in "<< totalSwap << " swaps." << endl;
            cout << "First Element: " << a[0] << endl;
            cout << "Last Element: " << a[n-1] << endl;
    

    return 0;
}
