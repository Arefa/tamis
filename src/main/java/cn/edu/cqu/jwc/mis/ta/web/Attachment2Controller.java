package cn.edu.cqu.jwc.mis.ta.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.cqu.jwc.mis.ta.model.Attachment2;
import cn.edu.cqu.jwc.mis.ta.service.AssistantService;


@Controller
@SessionAttributes(types = Attachment2.class)
public class Attachment2Controller {

	private final AssistantService assistantService;
	
	@Autowired
	public Attachment2Controller(AssistantService assistantService) {
		this.assistantService = assistantService;
	}
	
	@InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }
	
	@RequestMapping(value = "/a2s")
	public String processFindForm(Attachment2 attachment2, BindingResult result, Map<String, Object> model) {

        List<Attachment2> results = this.assistantService.findAttachment2s();
        model.put("selections", results);
        return "a2s/a2sList";
    }
	
	@RequestMapping(value = "/a2s/{id}")
	public ModelAndView showA2(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView("a2s/a2Details");
		mav.addObject(this.assistantService.findA2ById(id));
		return mav;
	}
}
