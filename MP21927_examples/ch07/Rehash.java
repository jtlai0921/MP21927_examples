//  再雜湊(利用鏈結串列)

import java.io.*;
import java.util.*;

class Node
{
	int val;
	Node next;
	public Node(int val)
	{
		this.val=val;
		this.next=null;
	}
}


public    class Rehash extends Object
{
final static int INDEXBOX=7;   //雜湊表最大元素
final static int MAXNUM=13;       //最大資料個數
static Node indextable[]=new Node[INDEXBOX]; //宣告動態陣列

   public static void main(String args[]) throws IOException
      {  
	int i;
	int index[]=new int[INDEXBOX];
	int data[]=new int[MAXNUM];
	Random rand=new Random();
	for(i=0;i<INDEXBOX;i++)         
 		indextable[i]=new Node(-1);	 //清除雜湊表
	System.out.print("原始資料：\n\t");
	for(i=0;i<MAXNUM;i++)       //起始資料值
		{
			data[i]=(Math.abs(rand.nextInt(30)))+1;
			System.out.print("["+data[i]+"]");
			if(i%8==7)
				System.out.print("\n\t");
		}
	System.out.print("\n雜湊表：\n");
	for(i=0;i<MAXNUM;i++)
		Rehash.creat_table(data[i]);          //建立雜湊表
	for(i=0;i<INDEXBOX;i++)
		Rehash.print_data(i);                 //列印雜湊表
	System.out.print("\n");
      } 

   public static void creat_table(int val)              //建立雜湊表副程式
     {  
	Node newnode=new Node(val);
	int hash;
	hash=val%7;                       //雜湊函數除以7取餘數
	Node current=indextable[hash];
	   if 
		(current.next==null)   indextable[hash].next=newnode;
	   else
		while(current.next!=null)  current=current.next;
	current.next=newnode;	//將節點加在串列首後
     }
   public static void print_data(int val)        //列印雜湊表副程式
     {  
	Node head;
	int i=0;
	head=indextable[val].next;  //起始指標
	System.out.print("   "+val+"：\t");   //索引位址
	while(head!=null)
	{  
		System.out.print("["+head.val+"]-");
		i++;
		if(i%8==7)              //控制長度
			System.out.print("\n\t");
		head=head.next;
	}
	System.out.print("\n");  //清除最後一個"-"符號
    }
}
