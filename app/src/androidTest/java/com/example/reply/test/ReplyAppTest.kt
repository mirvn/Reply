package com.example.reply.test

import androidx.activity.ComponentActivity
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.test.* // ktlint-disable no-wildcard-imports
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.reply.R
import com.example.reply.ui.ReplyApp
import org.junit.Rule
import org.junit.Test

class ReplyAppTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    fun showApp(windowWidthSizeClass: WindowWidthSizeClass) {
        createComposeRule().setContent {
            ReplyApp(windowSize = windowWidthSizeClass)
        }
    }

    // test on compact device
    @Test
    fun compactDevice_verifyUsingBottomNavigation() {
        // Set up compact window
        composeTestRule.setContent {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Compact
            )
        }
        // Bottom navigation is displayed
        val tag = composeTestRule.activity.getString(R.string.navigation_bottom)
        composeTestRule.onAllNodesWithTag(tag).assertAll(hasTestTag(tag))
    }
}
