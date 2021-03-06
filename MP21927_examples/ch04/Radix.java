// 基數排序法由小到大排序

import java.io.*;
import java.util.*;

public class Radix extends Object
{
	int size;
	int data[]=new int[100];
	
	public static void main(String args[])
	{
		Radix test = new Radix();
		
		System.out.print("請輸入陣列大小(100以下)：");
		try{			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			test.size=Integer.parseInt(br.readLine());
		}catch(Exception e){}
		
		test.inputarr ();
		System.out.print("您輸入的原始資料是：\n");
		test.showdata ();
		
		test.radix ();
	}
	
	void inputarr()
	{
		Random rand=new Random();
		int i;
		for (i=0;i<size;i++)
			data[i]=(Math.abs(rand.nextInt(999)))+1; //設定data值最大為3位數
	}
	
	void showdata()
	{  
		int i;
		for (i=0;i<size;i++)
			System.out.print(data[i]+" ");
		System.out.print("\n");
	}
	
	void radix()
	{  
		int i,j,k,n,m;
		for (n=1;n<=100;n=n*10)		//n為基數，由個位數開始排序
		{
			//設定暫存陣列，[0~9位數][資料個數]，所有內容均為0
			int tmp[][]=new int[10][100];	
			for (i=0;i<size;i++)		//比對所有資料
			{				
				m=(data[i]/n)%10;  //m為n位數的值，如36取十位數(36/10)%10=3 
				tmp[m][i]=data[i]; //把data[i]的值暫存於tmp裡
			}
			
			k=0;
			for (i=0;i<10;i++)
			{  
				for(j=0;j<size;j++)
				{					
					if(tmp[i][j] != 0) //因一開始設定tmp={0}，故不為0者即為
					{
						//data暫存在tmp 裡的值，把tmp裡的值放回data[ ]裡
						data[k]=tmp[i][j];
						k++;
					}
				}
			}
			System.out.print("經過"+n+"位數排序後：");
			showdata();
		}
	}
}
