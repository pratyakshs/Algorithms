/*
 Binary Search Example
 @Author: Rohit
*/

#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main(){
    int n;
    cin >> n;
    int c;
    cin >> c;
    vector<int> pos(n);
    for(int i=0;i<n;i++) cin >> pos[i]; 
    
    sort(pos.begin(),pos.end());
    vector<int> res(c);
    res[0] = pos[0];
    res[c-1] = pos[n-1];

    int delimit = n/(c-2);


