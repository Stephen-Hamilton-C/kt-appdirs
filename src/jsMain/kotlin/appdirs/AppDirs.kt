package appdirs

actual object AppDirs : IAppDirs {
    actual override fun configUserDir(name: String, author: String, version: String): String {
        TODO("Not yet implemented")
    }

    actual override fun configUserDir(name: String, author: String): String {
        TODO("Not yet implemented")
    }

    actual override fun configUserDir(name: String): String {
        TODO("Not yet implemented")
    }

    actual override fun dataUserDir(name: String, author: String, version: String): String {
        TODO("Not yet implemented")
    }

    actual override fun dataUserDir(name: String, author: String): String {
        TODO("Not yet implemented")
    }

    actual override fun dataUserDir(name: String): String {
        TODO("Not yet implemented")
    }
}