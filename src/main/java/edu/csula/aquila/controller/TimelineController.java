package edu.csula.aquila.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.csula.aquila.daos.TimelineDao;
import edu.csula.aquila.model.ApprovalForm;
import edu.csula.aquila.model.EquipmentForm;
import edu.csula.aquila.model.Form;
import edu.csula.aquila.model.IntakeForm;
import edu.csula.aquila.model.Timeline;

@RestController
public class TimelineController {

	@Autowired
	private TimelineDao timelineDao;
	

	//create a new timeline
	@RequestMapping(value = "timeline", method = RequestMethod.POST)
	public Timeline newTimeline(@RequestBody Timeline timeline) {
		return timelineDao.saveTimelineForm(timeline);
	}
	
	//update a timeline
	@RequestMapping(value = "timeline/{id}", method = RequestMethod.PUT)
	public Timeline updateTimeline(@RequestBody Timeline timeline) {
		//get a list of stages
		List<Timeline.Stage> stages = timeline.getStages();
		//make a list of required forms
		List<String> requiredForms;
		
		for(int i = 0; i < stages.size(); i++) {
			//create a new list of forms
			List<Form> forms = new ArrayList<Form>();
			//grab the required forms string from a stage
			requiredForms = stages.get(i).getRequiredForms();
			
			//if a form contains the name of a model form, add it to the form list
			for(int j = 0; j < requiredForms.size(); j++) {
				if(requiredForms.get(j).equals("Intake Form")) {
					forms.add(new IntakeForm());
				}
				if(requiredForms.get(j).equals("Equipment Form")) {
					forms.add(new EquipmentForm());
				}
				if(requiredForms.get(j).equals("Approval Form")) {
					forms.add(new ApprovalForm());
				}
			}
			//set the list of forms for the stage
			stages.get(i).setForms(forms);
		}
		
		//update timeline
		timeline.setStages(stages);
		
		//save timeline to db
		return timelineDao.saveTimelineForm(timeline);
	}
	
	//return a timeline
	@RequestMapping(value = "timeline/{id}", method = RequestMethod.GET)
	public Timeline getTimeline(@PathVariable Long id) {
		return timelineDao.getTimelineForm(id);
	}
	
}
