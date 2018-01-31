package chat.rocket.android.chatrooms.presentation

import chat.rocket.android.core.behaviours.LoadingView
import chat.rocket.android.core.behaviours.MessageView
import chat.rocket.core.model.ChatRoom

interface ChatRoomsView : LoadingView, MessageView {

    /**
     * Shows the chat rooms.
     *
     * @param dataSet The data set to show.
     */
    suspend fun updateChatRooms(newDataSet: List<ChatRoom>)

    /**
     * User has successfully logged out from the current server.
     */
    fun onLogout()
}