package appdirs

import net.harawata.appdirs.AppDirsFactory

actual object AppDirs : IAppDirs {
    private val appDirs = AppDirsFactory.getInstance();
    
    actual override fun configUserDir(name: String, author: String, version: String): String {
        return appDirs.getUserConfigDir(name, author, version)
    }
    actual override fun configUserDir(name: String, author: String): String {
        return configUserDir(name, author, "")
    }
    actual override fun configUserDir(name: String): String {
        return configUserDir(name, "", "")
    }

    actual override fun dataUserDir(name: String, author: String, version: String): String {
        return appDirs.getUserDataDir(name, author, version)
    }
    actual override fun dataUserDir(name: String, author: String): String {
        return dataUserDir(name, author, "")
    }
    actual override fun dataUserDir(name: String): String {
        return dataUserDir(name, "", "")
    }
}