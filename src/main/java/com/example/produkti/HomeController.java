package com.example.produkti;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HomeController {

    private final JdbcTemplate jdbcTemplate;

    public HomeController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/getVeikali")
    public List<String> getTuples() {
        return this.jdbcTemplate.queryForList("SELECT * FROM veikali").stream()
                .map((m) -> m.values().toString())
                .collect(Collectors.toList());
    }

    @RequestMapping("/")
    public ModelAndView home () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @RequestMapping("/veikali")
    public ModelAndView veikali () {
        ModelAndView modelAndView = new ModelAndView();
        List<Veikals> veikali = this.jdbcTemplate.query("SELECT * FROM veikali", new VeikaluMapper());

        modelAndView.addObject("veikaluSaraksts", veikali);
        modelAndView.setViewName("veikali");
        return modelAndView;
    }

    @RequestMapping("/produkti")
    public ModelAndView produkti (@RequestParam("kategorija") String kategorija) {

        String query = "SELECT * FROM produkti WHERE kategorija = ?";
        ModelAndView modelAndView = new ModelAndView();
        List<Produkts> produkti = this.jdbcTemplate.query(query, new Object[]{kategorija}, new ProduktuMapper());

        modelAndView.addObject("produkti", produkti);
        modelAndView.setViewName("produkti");
        return modelAndView;
    }
    @RequestMapping("/akcijas")
    public ModelAndView akcijas () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("akcijas");
        return modelAndView;
    }
    @RequestMapping("/parmums")
    public ModelAndView parmums () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("parmums");
        return modelAndView;
    }
}
