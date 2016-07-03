package pl.surecase.eu;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyDaoGenerator {

    public static void main(String args[]) throws Exception {
        Schema schema = new Schema(3, "Dao");
        Entity box = schema.addEntity("Locations");
        box.addIdProperty();
        box.addStringProperty("lid");
        box.addStringProperty("name");

//        Entity mobile =schema.addEntity("Mobile");
//        mobile.addIdProperty();
//        mobile.addStringProperty("name");
//        mobile.addStringProperty("price");
//        mobile.addStringProperty("description");

        Entity category = schema.addEntity("Categories");
        category.addIdProperty();
        category.addStringProperty("c_id");
        category.addStringProperty("main_category_id");
        category.addStringProperty("name");
        category.addStringProperty("cashback");
        category.addStringProperty("points");

        Entity product = schema.addEntity("ProductDetailTable");
        product.addIdProperty();
        product.addStringProperty("p_id");
        product.addStringProperty("pname");
        product.addStringProperty("p_category_id");
        product.addStringProperty("p_specification");
        product.addFloatProperty("p_price");
        product.addFloatProperty("p_selling_price");
        product.addFloatProperty("p_maxqty");
        product.addFloatProperty("p_minqty");
        product.addStringProperty("p_image");
        product.addStringProperty("p_location_id");
        product.addStringProperty("p_act");
        product.addStringProperty("p_product_code");
        product.addFloatProperty("p_buying_price");


        new DaoGenerator().generateAll(schema, args[0]);
    }


}
