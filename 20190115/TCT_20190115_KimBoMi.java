int inputValue = 500000;
int k = 0 ; 
int b = 1 ;

System.out.print(k);
k=b;              
while(k <= inputValue ){                  
    System.out.print(","+k);
    if(b <= inputValue){
        System.out.print(","+b);
    }
    k=k+b;                  
    b=k+b;                  
}