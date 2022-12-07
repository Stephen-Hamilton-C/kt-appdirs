package appdirs

import kotlinx.cinterop.toKString
import platform.posix.getenv

internal object MacAppDirs : IAppDirs {
    
    private val home = getenv("HOME")?.toKString() ?: "~"
    private val pref = "$home/Library/Preferences"
    private val appSupport = "$home/Library/Application Support"
    
    override fun configUserDir(name: String, author: String, version: String): String {
        return "$pref/$author/$name/$version"
    }
    
    override fun configUserDir(name: String, author: String): String {
        return "$pref/$author/$name"
    }
    
    override fun configUserDir(name: String): String {
        return "$pref/$name"
    }

    override fun dataUserDir(name: String, author: String, version: String): String {
        return "$appSupport/$author/$name/$version"
    }
    
    override fun dataUserDir(name: String, author: String): String {
        return "$appSupport/$author/$name"
    }
    
    override fun dataUserDir(name: String): String {
        return "$appSupport/$name"
    }
}