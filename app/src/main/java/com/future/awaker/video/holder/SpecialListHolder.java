package com.future.awaker.video.holder;

import android.support.v7.widget.RecyclerView;

import com.future.awaker.data.New;
import com.future.awaker.databinding.ItemSpecialListBinding;

/**
 * Created by ruzhan on 2017/7/15.
 */

public class SpecialListHolder extends RecyclerView.ViewHolder {

    private ItemSpecialListBinding binding;

    public SpecialListHolder(ItemSpecialListBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(New bean) {
        binding.setNewItem(bean);
        binding.executePendingBindings();
    }
}
