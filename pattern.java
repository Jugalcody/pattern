public class main{
public static void main(String args[]){

//pattern 1
 /* 1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    1 2 3 4 5 6 */
    
System.out.print("\n\nPattern 1 ------\n\n");
for(int j=1;j<7;j++){
for(int i=1;i<7;i++){
System.out.print(i);
if(j==i){
break;
}
}
System.out.print("\n");
}

//pattern 2
 /* A
    A B
    A B C */
System.out.print("\n\nPattern 2 ------\n\n");
for(int j=65;j<68;j++){
for(int i=65;i<68;i++){
System.out.print((char)i);
if(j==i){
break;
}
}
System.out.print("\n");
}

// pattern 3

/*  $ $ $ $
    $     $
    $     $  
    $ $ $ $  */
System.out.print("\n\nPattern 3 ------\n\n");
for(int j=1;j<5;j++){
for(int i=1;i<5;i++){

if (j==1 || j==4){
System.out.print("$ ");
}
else if(i==1 || i==4){
System.out.print("$ ");
}
else {
System.out.print("  ");
}
}

System.out.print("\n");
}

               
               
               
               
}}
