package com.socialmediaApplication.Model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.socialmediaApplication.Model.Follow;


public interface followRepository extends JpaRepository<Follow, Integer>{
	
	@Query(value = "SELECT * FROM follow WHERE user_id IN (SELECT all_followers_user_id FROM follow_all_followers WHERE follow_user_id = :userId)", nativeQuery = true)
	List<Follow> getAllFollowersInUser(@Param("userId") int userId);
	
	
    @Query(value = "SELECT * FROM follow WHERE user_id IN (SELECT all_followings_user_id FROM follow_all_followings WHERE follow_user_id = :userId)",nativeQuery = true)
	public List<Follow> getAllFollowingInUser(int userId);

}