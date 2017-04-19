import java.io.*;
class bots
{//class
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void player1(int a[][],int pos1[],int pos2[])throws IOException
    {//p1
        System.out.println("Enter l for left, r for right, u for up, d for down and q if no steps available");
        int flag=0;
        do
        {//do
            char ch=(char)br.read();
            br.readLine();
            switch(ch)
            {//switch
                case 'l': 
                if(pos1[1]==0 || a[pos1[0]][pos1[1]-1]==1 || a[pos1[0]][pos1[1]-1]==3)
                    System.out.println("Cant go left. Re-enter");
                else
                {//else
                    a[pos1[0]][pos1[1]]=1;
                    pos1[1]--;
                    a[pos1[0]][pos1[1]]=2;
                    flag=1;
                }//else
                break;
                case 'r': 
                if(pos1[1]==6 || a[pos1[0]][pos1[1]+1]==1 || a[pos1[0]][pos1[1]+1]==3)
                    System.out.println("Cant go right. Re-enter");
                else
                {//else
                    a[pos1[0]][pos1[1]]=1;
                    pos1[1]++;
                    a[pos1[0]][pos1[1]]=2;
                    flag=1;
                }//else
                break;
                case 'u': 
                if(pos1[0]==0 || a[pos1[0]-1][pos1[1]]==1 || a[pos1[0]-1][pos1[1]]==3)
                    System.out.println("Cant go up. Re-enter");
                else
                {//else
                    a[pos1[0]][pos1[1]]=1;
                    pos1[0]--;
                    a[pos1[0]][pos1[1]]=2;
                    flag=1;
                }//else
                break;
                case 'd': 
                if(pos1[0]==6 || a[pos1[0]+1][pos1[1]]==1 || a[pos1[0]+1][pos1[1]]==3)
                    System.out.println("Cant go down. Re-enter");
                else
                {//else
                    a[pos1[0]][pos1[1]]=1;
                    pos1[0]++;
                    a[pos1[0]][pos1[1]]=2;
                    flag=1;
                }//else
                break;
                case 'q':System.out.println("Player 2 Wins!");
                System.exit(0);
                default:System.out.println("Please enter correctly");
            }//switch
        }while(flag==0);
    }//p1
    void player2(int a[][],int pos1[],int pos2[])throws IOException
    {//p2
        System.out.println("Enter l for left, r for right, u for up, d for down and q if no steps available");
        int flag=0;
        do
        {//do
            char ch=(char)br.read();
            br.readLine();
            switch(ch)
            {//switch
                case 'l': 
                if(pos2[1]==0 || a[pos2[0]][pos2[1]-1]==1 || a[pos2[0]][pos2[1]-1]==2)
                    System.out.println("Cant go left. Re-enter");
                else
                {//else
                    a[pos2[0]][pos2[1]]=1;
                    pos2[1]--;
                    a[pos2[0]][pos2[1]]=3;
                    flag=1;
                }//else
                break;
                case 'r': 
                if(pos2[1]==6 || a[pos2[0]][pos2[1]+1]==1 || a[pos2[0]][pos2[1]+1]==2)
                    System.out.println("Cant go right. Re-enter");
                else
                {//else
                    a[pos2[0]][pos2[1]]=1;
                    pos2[1]++;
                    a[pos2[0]][pos2[1]]=3;
                    flag=1;
                }//else
                break;
                case 'u': 
                if(pos2[0]==0 || a[pos2[0]-1][pos2[1]]==1 || a[pos2[0]-1][pos2[1]]==2)
                    System.out.println("Cant go up. Re-enter");
                else
                {//else
                    a[pos2[0]][pos2[1]]=1;
                    pos2[0]--;
                    a[pos2[0]][pos2[1]]=3;
                    flag=1;
                }//else
                break;
                case 'd': 
                if(pos2[0]==6 || a[pos2[0]+1][pos2[1]]==1 || a[pos2[0]+1][pos2[1]]==2)
                    System.out.println("Cant go down. Re-enter");
                else
                {//else
                    a[pos2[0]][pos2[1]]=1;
                    pos2[0]++;
                    a[pos2[0]][pos2[1]]=3;
                    flag=1;
                }//else
                break;
                case 'q':System.out.println("Player 1 Wins!");
                System.exit(0);
                default:System.out.println("Please enter correctly");
            }//switch
        }while(flag==0);
    }//p2
    void display(int a[][])
    {//disp
        for(int i=0;i<7;i++)
        {//i
            for(int j=0;j<7;j++)
            {//j
                System.out.print(a[i][j]+"\t");
            }//j
            System.out.println();
        }//i
    }//disp
    public static void main()throws IOException
    {//main
        int a[][]=new int[7][7];
        a[1][3]=2;
        a[5][3]=3;
        int p1[]={1,3};
        int p2[]={5,3};
        bots obj=new bots();
        int ch=1;
        obj.display(a);
        do
        {
            obj.player1(a,p1,p2);
            obj.display(a);
            obj.player2(a,p1,p2);
            obj.display(a);
            System.out.println("Enter 1 to continue. 0 to exit");
            ch=Integer.parseInt(br.readLine());
        }while(ch!=0);
    }//main
}//class