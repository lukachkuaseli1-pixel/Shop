class MyCartActivity : AppCompatActivity() {

    private var price = 0
    private var quantity = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_cart)

        price = intent.getIntExtra("price", 0)

        val tvPrice = findViewById<TextView>(R.id.tvPrice)
        val tvQuantity = findViewById<TextView>(R.id.tvQuantity)
        val tvTotal = findViewById<TextView>(R.id.tvTotal)

        tvPrice.text = "$price$"
        tvTotal.text = "Total: ${price * quantity}$"

        findViewById<Button>(R.id.btnPlus).setOnClickListener {
            quantity++
            tvQuantity.text = quantity.toString()
            tvTotal.text = "Total: ${price * quantity}$"
        }

        findViewById<Button>(R.id.btnMinus).setOnClickListener {
            if (quantity > 1) {
                quantity--
                tvQuantity.text = quantity.toString()
                tvTotal.text = "Total: ${price * quantity}$"
            }
        }

        findViewById<Button>(R.id.btnPlaceOrder).setOnClickListener {
            startActivity(Intent(this, SuccessActivity::class.java))
        }

        findViewById<ImageButton>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
