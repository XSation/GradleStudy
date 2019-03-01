import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 定义一个自定义插件，实现plugin接口，泛型为使用这个插件的project，即调用apply方法的地方
 */
class MyPlugin implements Plugin<Project> {


    //project为使用apply方法的地方
    @Override
    void apply(Project project) {
        println "hello ${project} ${project.extensions.android.compileSdkVersion}"
    }

}