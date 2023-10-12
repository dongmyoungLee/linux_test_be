FROM openjdk:17
# 프로젝트를 복사 해서 도커 파일안으로 복사
# 현재경로에 있는 프로젝트를 project라는 폴더를 만들고 copy하자
#RUN ["mkdir", "project"]
#COPY . /app/
#WORKDIR /app
# 빌드
#RUN ["chmod", "744", "./project/gradlew"]
#RUN ["./gradlew","clean", "build", "--no-debug"]
COPY build/libs/*T.jar app.jar


# jar실행
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","app.jar"]