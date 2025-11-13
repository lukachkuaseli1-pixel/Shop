class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val btnAddToCart = findViewById<Button>(R.id.btnAddToCart)
        btnAddToCart.setOnClickListener {
            val intent = Intent(this, MyCartActivity::class.java)
            intent.putExtra("price", 120)
            startActivity(intent)
        }
    }
}
