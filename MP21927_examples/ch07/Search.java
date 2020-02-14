// �ϥ�����k�ֳt�a�إߤηj�M���

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


public    class Search extends Object
{
final static int INDEXBOX=7;   //������̤j����
final static int MAXNUM=13;       //�̤j��ƭӼ�
static Node indextable[]=new Node[INDEXBOX]; //�ŧi�ʺA�}�C

   public static void main(String args[]) throws IOException
      {  
	int i,num;
	int index[]=new int[INDEXBOX];
	int data[]=new int[MAXNUM];
	Random rand=new Random();
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	for(i=0;i<INDEXBOX;i++)         
		indextable[i]=new Node(-1);	 //�M�������
	System.out.print("��l��ơG\n\t");
	for(i=0;i<MAXNUM;i++)       //�_�l��ƭ�
		{
			data[i]=(Math.abs(rand.nextInt(30)))+1;
			System.out.print("["+data[i]+"]");
			if(i%8==7)
				System.out.print("\n\t");
		}
	for(i=0;i<MAXNUM;i++)
		Search.creat_table(data[i]);          //�إ������
	System.out.println();
	while(true)
	{  
		System.out.print("�п�J�j�M���(1-30)�A�����п�J-1�G");
		num=Integer.parseInt(keyin.readLine());
		if(num==-1)
			break;
		i=Search.findnum(num);
		if(i==0)
			System.out.print("#####�S����� "+num+" #####\n");
		else
			System.out.print("��� "+num+"�A�@��F "+i+" ��!\n");
	}
	System.out.print("\n������G\n");
	for(i=0;i<INDEXBOX;i++)
		Search.print_data(i);                 //�C�L�����
	System.out.print("\n");
      } 

   public static void creat_table(int val)              //�إ�������Ƶ{��
     {  
	Node newnode=new Node(val);
	int hash;
	hash=val%7;                       //�����ư��H7���l��
	Node current=indextable[hash];
	   if 
		(current.next==null)   indextable[hash].next=newnode;
	   else
		while(current.next!=null)  current=current.next;
	current.next=newnode;	//�N�`�I�[�b��C
     }
   public static void print_data(int val)        //�C�L������Ƶ{��
     {  
	Node head;
	int i=0;
	head=indextable[val].next;  //�_�l����
	System.out.print("   "+val+"�G\t");   //���ަ�}
	while(head!=null)
	{  
		System.out.print("["+head.val+"]-");
		i++;
		if(i%8==7)              //�������
			System.out.print("\n\t");
		head=head.next;
	}
	System.out.print(" \n");            //�M���̫�@��"-"�Ÿ�
      }

   public static int findnum(int num)     //����j�M�Ƶ{��
     {  
	Node ptr;
	int i=0,hash;
	hash=num%7;
	ptr=indextable[hash].next;
	while(ptr!=null)
	{  
		i++;
		if(ptr.val==num)
			return i;
		else
			ptr=ptr.next;
	}
	return 0;
     }
}