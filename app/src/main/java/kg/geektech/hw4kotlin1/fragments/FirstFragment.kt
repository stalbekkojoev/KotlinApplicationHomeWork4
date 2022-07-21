package kg.geektech.hw4kotlin1.fragments

import android.view.LayoutInflater
import androidx.fragment.app.activityViewModels
import kg.geektech.hw4kotlin1.base.BaseFragment
import kg.geektech.hw4kotlin1.databinding.FragmentFirstBinding
import kg.geektech.hw4kotlin1.view_model.MainViewModel

class FirstFragment : BaseFragment<FragmentFirstBinding>() {
    private val viewModel: MainViewModel by activityViewModels()
    override fun inflateVB(inflater: LayoutInflater): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(inflater)
    }

    override fun initView() {
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCounter.text = it.toString()
        }
    }

    override fun initListener() {
        binding.btnCounterPlus.setOnClickListener {
            viewModel.onIncrementClick()
        }
        binding.btnCounterMinus.setOnClickListener {
            viewModel.onDecrementClick()
        }
    }
}