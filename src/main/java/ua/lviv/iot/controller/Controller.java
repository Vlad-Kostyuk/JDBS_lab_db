package ua.lviv.iot.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import ua.lviv.iot.DAO.RequestBlackList;
import ua.lviv.iot.DAO.RequestComment;
import ua.lviv.iot.DAO.RequestFotoAndVideo;
import ua.lviv.iot.DAO.RequestMediaType;
import ua.lviv.iot.DAO.RequestPost;
import ua.lviv.iot.DAO.RequestPreference;
import ua.lviv.iot.DAO.RequestPreferenceComment;
import ua.lviv.iot.DAO.RequestTag;
import ua.lviv.iot.DAO.RequestTypePost;
import ua.lviv.iot.DAO.RequestUser;
import ua.lviv.iot.DAO.RequestUserLog;
import ua.lviv.iot.DAO.RequestUserSecurity;
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


public class Controller implements IController {
    
	public Controller() {

	}

	@Override
	public String insertBlackList(BlackList blackList) throws SQLException {
		return RequestBlackList.insert(blackList);
	}
	
	@Override
	public ArrayList<BlackList> findAllBlackList() throws SQLException {
		return RequestBlackList.findAll();	
	}

	@Override
	public String updateBlackList(BlackList blackList, int user_id, int locking_user_id) throws SQLException {
		return RequestBlackList.update(blackList, user_id, locking_user_id);
		
	}

	@Override
	public String deleteBlackList(int user_id, int locking_user_id) throws SQLException {
		return RequestBlackList.delete(user_id, locking_user_id);
		
	}

	@Override
	public String insertComment(Comment ñomment) throws SQLException {
		return RequestComment.insert(ñomment);
		
	}

	@Override
	public ArrayList<Comment> findAllComment() throws SQLException {
        return RequestComment.findAll();
	}

	@Override
	public String updateComment(Comment ñomment, int id_comment) throws SQLException {
		return RequestComment.update(ñomment, id_comment);
		
	}

	@Override
	public String deleteComment(int id_comment) throws SQLException {
		return RequestComment.delete(id_comment);	
	}

	@Override
	public String insertFotoAndVideo(FotoAndVideo fotoAndVideo) throws SQLException {
		return RequestFotoAndVideo.insert(fotoAndVideo);
	}

	@Override
	public ArrayList<FotoAndVideo> findAllFotoAndVideo() throws SQLException {
		return RequestFotoAndVideo.findAll();
	}

	@Override
	public String updateFotoAndVideo(FotoAndVideo fotoAndVideo, int id_foto_or_video) throws SQLException {
		return RequestFotoAndVideo.update(fotoAndVideo, id_foto_or_video);	
	}

	@Override
	public String deleteFotoAndVideo(int id_foto_or_video) throws SQLException {
		return RequestFotoAndVideo.delete(id_foto_or_video);
	}

	@Override
	public String insertMediaType(MediaType mediaType) throws SQLException {
	    return RequestMediaType.insert(mediaType);	
	}

	@Override
	public ArrayList<MediaType> findAllMediaType() throws SQLException {
		return RequestMediaType.findAll();
	}

	@Override
	public String updateMediaType(MediaType mediaType, int id_media_type) throws SQLException {
		return RequestMediaType.update(mediaType, id_media_type);
	}

	@Override
	public String deleteMediaType(int id_media_type) throws SQLException {
		return RequestMediaType.delete(id_media_type);
	}

	@Override
	public String insertPost(Post post) throws SQLException {
		return RequestPost.insert(post);
	}

	@Override
	public ArrayList<Post> findAllPost() throws SQLException {
		return RequestPost.findAll();	
	}

	@Override
	public String updatePost(Post post, int idPost) throws SQLException {
		return RequestPost.update(post, idPost);		
	}

	@Override
	public String deletePost(int idPost) throws SQLException {
		return RequestPost.delete(idPost);	
	}

	@Override
	public String insertPreference(Preference preference) throws SQLException {
		return RequestPreference.insert(preference);
	}

	@Override
	public ArrayList<Preference> findAllPreference() throws SQLException {
		return RequestPreference.findAll();
	}

	@Override
	public String updatePreference(Preference preference, int id_user, int id_post) throws SQLException {
		return RequestPreference.update(preference, id_user, id_post);
	}

	@Override
	public String deletePreference(int id_user, int id_post) throws SQLException {
		return RequestPreference.delete(id_user, id_post);	
	}

	@Override
	public String insertPreferenceComment(PreferenceComment preferenceComment) throws SQLException {
	    return RequestPreferenceComment.insert(preferenceComment);
	}

	@Override
	public ArrayList<PreferenceComment> findAllPreferenceComment() throws SQLException {
		return RequestPreferenceComment.findAll();
	}

	@Override
	public String updatePreferenceComment(PreferenceComment preferenceComment, int id_comment) throws SQLException {
		return RequestPreferenceComment.update(preferenceComment, id_comment);
	}

	@Override
	public String deletePreferenceComment(int id_comment) throws SQLException {
		return RequestPreferenceComment.delete(id_comment);
	}

	@Override
	public String insertTag(Tag tag) throws SQLException {
	    return RequestTag.insert(tag);
	}

	@Override
	public ArrayList<Tag> findAllTag() throws SQLException {
		return RequestTag.findAll();
	}

	@Override
	public String updateTag(Tag tag, int id_user, int id_post) throws SQLException {
		return RequestTag.update(tag, id_user, id_post);
	}

	@Override
	public String deleteTag(int id_user, int id_post) throws SQLException {
		return RequestTag.delete(id_user, id_post);
	}

	@Override
	public String insertTypePost(TypePost typePost) throws SQLException {
		return RequestTypePost.insert(typePost);
	}

	@Override
	public ArrayList<TypePost> findAllTypePost() throws SQLException {
		return RequestTypePost.findAll();
	}

	@Override
	public String updateTypePost(TypePost typePost, int id_type_post) throws SQLException {
		return RequestTypePost.update(typePost, id_type_post);
	}

	@Override
	public String deleteTypePost(int id_type_post) throws SQLException {
		return RequestTypePost.delete(id_type_post);
	}

	@Override
	public String insertUser(User user) throws SQLException {
		return RequestUser.insert(user);
	}

	@Override
	public ArrayList<User> findAllUser() throws SQLException {
		return RequestUser.findAll();
	}

	@Override
	public String updateUser(User user, int id_user) throws SQLException {
		return RequestUser.update(user, id_user);
	}

	@Override
	public String deleteUser(int id_user) throws SQLException {
		return RequestUser.delete(id_user);
	}

	@Override
	public String insertUserLog(UserLog userLog) throws SQLException {
		return RequestUserLog.insert(userLog);
	}

	@Override
	public ArrayList<UserLog> findAllUserLog() throws SQLException {
		return RequestUserLog.findAll();
	}

	@Override
	public String updateUserLog(UserLog userLog, int user_id) throws SQLException {
		return RequestUserLog.update(userLog, user_id);
	}

	@Override
	public String deleteUserLog(int user_id) throws SQLException {
		return RequestUserLog.delete(user_id);
	}

	@Override
	public String insertUserSecurity(UserSecurity userSecurity) throws SQLException {
		return RequestUserSecurity.insert(userSecurity);
	}

	@Override
	public ArrayList<UserSecurity> findAllUserSecurity() throws SQLException {
		return RequestUserSecurity.findAll();
	}

	@Override
	public String updateUserSecurity(UserSecurity userSecurity, int user_id) throws SQLException {
		return RequestUserSecurity.update(userSecurity, user_id);
	}

	@Override
	public String deleteUserSecurity(int user_id) throws SQLException {
		return RequestUserSecurity.delete(user_id);
	}
}
	