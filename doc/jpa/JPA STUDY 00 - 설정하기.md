# JPA STUDY 00 - 설정하기
### 1. DBMS 준비 (DOCKER - Postgres)
```text
# docker container 실행
> docker run -p 5432:5432 -e POSTGRES_PASSWORD=pass -e POSTGRES_USER=hanum -e POSTGRES_DB=boarddata --name postgres_boot -d postgres

# 실행 중인 cotainer에서 명령어 실행
> docker exec -i -t postgres_boot bash

# postgresql 접속
> su - postgres
> psql -U hanum -d boarddata
```

<br>

### 2. 종속성 설정
**pom.xml**
```xml

<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```
> * postgresql는 runtime시 연결
> * h2는 test시 연결

<br>

### 3. application.properties
```text
spring.datasource.url=jdbc:postgresql://localhost:5432/boarddata
spring.datasource.username=hanum
spring.datasource.password=pass

spring.jpa.hibernate.ddl-auto=validate

# Method.org.postgresql.jdbc.PgConnection.createClob() is not yet implemented
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true
logging.level.org.hibernate.type.descriptor.sql=trace
```