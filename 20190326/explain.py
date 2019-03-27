#이동근 책임님이 작성한 코드에 주석을 추가하였습니다.c

def calFibonacci(inputData):

    iniData = [0,1]  #IniData 피보나치 수열이 저장되는 배열, 초기에 0과 1을 입력 해 준다.

    while True:
         #마이너스 인덱스 사용 iniData[-1] --> 배열의 마지막 값
          sumData = iniData[-1] + iniData[-2] # 피보나치 배열에서 마지막 두 항을 더하여 다음 피보나치 수열을 구함

          if sumData <= inputData: # 피보나치 수열이 input 값 n 이하일때 아래 수행 (문제 조건)

              iniData.append(sumData) #배열.append(데이터) --> 배열 마지막에 값 추가

          else: # 조건과 다르면 반복문을 빠져나옴
              break

    print(iniData) # 출력함수 print --> iniData를 출력


#iniData = 1
#iniData = 100
iniData = 500000
calFibonacci(iniData)
    
