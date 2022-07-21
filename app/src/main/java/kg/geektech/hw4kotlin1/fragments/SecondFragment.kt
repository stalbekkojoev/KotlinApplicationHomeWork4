package kg.geektech.hw4kotlin1.fragments

import android.view.LayoutInflater
import androidx.fragment.app.activityViewModels
import kg.geektech.hw4kotlin1.base.BaseFragment
import kg.geektech.hw4kotlin1.databinding.FragmentSecondBinding
import kg.geektech.hw4kotlin1.view_model.MainViewModel

class SecondFragment : BaseFragment<FragmentSecondBinding>() {
    private val viewModel: MainViewModel by activityViewModels()

    override fun inflateVB(inflater: LayoutInflater): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(inflater)
    }

    override fun initView() {
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCounterSecond.text = it.toString()
        }
    }

    override fun initListener() {
    }
}