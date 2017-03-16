package ${PACKAGE_NAME};

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

#parse("File Header.java")
public class ${NAME} extends RecyclerView.Adapter<${NAME}.ViewHolder> {

    List<${ItemsType}> itemsList;
    public ${NAME}() {
       itemsList = new ArrayList();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindToItem(position);
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return itemsList.size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ViewDataBinding binding;

        public ViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);

            if (getAdapterPosition() != NO_POSITION) {
                    }
        }

        void bindToItem(int position) {
          
        }
    }