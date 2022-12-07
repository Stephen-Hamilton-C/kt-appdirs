package appdirs

import kotlinx.cinterop.toKString
import platform.posix.getenv

internal object WinAppDirs : IAppDirs {
    
    private val appData = getenv("LOCALAPPDATA")?.toKString() ?: throw Exception("LocalAppData environment variable does not exist!")
    
    override fun configUserDir(name: String, author: String, version: String): String {
        return "$appData\\$author\\$name\\$version"
    }
    
    override fun configUserDir(name: String, author: String): String {
        return "$appData\\$author\\$name"
    }
    
    override fun configUserDir(name: String): String {
        return "$appData\\$name"
    }
    
    override fun dataUserDir(name: String, author: String, version: String): String {
        return "$appData\\$author\\$name\\$version"
    }
    
    override fun dataUserDir(name: String, author: String): String {
        return "$appData\\$author\\$name"
    }
    
    override fun dataUserDir(name: String): String {
        return "$appData\\$name"
    }
    
}