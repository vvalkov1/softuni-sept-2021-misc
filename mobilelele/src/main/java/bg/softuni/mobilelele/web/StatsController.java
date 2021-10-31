package bg.softuni.mobilelele.web;

import bg.softuni.mobilelele.service.StatsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StatsController {

  private final StatsService statsService;

  public StatsController(StatsService statsService) {
    this.statsService = statsService;
  }

  @GetMapping("/stats")
  public ModelAndView getStats(ModelAndView modelAndView) {
     modelAndView.setViewName("stats");
     modelAndView.addObject("stats", statsService.getStats());
     return modelAndView;
  }

}
