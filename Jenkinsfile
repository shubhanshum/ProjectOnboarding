pipeline{
    agent{
        node{
            label 'master'
        }
    }
    stages{
        stage('SCM checkout'){
            steps{
                git "https://github.com/shubhanshum/ProjectOnboarding.git"
            }
        }
        stage('Build'){
            steps{
                script{
                    bat(/mvn clean/)
                }
            }
        }
        stage('Install'){
            steps{
                script{
                    bat(/mvn install/)
                }
            }
        }
        stage('Test'){
            steps{
                script{
                    bat(/mvn test/)
                }
            }
        }
    }
}