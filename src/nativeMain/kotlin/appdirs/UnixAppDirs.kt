package appdirs

import kotlinx.cinterop.toKString
import platform.posix.getenv

internal object UnixAppDirs : IAppDirs {
    
    private val home = getenv("HOME")?.toKString() ?: "~"
    private val configHome = getenv("XDG_CONFIG_HOME")?.toKString() ?: "$home/.config"
    private val dataHome = getenv("XDG_DATA_HOME")?.toKString() ?: "$home/.local/share"
    
    override fun configUserDir(name: String, author: String, version: String): String {
        return "$configHome/$name/$version"
    }
    
    override fun configUserDir(name: String, author: String): String {
        return configUserDir(name)
    }
    
    override fun configUserDir(name: String): String {
        return "$configHome/$name"
    }

    override fun dataUserDir(name: String, author: String, version: String): String {
        return "$dataHome/$name/$version"
    }
    
    override fun dataUserDir(name: String, author: String): String {
        return dataUserDir(name)
    }
    
    override fun dataUserDir(name: String): String {
        return "$dataHome/$name"
    }

}