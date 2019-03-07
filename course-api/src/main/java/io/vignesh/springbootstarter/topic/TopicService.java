package io.vignesh.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/*
 * business services are usually singleton class
 * in string, a business services can be created using @service annotation
 */


@Service
public class TopicService {
List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("java","java book","desc1"),
			new Topic("spring","spring book","desc2"),
			new Topic("spring boot","spring boot book","desc3")
			));

public List<Topic> getAllTopics() {
	return topics;
}

public Topic getTopic(String id) {
	Topic topic = topics.stream()
				.filter(t->t.getId().equals(id))
				.findFirst()
				.get();
	return topic;
}

public String addTopic(Topic t) {
		topics.add(t);
		return "success";
}

public String updateTopic(Topic t,String id) {
	for(int i=0;i<topics.size();i++) {
		Topic temp = topics.get(i);
		if(temp.getId().equals(id))
			topics.set(i,t);
	}
	return "success";
}

public String deleteTopic(String id) {
			topics.removeIf(t->t.getId().equals(id));
	return "success";
}
}
