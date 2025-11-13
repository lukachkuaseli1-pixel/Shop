class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        findViewById<Button>(R.id.btnStartShopping).setOnClickListener {
            startActivity(Intent(this, ProductActivity::class.java))
        }
    }
}
