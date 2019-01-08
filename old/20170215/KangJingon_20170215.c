     1  #include<stdio.h>
     2  #include<string.h>
     3
     4  /* Copy from internet  ¤Ğ¤Ğ ................... */
     5
     6  void generate_alphabets ( char *num, char *str, int start, int depth )
     7  {
     8     if ( start >= strlen(num) )
     9     {
    10         printf ( " %s \n", str );
    11         return;
    12     }
    13
    14     str [depth] = ( num[start] - '0' - 1 + 97 );
    15     generate_alphabets ( num, str, start+1, depth+1 );
    16
    17     if ( num[start+1] ) {
    18
    19         int result = ( num[start]-'0' ) * 10 + (num[start+1]-'0') - 1;
    20         if (result <= 25) {
    21             str[depth] = result + 97;
    22         }
    23         str[depth+1] = '\0';
    24
    25         generate_alphabets ( num, str, start+2, depth+1 );
    26
    27     }
    28  }
    29
    30  void main()
    31  {
    32      char str[100] = { 0, }, num[10]="1123";
    33
    34      generate_alphabets ( num, str, 0, 0 );
    35  }

 aabc
 aaw
 alc
 kbc
 kw