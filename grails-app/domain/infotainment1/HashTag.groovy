package infotainment1

class HashTag {
    String Hash_name

    static belongsTo = [video:Video,image:Image,gif:Gif]
    static constraints = {
        video()
        image()
        gif()
    }
}
