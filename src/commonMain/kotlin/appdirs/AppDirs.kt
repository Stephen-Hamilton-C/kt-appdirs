package appdirs

expect object AppDirs : IAppDirs {
    override fun configUserDir(name: String, author: String, version: String): String
    override fun configUserDir(name: String, author: String): String
    override fun configUserDir(name: String): String

    override fun dataUserDir(name: String, author: String, version: String): String
    override fun dataUserDir(name: String, author: String): String
    override fun dataUserDir(name: String): String
}