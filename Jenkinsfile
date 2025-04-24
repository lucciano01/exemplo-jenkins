pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
             sh 'mvn clean package -DskipTests=true'
            }
        }
        stage('Test'){
            steps{
             sh 'mvn test'
            }
        }
        stage('Deploy'){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'TestLoginTomcat', path: '', url: 'http://localhost:9000'), tomcat9(path: '', url: '')], contextPath: 'lt', war: 'target/exemplo-jenkins.war'
            }
        }

    }
}