zacatek listopadu 2025
opakuji kurz objektoveho programovani 1 s panem jelinkem
jsem schopny pracovat s objekty, tridy apod., jen by to chtelo se doucit interfacy

mam na virtualce udelanej pres apache2 web server, napadlo me mu udelat backend pomoci javy, s tim ze to bude dobry trenink (a ano je pul jedny rano a vstavam v 7) a pri tom se doucim ty interfacy

pouzivam maven pri vytvareni projektu, protoze nepouzivam nejake urcite IDE ale spise text editory s LSP (Zed, neovim, apod)
- mvn archetype:generate -DgroupId=com.mycompany -DartifactId=zadani1 -DinteractiveMode=false
	- toto pouzivam pro zakladni aplikace na kurz
- pak mam na springboot aplikaci 2 moznosti podle cinana
	- mvn org.springframework.boot:spring-boot-maven-plugin:3.2.0:build-info org.apache.maven.plugins:maven-archetype-plugin:3.2.1:generate -DarchetypeArtifactId=spring-boot-maven-archetype -DgroupId=com.mycompany -DartifactId=zadani1 -DinteractiveMode=false
	- curl https://start.spring.io/starter.zip -d dependencies=web -d groupId=com.mycompany -d artifactId=zadani1 -o zadani1.zip && unzip zadani1.zip
	- start.spring.io

- mvn clean spring-boot:run

pro zaklady jsem vybral tutorial https://www.youtube.com/watch?v=gJrjgg1KVL4