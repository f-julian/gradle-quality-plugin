package ru.vyarus.gradle.plugin.quality


import org.gradle.api.Project

/**
 * @author Vyacheslav Rusakov
 * @since 16.02.2019
 */
class SpotbugsHeapSizeSettingTest extends AbstractTest {

    def "Check default max heap size set"() {

        when: "apply plugin"
        file('src/main/java').mkdirs()

        Project project = project {
            apply plugin: 'java'
            apply plugin: 'ru.vyarus.quality'
        }

        then: "maxHeapSize set"
        project.tasks.spotbugsMain.maxHeapSize == '1g'
    }


    def "Check manual max heap size not overridden"() {

        when: "apply plugin"
        file('src/main/java').mkdirs()

        Project project = project {
            apply plugin: 'java'
            apply plugin: 'com.github.spotbugs'
            apply plugin: 'ru.vyarus.quality'

            spotbugsMain.maxHeapSize = '2g'
        }

        then: "maxHeapSize not overridden"
        project.tasks.spotbugsMain.maxHeapSize == '2g'
    }
}
