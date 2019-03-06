#언어 판별
def checkLangKind(inputString):

    #자바 -> 영문 첫번째글자 소문자
    if(inputString.isalpha()&inputString[0].islower()) :
        return "j"
    # C++ -> _가 있고 전체 영문
    if(inputString.find("-")):
        inputString =inputString.replace("_","")
        if((inputString.isalpha())&(inputString.islower())):
            return "c"

    # 에러
    return "e"

def changeLang(inputString) :
    stringList=list(inputString)

    #java --> C++
    if(checkLangKind(inputString)=="j") :
        for i in range(1,len(stringList)) :
            if(stringList[i].isupper()) :
                stringList[i]=stringList[i].lower()
                stringList.insert(i,"_")
        resultString="".join(stringList)

    #C++ -> java
    elif(checkLangKind(inputString)=="c") :
        for i in range(1, len(stringList)):
            if (stringList[i - 1] == "_"):
                stringList[i] = stringList[i].upper()
        resultString="".join(stringList)
        resultString = resultString.replace("_","")

    else :
        resultString="에러입니다."

    return resultString



#예시
#[입력 예1]
print("입력 :  long_and_mnemonic_identifier")
print("출력 : ", changeLang("long_and_mnemonic_identifier"))
#[입력 예1]
print("입력 :  jobLog")
print("출력 : ", changeLang("jobLog"))
#[입력 예1]
print("입력 :  abc**")
print("출력 : ", changeLang("abc**"))