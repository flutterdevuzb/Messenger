package uz.uchqun.telegramclone.model

data class CommanModel(
    val id: String = "",
    var username: String = "",
    var bio: String = "",
    var fullname: String = "",
    var status: String = "",
    var phone: String = "",
    var photoUrl: String = "empty",


    var text:String ="",
    var type:String ="",
    var from:String ="",
    var timeStamp:String=""

)