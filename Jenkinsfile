def remote = [:]
remote.name = "localhost"
remote.host = "localhost"
remote.allowAnyHosts = true  

withCredentials([usernamePassword(credentialsId: 'jenkinsDeploy', passwordVariable: 'password', usernameVariable: 'userName')]) {
	remote.user = userName
	remote.password = password
}

pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh "echo 'Development branch created'"
        echo 'Pulling...' + env.BRANCH_NAME
        when {
            // case insensitive regular expression for truthy values
            expression { env.BRANCH_NAME == 'development' }
        }
        steps {
            sh 'echo "Not pushed to master."'
                echo 'Pulling...' + env.BRANCH_NAME
                //sh 'mvn clean install'
                archiveArtifacts 'target/my-app-1.0-SNAPSHOT.jar'

                //sshCommand remote: remote, command: 'for i in {1..5}; do echo -n \"Loop \$i \"; date ; sleep 1; done'
                sh 'echo "transfer jar file to deployment server"'
                sh 'pwd'
                sshCommand remote: remote, command: 'ls'
                sshPut remote: remote, from:'target/my-app-1.0-SNAPSHOT.jar', into: '/home/predator/Downloads/my-app-server', override: true
                //sh 'rm -rf testcase/target'
                sshCommand remote: remote, command: 'bash /home/predator/Downloads/my-app-server/start.sh'
                //sh '''
                //cd testcase
                //pwd
                //mvn test "-Dtest=Test.Runner"
                //'''
                //archiveArtifacts 'testcase/target/surefire-reports/*html'
                //sshCommand remote: remote, command: 'bash demo-mockup/stop.sh'
        }

        //script {
          //  if (env.BRANCH_NAME == 'master') {
            //    sh 'echo "Building project"'
           //     emailext(subject: 'Build Status', body: 'This is build status of thecurrent project', attachLog: true, from: 'reganshakya@gmail.com', to: 'regan@moco.com.np')
           // }else if (env.BRANCH_NAME == 'development') {
           //     sh 'echo "Not pushed to master."'
           //     echo 'Pulling...' + env.BRANCH_NAME
                //sh 'mvn clean install'
            //    archiveArtifacts 'target/my-app-1.0-SNAPSHOT.jar'

                //sshCommand remote: remote, command: 'for i in {1..5}; do echo -n \"Loop \$i \"; date ; sleep 1; done'
            //    sh 'echo "transfer jar file to deployment server"'
            //    sshCommand remote: remote, command: 'ls'
            //    sshPut remote: remote, from:'target/my-app-1.0-SNAPSHOT.jar', into: '/home/predator/Downloads/my-app-server', override: true
                //sh 'rm -rf testcase/target'
            //    sshCommand remote: remote, command: 'bash /home/predator/Downloads/my-app-server/start.sh'
                //sh '''
                //cd testcase
                //pwd
                //mvn test "-Dtest=Test.Runner"
                //'''
                //archiveArtifacts 'testcase/target/surefire-reports/*html'
                //sshCommand remote: remote, command: 'bash demo-mockup/stop.sh'
           // }
        //}
      }
    }

    stage('Test') {
      steps {
        sh 'echo "This is updated test again"'
	sh 'echo "Test is completed"'
      }
    }

    stage('Deploy') {
      steps {
        sh 'echo "Deploying"'
        sh 'echo "Deployment is complete"'
      }
    }

  }
}
