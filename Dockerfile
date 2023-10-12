FROM openjdk:17
# 프로젝트를 복사 해서 도커 파일안으로 복사
# 현재경로에 있는 프로젝트를 project라는 폴더를 만들고 copy하자
RUN ["mkdir", "project"]
COPY . ./project

# 빌드
RUN ["chmod", "744", "./project/gradlew"]
RUN ["ls"]
RUN ["/project/gradlew","build"]


# jar실행
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","project/build/libs/*T.jar"]