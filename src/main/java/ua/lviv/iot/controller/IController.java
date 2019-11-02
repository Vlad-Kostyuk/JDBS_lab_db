package ua.lviv.iot.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import ua.lviv.iot.model.BlackList;
import ua.lviv.iot.model.Comment;
import ua.lviv.iot.model.FotoAndVideo;
import ua.lviv.iot.model.MediaType;
import ua.lviv.iot.model.Post;
import ua.lviv.iot.model.Preference;
import ua.lviv.iot.model.PreferenceComment;
import ua.lviv.iot.model.Tag;
import ua.lviv.iot.model.TypePost;
import ua.lviv.iot.model.User;
import ua.lviv.iot.model.UserLog;
import ua.lviv.iot.model.UserSecurity;

public interface IController {
   
	String insertBlackList(BlackList blackList) throws SQLException;
    ArrayList<BlackList> findAllBlackList() throws SQLException;
    String updateBlackList(BlackList blackList, int user_id, int locking_user_id) throws SQLException;
    String deleteBlackList(int user_id, int locking_user_id) throws SQLException;
    
    String insertComment(Comment ñomment) throws SQLException;
    ArrayList<Comment> findAllComment() throws SQLException;
    String updateComment(Comment ñomment, int id_comment) throws SQLException;
    String deleteComment(int id_comment) throws SQLException;
    
    String insertFotoAndVideo(FotoAndVideo fotoAndVideo) throws SQLException;
    ArrayList<FotoAndVideo> findAllFotoAndVideo() throws SQLException;
    String updateFotoAndVideo(FotoAndVideo fotoAndVideo, int id_foto_or_video) throws SQLException;
    String deleteFotoAndVideo(int id_foto_or_video) throws SQLException;
    
    String insertMediaType(MediaType mediaType) throws SQLException;
    ArrayList<MediaType> findAllMediaType() throws SQLException;
    String updateMediaType(MediaType mediaType, int id_media_type) throws SQLException;
    String deleteMediaType(int id_media_type) throws SQLException;
    
    String insertPost(Post post) throws SQLException;
    ArrayList<Post> findAllPost() throws SQLException;
    String updatePost(Post post, int idPost) throws SQLException;
    String deletePost(int idPost) throws SQLException;
    
    String insertPreference(Preference preference) throws SQLException;
    ArrayList<Preference> findAllPreference() throws SQLException;
    String updatePreference(Preference preference, int id_user, int id_post) throws SQLException;
    String deletePreference(int id_user, int id_post) throws SQLException;
    
    String insertPreferenceComment(PreferenceComment preferenceComment) throws SQLException;
    ArrayList<PreferenceComment> findAllPreferenceComment() throws SQLException;
    String updatePreferenceComment(PreferenceComment preferenceComment, int id_comment) throws SQLException;
    String deletePreferenceComment(int id_comment) throws SQLException;
    
    String insertTag(Tag tag) throws SQLException;
    ArrayList<Tag> findAllTag() throws SQLException;
    String updateTag(Tag tag, int id_user, int id_post) throws SQLException;
    String deleteTag(int id_user, int id_post) throws SQLException;
    
    String insertTypePost(TypePost typePost) throws SQLException;
    ArrayList<TypePost> findAllTypePost() throws SQLException;
    String updateTypePost(TypePost typePost, int id_type_post) throws SQLException;
    String deleteTypePost(int id_type_post) throws SQLException;
    
    String insertUser(User user) throws SQLException;
    ArrayList<User> findAllUser() throws SQLException;
    String updateUser(User user, int id_user) throws SQLException;
    String deleteUser(int id_user) throws SQLException;
    
    String insertUserLog(UserLog userLog) throws SQLException;
    ArrayList<UserLog> findAllUserLog() throws SQLException;
    String updateUserLog(UserLog userLog, int user_id) throws SQLException;
    String deleteUserLog(int user_id) throws SQLException;
    
    String insertUserSecurity(UserSecurity userSecurity) throws SQLException;
    ArrayList<UserSecurity> findAllUserSecurity() throws SQLException;
    String updateUserSecurity(UserSecurity userSecurity, int user_id) throws SQLException;
    String deleteUserSecurity(int user_id) throws SQLException;
}

