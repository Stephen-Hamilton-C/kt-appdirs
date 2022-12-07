package appdirs

actual object AppDirs : IAppDirs {
    private val appDirs: IAppDirs = when(Platform.osFamily) {
        OsFamily.LINUX -> UnixAppDirs
        OsFamily.MACOSX -> MacAppDirs
        OsFamily.WINDOWS -> WinAppDirs
        else -> throw IllegalStateException("Unsupported OS. Expected Windows, macOS, or Linux, but instead found ${Platform.osFamily}")
    }

    actual override fun configUserDir(name: String, author: String, version: String): String {
        return appDirs.configUserDir(name, author, version)
    }
    actual override fun configUserDir(name: String, author: String): String {
        return appDirs.configUserDir(name, author)
    }
    actual override fun configUserDir(name: String): String {
        return appDirs.configUserDir(name)
    }

    actual override fun dataUserDir(name: String, author: String, version: String): String {
        return appDirs.dataUserDir(name, author, version)
    }
    actual override fun dataUserDir(name: String, author: String): String {
        return appDirs.dataUserDir(name, author)
    }
    actual override fun dataUserDir(name: String): String {
        return appDirs.dataUserDir(name)
    }

}