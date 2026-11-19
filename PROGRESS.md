# 진도 관리

시작할 때 이 파일을 읽고, 단계가 끝나면 갱신한다. 장별 메모는 `docs/notes/chNN.md`에 둔다.

## 현재 상태
- 기준 커밋: `2250b9e` (`git log`로 확인)
- 다음 작업: 18장 (쪽수 확인 필요). 8장은 개념 장이라 코드 없음

## 완료
| 장 | 범위 | 상태 |
|---|---|---|
| 3장 | p.54~89 | 완료 |
| 4장 | p.91~117 | 완료 |
| 5장 | p.118~ (끝 쪽수 확인 필요) | 완료 |
| 6장 | 데이터베이스 영속성 (쪽수 확인 필요) | 완료, `docs/notes/ch06.md` |
| 7장 | 리액티브 + 메시징 (쪽수 확인 필요) | RabbitMQ·Kafka·파티션 검증 완료, `docs/notes/ch07.md` |
| 9장 | Eureka 서비스 디스커버리 (쪽수 확인 필요) | build·RabbitMQ test-em-all 통과 (노트는 로컬 다운로드 폴더 MSA-notes) |
| 10장 | Spring Cloud Gateway (쪽수 확인 필요) | 전체 build·RabbitMQ test-em-all 통과, `docs/notes/ch10.md` |
| 11장 | 보안 HTTPS·OAuth2 (쪽수 확인 필요) | 전체 build·RabbitMQ test-em-all 통과, `docs/notes/ch11.md` |
| 12장 | Config Server (쪽수 확인 필요) | build(review 간헐 실패 제외)·RabbitMQ test-em-all 통과, `docs/notes/ch12.md` |
| 13장 | Resilience4j (쪽수 확인 필요) | build(review 간헐 실패 제외)·RabbitMQ test-em-all(서킷 브레이커 포함) 통과, `docs/notes/ch13.md` |
| 14장 | 분산 추적 Zipkin (쪽수 확인 필요) | build·RabbitMQ test-em-all 통과, Zipkin 추적 직접 확인, `docs/notes/ch14.md` |
| 15장 | 쿠버네티스 소개 (쪽수 확인 필요) | build 통과, minikube nginx 실습 확인(클러스터 삭제), `docs/notes/ch15.md` |
| 16장 | 쿠버네티스 배포·Helm (쪽수 확인 필요) | build·Compose·dev-env K8s test-em-all 통과. K8s 간헐 지연 원인 불명, `docs/notes/ch16.md` |
| 17장 | Config Server·Gateway를 쿠버네티스로 대체 (쪽수 확인 필요) | build·Compose·K8s Ingress test-em-all 통과, `docs/notes/ch17.md` |

## 진행 중
- 3장 수동 복습: ③ p.64~67 api Java, 2/14 진행 중

## 메모
- 새 장을 시작하기 전에 이전 장 컨테이너를 내린다 (8080 충돌).
- 교재 쪽수는 추측하지 않고 "쪽수 확인 필요"로 적는다.
