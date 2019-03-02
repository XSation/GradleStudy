import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class MTask extends DefaultTask {

    MTask() {
        group = "xuekai"
    }

    @TaskAction
    void action() {
        println "${project.extensions.mplugin.name}${project.extensions.mplugin.code}"
    }
}