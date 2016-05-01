grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.repos.alephsa.url = "https://api.bintray.com/maven/alephsa/maven/activiti-spring-security"
grails.project.repos.alephsa.type = "maven"
grails.project.repos.alephsa.username = "alephsa"
grails.project.repos.alephsa.password = "9c7662d7a72d6571b54626a931f070f33e4e46e0"
grails.release.scm.enabled = false
grails.project.repos.default = "alephsa"

grails.project.dependency.resolver = "maven" // or ivy
grails.project.dependency.resolution = {
    inherits('global') {
        excludes 'hibernate', 'tomcat'
    }

    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
        mavenCentral()
        mavenLocal()
        mavenRepo "https://maven.alfresco.com/nexus/content/groups/public/"
        mavenRepo 'http://repo.spring.io/milestone'
        mavenRepo 'http://dl.bintray.com/alephsa/maven'
    }

    dependencies {
        compile 'net.sf.ehcache:ehcache:2.7.0'
    }
    plugins {
        compile ":activiti:5.20.0"
        compile ":spring-security-core:2.0-RC4"

        compile ':hibernate:3.6.10.15', ':tomcat:7.0.53', ':scaffolding:2.0.3' {
            export = false
        }

        compile ":release:3.0.1"
    }
}

// grails.plugin.location.activiti="../grails-activiti-plugin"
