package com.jackandphantom.ciruclarprogressbar.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by love on 02-Apr-18.
 */

public class AllSongsDatum implements Serializable {

    @SerializedName("song_id")
    @Expose
    private Integer songId;
    @SerializedName("song_name")
    @Expose
    private String songName;
    @SerializedName("artist_name")
    @Expose
    private String artistName;
    @SerializedName("song_url")
    @Expose
    private String songUrl;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("like_status")
    @Expose
    private Integer likeStatus;
    @SerializedName("total_likes")
    @Expose
    private Integer totalLikes;
    @SerializedName("song_time")
    @Expose
    private String songTime;

    @SerializedName("artist_id")
    @Expose
    private Integer artistId;



    @SerializedName("genres_id")
    @Expose
    private Integer genresId;
    @SerializedName("genres_name")
    @Expose
    private String genresName;
    @SerializedName("total_records")
    @Expose
    private Integer totalRecords;


    //Recent Play

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("dayago")
    @Expose
    private Integer dayago;

    @SerializedName("5")
    @Expose
    private List<AllSongsDatum> _5 = null;

     @SerializedName("6")
    @Expose
    private List<AllSongsDatum> _6 = null;
    @SerializedName("9")
    @Expose
    private List<AllSongsDatum> _9 = null;
    @SerializedName("13")
    @Expose
    private List<AllSongsDatum> _13 = null;
    @SerializedName("17")
    @Expose
    private List<AllSongsDatum> _17 = null;
    @SerializedName("23")
    @Expose
    private List<AllSongsDatum> _23 = null;

    public List<AllSongsDatum> get_5() {
        return _5;
    }

    public void set_5(List<AllSongsDatum> _5) {
        this._5 = _5;
    }

    public List<AllSongsDatum> get_6() {
        return _6;
    }

    public void set_6(List<AllSongsDatum> _6) {
        this._6 = _6;
    }

    public List<AllSongsDatum> get_9() {
        return _9;
    }

    public void set_9(List<AllSongsDatum> _9) {
        this._9 = _9;
    }

    public List<AllSongsDatum> get_13() {
        return _13;
    }

    public void set_13(List<AllSongsDatum> _13) {
        this._13 = _13;
    }

    public List<AllSongsDatum> get_17() {
        return _17;
    }

    public void set_17(List<AllSongsDatum> _17) {
        this._17 = _17;
    }

    public List<AllSongsDatum> get_23() {
        return _23;
    }

    public void set_23(List<AllSongsDatum> _23) {
        this._23 = _23;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDayago() {
        return dayago;
    }

    public void setDayago(Integer dayago) {
        this.dayago = dayago;
    }


    //Recent Play



    public Integer getGenresId() {
        return genresId;
    }

    public void setGenresId(Integer genresId) {
        this.genresId = genresId;
    }

    public String getGenresName() {
        return genresName;
    }

    public void setGenresName(String genresName) {
        this.genresName = genresName;
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }


    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getLikeStatus() {
        return likeStatus;
    }

    public void setLikeStatus(Integer likeStatus) {
        this.likeStatus = likeStatus;
    }

    public Integer getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(Integer totalLikes) {
        this.totalLikes = totalLikes;
    }

    public String getSongTime() {
        return songTime;
    }

    public void setSongTime(String songTime) {
        this.songTime = songTime;
    }

}
