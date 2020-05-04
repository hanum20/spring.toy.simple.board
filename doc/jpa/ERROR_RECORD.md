# 오류 기록
***
#####  'hibernate.dialect' not set 관련 오류
Error.log
> org.hibernate.HibernateException: Access to DialectResolutionInfo cannot be null when 'hibernate.dialect' not set

해결
```text
# application.properties에 아래의 설정 추가
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL95Dialect
```
* JPA에서 어떠한 DB를 사용할지 명시해준다.
    * 이 문제는 Test용 DB와 runtime용 DB가 달라서 발생하는 문제인 듯.
    * Pom.xml에 각 DB의 scope를 설정하고 Test 코드를 실행했지만 <br>왜 이런 문제가 발생하는지 모르겠음.
    
***
