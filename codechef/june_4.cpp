#include <iostream>
#include <stack>
#include <vector>
#include <stdlib.h>
#include <stdio.h>
#include <cstring>
#include <string>
#define gc getchar_unlocked
using namespace std;



inline int FAST_IO() 
{
	register int N = 0, C;
	while ((C = gc()) < '0');
 
	do {
		N = (N<<3) + (N<<1) + C - '0';
	}while ((C = gc()) >= '0');
	return N;
} 


int minsum ;

void go(vector<vector<int> > a,int x,int y,int n,int m,int tempsum){
		//cout<<x<<" "<<y<<endl;
		//cout<<n<<" "<<m<<endl;
		if(x<n && y<m)
			tempsum+=a[x][y];
		if(x+1<n && y<m)
			tempsum+=a[x+1][y];
		if(x<n && y+1<m)
			tempsum+=a[x][y+1];
		if((x-1)>=0 && y<m && x<n)
			tempsum+=a[x-1][y];
		if((y-1)>=0 && x<n && y<m)
			tempsum+=a[x][y-1];

		if(x==n-1 && y==m-1){
			if(tempsum<minsum)
				minsum= tempsum;
			return;
		}

		if(x+1<n && y<m){
		//	cout<<"iam here"<<endl;
			go(a,x+1,y,n,m,tempsum);
		}
		if(x<n && y+1<m)
			go(a,x,y+1,n,m,tempsum);
}




int main(){
	int t;
	t = FAST_IO();

	while(t--){
	int n,m;
	n= FAST_IO();
	m= FAST_IO();

	vector<vector<int> > v;

	for(int i=0;i<n;i++){
		vector<int> temp;
		string s;
		cin>>s;
		for(int j=0;j<m;j++){
			int x=(int)(s[j])-'0';
			temp.push_back(x);
		}
		v.push_back(temp);
	}


	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cout<<v[i][j];
		}
		cout<<endl;
	}

		//cout<<n<<m<<endl;
		minsum = n*m;
		int tempsum = 0;
		go(v,0,0,n,m,tempsum);
		cout<<minsum<<endl;
	}
	return 0;
}