# MSA 실습 저장소

교재 『스프링 부트 3와 스프링 클라우드를 활용한 마이크로서비스 구축』 실습 코드.
답변과 설명은 한국어로 한다.

## 기준 버전
- Java 21 / Spring Boot 4.0.7 / Gradle-Groovy
- 교재 원래 기준은 Java 24 / Spring Boot 3.5.0
- Gradle Wrapper 9.8.2 (교재 8.14)
- 교수님이 따로 언급한 것만 수업 기준을 따르고, 나머지는 교재대로 진행한다.
- 교재 예제는 Boot 4.0.7에서 동작하도록 필요한 부분만 고친다.

## 구조
- Chapter03, Chapter04, Chapter05: 장별 실습 코드
- 서비스 포트: composite 7001 / product 7002 / recommendation 7003 / review 7004
- 교재 원본은 $BOOK_HOME 에 있다. 교재와 비교할 때 이 경로를 사용한다.

## 이미 적용한 Boot 4 변경 사항
새 장에서 교재 코드를 복사하면 아래 수정이 사라질 수 있으니 확인한다.
- Jackson 3 final 필드 역직렬화: yml `allow-final-fields-as-mutators` + composite RestTemplate에 Boot 매퍼 연결
- Jackson 3 패키지 변경: `com.fasterxml.jackson` → `tools.jackson`, `IOException` → `JacksonException`
- composite 오류 처리 switch에 `UNPROCESSABLE_CONTENT` 추가 (500 대신 422)
- 테스트: `@AutoConfigureWebTestClient`, 422는 숫자로 비교, `spring.web.error.include-message`
- 테스트 스타터 변경: `spring-boot-starter-actuator-test`, `spring-boot-starter-webflux-test`
- Dockerfile 이미지: `21-jre-noble`
- springdoc: 3.0.3 (2곳). composite Application 클래스는 OpenAPI 빈과 Jackson 3 RestTemplate을 모두 유지한다.

## 작업 규칙
- 목표는 학습이다. 코드를 고칠 때는 무엇을 왜 바꾸는지 먼저 설명한다.
- 교재 내용과 다른 변경은 `[Boot4]`로 표시하고, 교재 기준에서 달라진 이유를 적는다. 표시는 답변과 가이드에서 하며, 기존 소스에 주석을 추가하지 않는다.
- 요청받지 않은 리팩터링, 버전 변경, 파일 삭제를 하지 않는다.
- commit과 push는 사용자가 요청할 때만 한다.
- 시작할 때 PROGRESS.md를 읽는다. 단계가 끝나면 PROGRESS.md를 갱신하고, docs/notes/chNN.md에 명령, [Boot4] 변경, 복습 포인트를 20줄 이내로 추가한다. 교재 본문은 옮겨 적지 않는다.
- 이 저장소는 public이다. 교재 PDF, 정리본, 비밀값을 커밋하지 않는다.
- `build/` 아래의 파일은 생성물이므로 수정하지 않는다. 소스는 `src/` 를 본다.

## 쪽수 표기
- 교재 PDF는 이 저장소에 없다. 교재 쪽수를 추측해서 쓰지 않는다.
- 쪽수를 모르면 "쪽수 확인 필요"라고 표시한다.

## 검증 명령
```bash
cd ~/MSA/Chapter05 && ./gradlew build
cd ~/MSA/Chapter05 && ./test-em-all.bash start stop
```
