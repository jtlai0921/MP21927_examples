// 建立二元樹

import java.io.*;
public    class Tree01
{
public static void main(String args[]) throws IOException

   {  
	int i,level;
	int data[]={6,3,5,9,7,8,4,2}; /*原始陣列*/
	int btree[]=new int[16];
	for(i=0;i<16;i++) btree[i]=0;
	System.out.print("原始陣列內容: \n");
	for(i=0;i<8;i++)
	System.out.print("["+data[i]+"] ");
	System.out.println();
	for(i=0;i<8;i++)                    /*把原始陣列中的值逐一比對*/
	{  
		for(level=1;btree[level]!=0;)   /*比較樹根及陣列內的值*/
		{  
			if(data[i]>btree[level])    /*如果陣列內的值大於樹根，則往右子樹比較*/
				level=level*2+1;
			else                        /*如果陣列內的值小於或等於樹根，則往左子樹比較*/
				level=level*2;
		}                               /*如果子樹節點的值不為0，則再與陣列內的值比較一次*/
		btree[level]=data[i];           /*把陣列值放入二元樹*/
	}
	System.out.print("二元樹內容：\n");
	for (i=1;i<16;i++)
		System.out.print("["+btree[i]+"] ");
	System.out.print("\n");
	
   }	
}
