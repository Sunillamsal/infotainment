package infotainment1

class Image {
    String image_id
    String image_name
    String image_url

    static hasMany = [hashtag:HashTag]

    static constraints = {
    }
}
