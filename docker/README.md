# 사전 실행 쿼리
```sql
CREATE DATABASE app;

USE app;
    
CREATE TABLE user (
  seq BIGINT AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  age INT NOT NULL,
  PRIMARY KEY (seq)
);
```
