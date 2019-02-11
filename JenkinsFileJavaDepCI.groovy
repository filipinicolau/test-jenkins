node {
    stage('Clone') {
        echo 'Cloning....'
        git url: 'https://github.com/filipinicolau/test-jenkins.git'
    }
    stage('Exec orchestrator') {
        echo 'Exec....'
        bat 'echo funciona'
        bat 'C:\\Users\\fnicolau\\AppData\\Local\\Programs\\Python\\Python37-32\\python teste.py'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}