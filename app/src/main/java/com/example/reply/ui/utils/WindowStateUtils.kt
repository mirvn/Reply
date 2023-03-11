package com.example.reply.ui.utils

enum class ReplyNavigationType {
    BOTTOM_NAVIGATION, // FOR COMPACT WIDTH SCREEN
    NAVIGATION_RAIL, // FOR MEDIUM WIDTH SCREEN
    PERMANENT_NAVIGATION_DRAWER // FOR EXPANDED WIDTH SCREEN
}

enum class ReplyContentType {
    LIST_ONLY,
    LIST_AND_DETAIL
}