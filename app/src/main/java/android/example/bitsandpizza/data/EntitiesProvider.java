package android.example.bitsandpizza.data;

import android.example.bitsandpizza.R;

public class EntitiesProvider {
    public static final BaseEntity[] pizzas = new BaseEntity[] {
            new BaseEntity("Pizza Carbonara", R.drawable.carbonara_pizza, "Ingredientes: Masa de pizza casera o refrigerada, Nata líquida para cocinar, 100 ml, Bacon, 200 g, Queso Mozzarella 1 bola, Champiñones laminados 4 Pimienta negra molida al gusto y Queso rallado para pizza (variado) 100 g"),
            new BaseEntity("Pizza Barbacoa", R.drawable.bbq_pizza, "Ingredientes: 250 gr de harina de fuerza, 15 gr de levadura fresca de panadería, 1 cucharadita de sal, 15 ml de aceite de oliva y 125 ml de agua templada, 200 gr de carne picada, 300gr de pechuga de pollo, 2 cebollas, salsa barbacoa y 5 lonchas de queso havarti o 70gr de mozarella")
    };

    public static final BaseEntity[] pastas = new BaseEntity[] {
            new BaseEntity("Espagueti a la Carbonara", R.drawable.carbonara_spaghetti, "Ingredientes: 250 g de espaguetis 100 g de tocino ahumado o bacon 50 g de queso parmesano 2 dientes de ajo 3 huevos 4 cucharadas de nata líquida Aceite y sal Pimienta blanca molida"),
            new BaseEntity("Pasta Boloñesa", R.drawable.pasta_bolognese, "Ingredientes: 400 gr de spaghetti. Una ración puede ir entre 80 y 120 gr por persona, según gustos y si es plato único o no en tu menú. 300 gr de carne picada (100 de magro de cerdo y 200 de babilla de ternera). La mejor carne picada es la que tú eliges en la carnicería y te la pican en el momento, olvídate de las que ya están envasadas. 1 zanahoria. 1 cebolla. 100 ml de vino blanco. 200 gr de salsa de tomate o tomate frito. Pero si te gusta con más proporción de salsa puedes incluso duplicar la cantidad de salsa de tomate. 50 ml de leche. Orégano. Unas hojas de albahaca para decorar. Aceite de oliva, sal y pimienta negra recién molida.")
    };

    public static final BaseEntity[] stores = new BaseEntity[] {
            new BaseEntity("Bits & Pizza California", R.drawable.store_1, "Comprueba nuestros exquisitos platos en el corazón de Los Ángeles.\n\nDirección: 641 N Highland Ave, Los Angeles, CA 90036, Estados Unidos"),
            new BaseEntity("Bits & Pizza San Francisco", R.drawable.store_2, "San Francisco, una ciudad de progreso, a la cual le damos un gusto especial.\n\nDirección: 570 Stockton St, San Francisco, CA 94133, Estados Unidos")
    };
}
