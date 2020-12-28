pipeline {
  agent any
  stages {
    stage('Grant Permission') {
      steps {
        sh 'chmod +x gradlew'
      }
    }  
    stage('Build') {
      steps {
        echo 'Building OPMonsters'
        sh './gradlew build -Dorg.gradle.jvmargs=-Xmx756M'
      }
    }

    stage('Test') {
      steps {
        echo 'Testing OPMonsters'
        sh './gradlew test -Dorg.gradle.jvmargs=-Xmx756M'
      }
    }

  }
  post {
    always {
      script {
        archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true, onlyIfSuccessful: true, allowEmptyArchive: true
      }

    }

  }
}
