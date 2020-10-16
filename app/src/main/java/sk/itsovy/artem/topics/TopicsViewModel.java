package sk.itsovy.artem.topics;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TopicsViewModel extends ViewModel { // contains what activity should remember
    private MutableLiveData<Topic> selectedTopic = new MutableLiveData<>();

    public LiveData<Topic> getSelectedTopic() { // one of the benefit of using the LiveData is that we able to observe that data
        return selectedTopic;
    }

    public void setSelectedTopic(Topic selectedTopic) {
        this.selectedTopic.postValue(selectedTopic);
    }
}
