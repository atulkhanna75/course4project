pipeline {
    agent any
tools{
Maven: "MAVEN"
}
    stages {
        stage("version of software"){
            steps{
                sh "java --version"
            }
        }
        stage("compile java program"){
            steps{
                sh "mvn clean package"
             }
        }
        stage("run the docker"){
            steps{
                sh "docker-compose down"
		sh "docker-compose up --build -d"
		sh "docker ps"
     	       }
        }
 }    
}