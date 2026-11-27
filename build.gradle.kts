// Версии закреплены под образ проверки grader/android-individual (infra/runner/images/android-individual/VERSIONS.md).
// Участник их не меняет: при проверке сборочные файлы восстанавливаются из заготовки.
plugins {
    id("com.android.application") version "9.4.1" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.3.21" apply false
}
