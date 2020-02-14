// ��ƱƧǪk�Ѥp��j�Ƨ�

import java.io.*;
import java.util.*;

public class Radix extends Object
{
	int size;
	int data[]=new int[100];
	
	public static void main(String args[])
	{
		Radix test = new Radix();
		
		System.out.print("�п�J�}�C�j�p(100�H�U)�G");
		try{			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			test.size=Integer.parseInt(br.readLine());
		}catch(Exception e){}
		
		test.inputarr ();
		System.out.print("�z��J����l��ƬO�G\n");
		test.showdata ();
		
		test.radix ();
	}
	
	void inputarr()
	{
		Random rand=new Random();
		int i;
		for (i=0;i<size;i++)
			data[i]=(Math.abs(rand.nextInt(999)))+1; //�]�wdata�ȳ̤j��3���
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
		for (n=1;n<=100;n=n*10)		//n����ơA�ѭӦ�ƶ}�l�Ƨ�
		{
			//�]�w�Ȧs�}�C�A[0~9���][��ƭӼ�]�A�Ҧ����e����0
			int tmp[][]=new int[10][100];	
			for (i=0;i<size;i++)		//���Ҧ����
			{				
				m=(data[i]/n)%10;  //m��n��ƪ��ȡA�p36���Q���(36/10)%10=3 
				tmp[m][i]=data[i]; //��data[i]���ȼȦs��tmp��
			}
			
			k=0;
			for (i=0;i<10;i++)
			{  
				for(j=0;j<size;j++)
				{					
					if(tmp[i][j] != 0) //�]�@�}�l�]�wtmp={0}�A�G����0�̧Y��
					{
						//data�Ȧs�btmp �̪��ȡA��tmp�̪��ȩ�^data[ ]��
						data[k]=tmp[i][j];
						k++;
					}
				}
			}
			System.out.print("�g�L"+n+"��ƱƧǫ�G");
			showdata();
		}
	}
}