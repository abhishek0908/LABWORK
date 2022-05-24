class ControlStatement {
public static void main(String args[])
{
loop();
loop2();
}
static void loop2()
{
System.out.println("label");
search:
for(int i=0;i<10;i++)
{
for(int j=0;j<10;j++)
{
if(i==2)
{
break search;
}
System.out.println(j);
}
}
}
static void loop()
{
for(int i=0;i<10;i++)
{
if(i==5)
continue;
System.out.println(i);
}
System.out.println("Using While");
int i=0;
while(i<10)
{
if(i==5)
{
break;
}
System.out.println(i);
i++;
}
i=0;
System.out.println("Using do while");
do{
System.out.println(i);
i++;
}
while(i<10);
}

}
