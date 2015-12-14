package infotainment1

class Video {
        String video_id
        String video_name
        String video_url

    static hasMany = [hashtag:HashTag]

    static constraints = {
    }
}
