package com.example.passwordmanager

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.passwordmanager.databinding.ActivityMainBinding
import com.example.passwordmanager.viewModel.myViewModel


class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

//    private lateinit var adapter: CustomAdapter
//    private lateinit var listView: ListView
//    private lateinit var passwordData:List<dataClass>
    private lateinit var rv:RecyclerView
    private  lateinit var  viewModel : myViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        viewModel = myViewModel()



        viewModel.passwordManager.observe(this){
           val  adapter = CustomAdapter(  it)
            rv = binding.rvdata
            rv.adapter = adapter
        }




        binding.addPass.setOnClickListener{

                    val bottomSheet = BottomSheetDialog()
                    bottomSheet.show(
                        supportFragmentManager,
                        "ModalBottomSheet"
                    )
                }





    }
}



