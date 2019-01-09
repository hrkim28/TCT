# * git 세팅 및 commit 방법  

## 1. git bash 사용 

#### 1-1) git 다운로드 및 설치(반드시 bash 같이 설치)  
- bash 설치는 default로 체크되어 있으니 체크해제 하지 말 것!
https://git-scm.com/downloads  
#### 1-2) 작업 폴더 선정 & git bash 실행
![](https://github.com/hrkim28/TCT/blob/master/img/git_bash.JPG?raw=true)
#### 1-3) git bash > git 초기화 & git 계정 정보 세팅  
![](https://github.com/hrkim28/TCT/blob/master/img/git_clone.JPG?raw=true)
~~~
$git init

$git config --global user.name "계정명"
$git config --global user.email "가입시 사용한 메일주소"

(예시) - 팀원 분들 세팅 완료되시면 해당 계정 정보 삭제하겠습니다.
$git config --global user.name "hrkim28"
$git config --global user.email "khr76693@lgcns.com" 
~~~

#### 1-4) git bash > git clone을 통해 git repository 저장소 clone  
- git repository 에 있는 소스를 받게 됩니다.
~~~
$git clone "https://github.com/hrkim28/TCT.git"
~~~

#### 1-5) git commit
![참고1. Add file](https://github.com/hrkim28/TCT/blob/master/img/git_add.JPG?raw=true)
![참고2. Commit](https://github.com/hrkim28/TCT/blob/master/img/git_commit.JPG?raw=true)

~~~
$git add 파일명

$git commit -m "commit message를 입력하시면 됩니다."

$git push
~~~
