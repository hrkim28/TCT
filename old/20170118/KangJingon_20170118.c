#include <stdio.h>

void main()
{
    int n=3, m=4, maxCnt=5;
    int idxn, idxm;
    int disp1[10][10]={0,}, disp2[10][10]={0,};

    for (idxn=0;idxn<n;idxn++) {
        for (idxm=0;idxm<m;idxm++) {

            disp1[idxn][idxm] =  (idxm+m*idxn) >= maxCnt ? (idxm+m*idxn) - 2*(idxm+m*idxn-maxCnt+1) : idxm+m*idxn;
            if(disp1[idxn][idxm] < 0)  disp1[idxn][idxm] = 0;

            disp2[idxn][idxm] =  (idxn+n*idxm) >= maxCnt ? (idxn+n*idxm) - 2*(idxn+n*idxm-maxCnt+1) : idxn+n*idxm;
            if(disp2[idxn][idxm] < 0)  disp2[idxn][idxm] = 0;

        }
    }


    for (idxn=0;idxn<n;idxn++) {
        for (idxm=0;idxm<m;idxm++) {
            printf("%c",disp1[idxn][idxm]+'A');
        }

        printf("     ");

        for (idxm=0;idxm<m;idxm++) {
            printf("%c",disp2[idxn][idxm]+'A');
        }
        printf("\n");
    }
}
