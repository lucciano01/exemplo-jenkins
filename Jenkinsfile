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
                deploy adapters: [tomcat9(credentialsId: 'TestLoginTomcat', path: '', url: 'http://172.16.31.7:9000')], contextPath: 'lt', war: 'exemplo-jenkins.war'
            }
        }

    }
}