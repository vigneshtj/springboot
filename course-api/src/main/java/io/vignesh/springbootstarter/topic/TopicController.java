package io.vignesh.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Create rest service
@RestController
public class TopicController{
/*
 * @RequestMapping is default to Get method. 
 * For other methods, specify in annotation	
 */
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("java","java book","desc1"),
				new Topic("spring","spring book","desc2"),
				new Topic("spring boot","spring boot book","desc3")
				);
	}

}
