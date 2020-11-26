pipeline {
    agent any
    tools {
        // Configure el M3 en mis variables de entorno de windows
        maven "M3"
    }
    parameters {
        string(defaultValue: 'main', description: 'branch', name: 'GIT_BRANCH')
    }
    
    stages {
        stage('Clone sources') {
            steps {
                git branch: "${params.GIT_BRANCH}", url: 'https://github.com/rolando2ks/ejemplo-maven.git'
            }
        }
        
        stage('compile'){
            steps {
                bat 'mvn clean compile -e'
            }
        }
        stage('Test Code'){
            steps {
                bat 'mvn clean test -e'
            }
        }
        stage('Jar Code'){
            steps {
                bat 'mvn clean package -e'
            }
        }
    }
}
