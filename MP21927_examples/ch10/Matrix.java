// 使用相鄰矩陣來表示有向圖

import java.io.*;
public    class Matrix
{
public static void main(String args[]) throws IOException
   {  
	int arr[][]=new int[5][5];  //宣告矩陣arr
	int i,j,tmpi,tmpj;     
	int [][] data={{1,2},{2,1},{2,3},{2,4},{4,3}};  //圖形各邊的起點值及終點值
	for (i=0;i<5;i++)           //把矩陣清為0
		for (j=0;j<5;j++)
			arr[i][j]=0;
	for (i=0;i<5;i++)       //讀取圖形資料
		for (j=0;j<5;j++)   //填入arr矩陣
		{  
			tmpi=data[i][0];     //tmpi為起始頂點
			tmpj=data[i][1];     //tmpj為終止頂點
			arr[tmpi][tmpj]=1;   //有邊的點填入1
		}
	System.out.print("有向圖形矩陣：\n");
	for (i=1;i<5;i++)
	{  
		for (j=1;j<5;j++)
	    System.out.print("["+arr[i][j]+"] ");   //列印矩陣內容
		System.out.print("\n");
	}
   }
}
