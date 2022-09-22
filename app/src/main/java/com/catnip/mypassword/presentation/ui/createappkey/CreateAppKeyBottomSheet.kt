package com.catnip.mypassword.presentation.ui.createappkey

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.catnip.mypassword.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class CreateAppKeyBottomSheet : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_app_key_bottom_sheet, container, false)
    }

}