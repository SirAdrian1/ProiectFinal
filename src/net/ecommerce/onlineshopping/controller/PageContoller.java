package net.ecommerce.onlineshopping.controller;


@Controller
class PageController {

    @Autowired
    private ICategoryService categoryService;

    public PageController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = {"/", "/home", "/index"})
    public ModelAndView Home() {
        System.out.println("home");
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("title", "Home");
        return modelAndView;
    }

    public ModelAndView about() {
        System.out.println("about");
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("title", "About Us");
        return modelAndView;
    }

    @RequestMapping(value = {"/contact"})
    public ModelAndView contact() {
        System.out.println("contact");
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("title", "Home");
        return modelAndView;
    }


    @RequestMapping(value = {"/show/all/products"})
    public ModelAndView showAllProduct() {
        System.out.println("showAllProduct");
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("userClickAllProducts", true);
        return modelAndView;
    }

    @RequestMapping(value = {"/show/category/{id}/products"})
    public ModelAndView showCategoryProduct() {
        System.out.println("showCategoryProduct");
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("categoryList", "Home");
        modelAndView.addObject("userClickCategoryProduct", true);
        return modelAndView;
    }

    private class ICategoryService {
        public void categoryList() {
        }
    }

    private class ModelAndView {
        public ModelAndView(String page) {

        }

        public void addObject(String title, boolean home) {

        }

        public void addObject(String categoryList, String home) {
        }
    }
}