// ��n�ƧǪk

import java.io.*;
public  class Heap
{
public static void main(String args[]) throws IOException
   {
	int i,size,data[]={0,5,6,4,8,3,2,7,1};	//��l�}�C���e
	size=9;
	System.out.print("��l�}�C�G");
	for(i=1;i<size;i++)
		System.out.print("["+data[i]+"] ");
	Heap.heap(data,size);			//�إ߰�n��
	System.out.print("\n�Ƨǵ��G�G");
	for(i=1;i<size;i++)
		System.out.print("["+data[i]+"] ");
	System.out.print("\n");
   }  

public static void heap(int data[] ,int size)
{  
	int i,j,tmp;
	for(i=(size/2);i>0;i--)			    //�إ߰�n��`�I	
		Heap.ad_heap(data,i,size-1);
	System.out.print("\n��n���e�G");
	for(i=1;i<size;i++)			    //��l��n�𤺮e
		System.out.print("["+data[i]+"] ");
	System.out.print("\n");
	for(i=size-2;i>0;i--)			    //��n�Ƨ�
	{  
		tmp=data[i+1];			    //�Y���`�I�洫
		data[i+1]=data[1];
		data[1]=tmp;
		Heap.ad_heap(data,1,i);	            //�B�z�Ѿl�`�I
		System.out.print("\n�B�z�L�{�G");
		for(j=1;j<size;j++)
			System.out.print("["+data[j]+"] ");
	}
}
public static void ad_heap(int data[],int i,int size)
   {  
        int j,tmp,post;
	j=2*i;
	tmp=data[i];
	post=0;
	while(j<=size && post==0)
	{  
		if(j<size)
		{
			if(data[j]<data[j+1])		//��X�̤j�`�I
				j++;
		}
		if(tmp>=data[j])			//�Y��ڸ��j�A��������L�{
			post=1;
		else
		{  
			data[j/2]=data[j];		//�Y��ڸ��p�A�h�~����
			j=2*j;
		}   
   }
   data[j/2]=tmp;					//���w��ڬ����`�I
   }
}