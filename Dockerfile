FROM bellsoft/liberica-openjdk-alpine

#workspace
WORKDIR /home/selenium-docker

#add the required files
ADD target/docker-resources ./

#Environment variables
#BROWSER
#HUB_HOST
#TEST_SUITE

#run the tests
ENTRYPOINT  java  -cp 'resources/libs/*' \
            -Dselenium.grid.enabled=true \
            -Dselenium.grid.hubHost=${HUB_HOST} \
            -Dbrowser=${BROWSER} \
             org.testng.TestNG \
             resources/test-suites/${TEST_SUITE}