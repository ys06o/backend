package 회원제중고거래시스템연습.Controller;


import 회원제중고거래시스템연습.Model.Dao.ProductDao;

public class ProductController {
    private ProductController(){}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance(){ return instance; }

    private ProductDao pd = ProductDao.getInstance();

    // [1] 제품등록
    public boolean add( String pname , int pprice ,String pcomment){
        boolean result = true;
        return result;
    }
}