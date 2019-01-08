     1  #include <stdio.h>
     2  #include <string.h>
     3
     4  struct exam {
     5      char  loc[20];
     6      char  name[20];
     7      int   ba_point;
     8      int   java_point;
     9      int   total_score;
    10      int   total_grade;
    11  } team[12] = {
    12  "강서빌딩", "소지섭", 65, 70, -1, -1,
    13  "강서빌딩", "강동원", 55, 45, -1, -1,
    14  "강서빌딩", "송혜교", 70, 63, -1, -1,
    15  "강서빌딩", "전지현", 45, 90, -1, -1,
    16  "트윈",     "이영애", 65, 85, -1, -1,
    17  "트윈",     "박보검", 54, 78, -1, -1,
    18  "트윈",     "이상윤", 85, 98, -1, -1,
    19  "트윈",     "김태희", 90, 75, -1, -1,
    20  "트윈",     "박서준", 55, 45, -1, -1,
    21  "가산",     "최시원", 35, 40, -1, -1,
    22  "가산",     "에릭",   60, 90, -1, -1,
    23  "서초",     "박형식", 95, 40, -1, -1 };
    24  struct exam *temp[12], *sp;
    25
    26  struct loc_score_grade {
    27      char  loc[20];
    28      int   score;
    29      int   grade;
    30      int   count;
    31  } loca[4] = {
    32  "강서빌딩",0,0,0, "트윈",0,0,0,  "가산",0,0,0,  "서초",0,0,0 };
    33
    34  void main()
    35  {
    36      int  idx1, idx2, flag;
    37
    38
    39      for ( idx1=0; idx1<12; idx1++ ) {
    40
    41          team[idx1].total_score = (team[idx1].ba_point + team[idx1].java_point) / 2;
    42
    43          if      ( team[idx1].total_score < 30 )  team[idx1].total_grade = 0;
    44          else if ( team[idx1].total_score < 60 )  team[idx1].total_grade = 1;
    45          else if ( team[idx1].total_score < 80 )  team[idx1].total_grade = 2;
    46          else                                     team[idx1].total_grade = 3;
    47
    48          if      ( strcmp (team[idx1].loc, loca[0].loc) == 0 )  loca[0].score += team[idx1].total_score, loca[0].grade +=  team[idx1].total_grade, loca[0].count++;
    49          else if ( strcmp (team[idx1].loc, loca[1].loc) == 0 )  loca[1].score += team[idx1].total_score, loca[1].grade +=  team[idx1].total_grade, loca[1].count++;
    50          else if ( strcmp (team[idx1].loc, loca[2].loc) == 0 )  loca[2].score += team[idx1].total_score, loca[2].grade +=  team[idx1].total_grade, loca[2].count++;
    51          else                                                   loca[3].score += team[idx1].total_score, loca[3].grade +=  team[idx1].total_grade, loca[3].count++;
    52
    53          temp[idx1] = &team[idx1];
    54
    55          printf ( "%10s, %10s, %5d, %5d, %5d, %5d \n",
    56               temp[idx1]->loc, temp[idx1]->name, temp[idx1]->ba_point, temp[idx1]->java_point, temp[idx1]->total_score, temp[idx1]->total_grade );
    57      }
    58
    59      for ( idx1=0; idx1<11; idx1++ ) {
    60          for ( idx2=idx1; idx2<12; idx2++ ) {
    61
    62              flag = 0;
    63              if      ( temp[idx1]->total_grade > temp[idx2]->total_grade )  flag++;
    64              else if ( temp[idx1]->total_grade == temp[idx2]->total_grade ) {
    65
    66                   if      ( temp[idx1]->ba_point > temp[idx2]->ba_point )   flag++;
    67                   else if ( temp[idx1]->ba_point = temp[idx2]->ba_point ) {
    68                         if ( temp[idx1]->java_point > temp[idx2]->java_point )   flag++;
    69                   }
    70              }
    71
    72              if ( flag ) {
    73                  sp = temp[idx1];
    74                  temp[idx1] = temp[idx2];
    75                  temp[idx2] = sp;
    76              }
    77          }
    78          printf ( "%10s, %10s, %5d, %5d, %5d, %5d \n",
    79               temp[idx1]->loc, temp[idx1]->name, temp[idx1]->ba_point, temp[idx1]->java_point, temp[idx1]->total_score, temp[idx1]->total_grade );
    80      }
    81
    82      for ( idx1 = 0; idx1 < 4; idx1 ++) {
    83          printf ( "%10s - %3d - %3d \n", loca[idx1].loc, loca[idx1].score/loca[idx1].count, loca[idx1].grade/loca[idx1].count);
    84      }
    85  }

강서빌딩,  소지섭,    65,    70,    67,     2
강서빌딩,  강동원,    55,    45,    50,     1
강서빌딩,  송혜교,    70,    63,    66,     2
강서빌딩,  전지현,    45,    90,    67,     2
    트윈,  이영애,    65,    85,    75,     2
    트윈,  박보검,    54,    78,    66,     2
    트윈,  이상윤,    85,    98,    91,     3
    트윈,  김태희,    90,    75,    82,     3
    트윈,  박서준,    55,    45,    50,     1
    가산,  최시원,    35,    40,    37,     1
    가산,     에릭,    60,    90,    75,     2
    서초,  박형식,    95,    40,    67,     2


    가산,  최시원,    35,    40,    37,     1
    트윈,  박서준,    55,    45,    50,     1
강서빌딩,  강동원,    55,    45,    50,     1
    서초,  박형식,    95,    40,    67,     2
    트윈,  박보검,    95,    78,    66,     2
    트윈,  이영애,    95,    85,    75,     2
강서빌딩,  전지현,    95,    90,    67,     2
강서빌딩,  송혜교,    95,    63,    66,     2
강서빌딩,  소지섭,    95,    70,    67,     2
    가산,     에릭,    95,    90,    75,     2
    트윈,  김태희,    90,    75,    82,     3


강서빌딩 -  62 -   1
    트윈 -  72 -   2
    가산 -  56 -   1
    서초 -  67 -   2
