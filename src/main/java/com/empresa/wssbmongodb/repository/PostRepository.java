package com.empresa.wssbmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.empresa.wssbmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
<<<<<<< HEAD
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
=======
>>>>>>> bda7931ed228055377fc377764685544c83cd874
}
