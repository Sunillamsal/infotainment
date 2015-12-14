package infotainment1

class Gif {
    String Gif_id
    String Gif_name
    String Gif_url

    static hasMany = [hashtag:HashTag]
    static constraints = {
    }
}
