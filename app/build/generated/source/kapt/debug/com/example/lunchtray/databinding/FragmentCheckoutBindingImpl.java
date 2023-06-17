package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_summary, 12);
        sViewsWithIds.put(R.id.divider, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.Button) bindings[11]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            );
        this.accompanimentPrice.setTag(null);
        this.accompanimentSelection.setTag(null);
        this.cancelButton.setTag(null);
        this.entreePrice.setTag(null);
        this.entreeSelection.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.sidePrice.setTag(null);
        this.sideSelection.setTag(null);
        this.submitButton.setTag(null);
        this.subtotal.setTag(null);
        this.tax.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.checkOutFragment == variableId) {
            setCheckOutFragment((com.example.lunchtray.ui.order.CheckoutFragment) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckOutFragment(@Nullable com.example.lunchtray.ui.order.CheckoutFragment CheckOutFragment) {
        this.mCheckOutFragment = CheckOutFragment;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.checkOutFragment);
        super.requestRebind();
    }
    public void setViewmodel(@Nullable com.example.lunchtray.model.OrderViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelTax((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelTotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelEntree((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 3 :
                return onChangeViewmodelSide((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 4 :
                return onChangeViewmodelAccompaniment((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 5 :
                return onChangeViewmodelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelTax(androidx.lifecycle.LiveData<java.lang.String> ViewmodelTax, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelTotal(androidx.lifecycle.LiveData<java.lang.String> ViewmodelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelEntree(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> ViewmodelEntree, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelSide(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> ViewmodelSide, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAccompaniment(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> ViewmodelAccompaniment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelSubtotal(androidx.lifecycle.LiveData<java.lang.String> ViewmodelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.String> viewmodelTax = null;
        com.example.lunchtray.ui.order.CheckoutFragment checkOutFragment = mCheckOutFragment;
        androidx.lifecycle.LiveData<java.lang.String> viewmodelTotal = null;
        java.lang.String viewmodelSideFormattedPrice = null;
        com.example.lunchtray.model.MenuItem viewmodelSideGetValue = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> viewmodelEntree = null;
        java.lang.String viewmodelSideName = null;
        java.lang.String viewmodelEntreeFormattedPrice = null;
        java.lang.String viewmodelSubtotalGetValue = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> viewmodelSide = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> viewmodelAccompaniment = null;
        androidx.lifecycle.LiveData<java.lang.String> viewmodelSubtotal = null;
        java.lang.String viewmodelTaxGetValue = null;
        java.lang.String viewmodelTotalGetValue = null;
        com.example.lunchtray.model.MenuItem viewmodelEntreeGetValue = null;
        java.lang.String viewmodelAccompanimentFormattedPrice = null;
        java.lang.String viewmodelAccompanimentName = null;
        java.lang.String viewmodelEntreeName = null;
        com.example.lunchtray.model.MenuItem viewmodelAccompanimentGetValue = null;
        com.example.lunchtray.model.OrderViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x1bfL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.tax
                        viewmodelTax = viewmodel.getTax();
                    }
                    updateLiveDataRegistration(0, viewmodelTax);


                    if (viewmodelTax != null) {
                        // read viewmodel.tax.getValue()
                        viewmodelTaxGetValue = viewmodelTax.getValue();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.total
                        viewmodelTotal = viewmodel.getTotal();
                    }
                    updateLiveDataRegistration(1, viewmodelTotal);


                    if (viewmodelTotal != null) {
                        // read viewmodel.total.getValue()
                        viewmodelTotalGetValue = viewmodelTotal.getValue();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.entree
                        viewmodelEntree = viewmodel.getEntree();
                    }
                    updateLiveDataRegistration(2, viewmodelEntree);


                    if (viewmodelEntree != null) {
                        // read viewmodel.entree.getValue()
                        viewmodelEntreeGetValue = viewmodelEntree.getValue();
                    }


                    if (viewmodelEntreeGetValue != null) {
                        // read viewmodel.entree.getValue().formattedPrice
                        viewmodelEntreeFormattedPrice = viewmodelEntreeGetValue.getFormattedPrice();
                        // read viewmodel.entree.getValue().name
                        viewmodelEntreeName = viewmodelEntreeGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.side
                        viewmodelSide = viewmodel.getSide();
                    }
                    updateLiveDataRegistration(3, viewmodelSide);


                    if (viewmodelSide != null) {
                        // read viewmodel.side.getValue()
                        viewmodelSideGetValue = viewmodelSide.getValue();
                    }


                    if (viewmodelSideGetValue != null) {
                        // read viewmodel.side.getValue().formattedPrice
                        viewmodelSideFormattedPrice = viewmodelSideGetValue.getFormattedPrice();
                        // read viewmodel.side.getValue().name
                        viewmodelSideName = viewmodelSideGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.accompaniment
                        viewmodelAccompaniment = viewmodel.getAccompaniment();
                    }
                    updateLiveDataRegistration(4, viewmodelAccompaniment);


                    if (viewmodelAccompaniment != null) {
                        // read viewmodel.accompaniment.getValue()
                        viewmodelAccompanimentGetValue = viewmodelAccompaniment.getValue();
                    }


                    if (viewmodelAccompanimentGetValue != null) {
                        // read viewmodel.accompaniment.getValue().formattedPrice
                        viewmodelAccompanimentFormattedPrice = viewmodelAccompanimentGetValue.getFormattedPrice();
                        // read viewmodel.accompaniment.getValue().name
                        viewmodelAccompanimentName = viewmodelAccompanimentGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.subtotal
                        viewmodelSubtotal = viewmodel.getSubtotal();
                    }
                    updateLiveDataRegistration(5, viewmodelSubtotal);


                    if (viewmodelSubtotal != null) {
                        // read viewmodel.subtotal.getValue()
                        viewmodelSubtotalGetValue = viewmodelSubtotal.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accompanimentPrice, viewmodelAccompanimentFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accompanimentSelection, viewmodelAccompanimentName);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback7);
            this.submitButton.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreePrice, viewmodelEntreeFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreeSelection, viewmodelEntreeName);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sidePrice, viewmodelSideFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sideSelection, viewmodelSideName);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, viewmodelSubtotalGetValue);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tax, viewmodelTaxGetValue);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, viewmodelTotalGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // checkOutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkOutFragment = mCheckOutFragment;
                // checkOutFragment != null
                boolean checkOutFragmentJavaLangObjectNull = false;



                checkOutFragmentJavaLangObjectNull = (checkOutFragment) != (null);
                if (checkOutFragmentJavaLangObjectNull) {


                    checkOutFragment.submitOrder();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // checkOutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkOutFragment = mCheckOutFragment;
                // checkOutFragment != null
                boolean checkOutFragmentJavaLangObjectNull = false;



                checkOutFragmentJavaLangObjectNull = (checkOutFragment) != (null);
                if (checkOutFragmentJavaLangObjectNull) {


                    checkOutFragment.cancelOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.tax
        flag 1 (0x2L): viewmodel.total
        flag 2 (0x3L): viewmodel.entree
        flag 3 (0x4L): viewmodel.side
        flag 4 (0x5L): viewmodel.accompaniment
        flag 5 (0x6L): viewmodel.subtotal
        flag 6 (0x7L): checkOutFragment
        flag 7 (0x8L): viewmodel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}