package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LedStrip: ImageVector
    get() {
        if (_LedStrip != null) {
            return _LedStrip!!
        }
        _LedStrip = ImageVector.Builder(
            name = "LedStrip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.81f, 8.46f)
                lineTo(14.83f, 20.5f)
                lineTo(15.54f, 19.78f)
                lineTo(16.95f, 21.19f)
                lineTo(18.36f, 19.78f)
                lineTo(16.95f, 18.36f)
                lineTo(18.36f, 16.95f)
                lineTo(19.78f, 18.36f)
                lineTo(21.19f, 16.95f)
                lineTo(19.78f, 15.54f)
                lineTo(20.5f, 14.83f)
                lineTo(8.46f, 2.81f)
                lineTo(2.81f, 8.46f)
                moveTo(5.64f, 8.46f)
                lineTo(8.46f, 5.64f)
                lineTo(17.66f, 14.83f)
                lineTo(14.83f, 17.66f)
                lineTo(5.64f, 8.46f)
                moveTo(7.05f, 8.46f)
                lineTo(8.46f, 9.88f)
                lineTo(9.88f, 8.46f)
                lineTo(8.46f, 7.05f)
                lineTo(7.05f, 8.46f)
                moveTo(9.17f, 10.59f)
                lineTo(10.59f, 12f)
                lineTo(12f, 10.59f)
                lineTo(10.59f, 9.17f)
                lineTo(9.17f, 10.59f)
                moveTo(11.29f, 12.71f)
                lineTo(12.71f, 14.12f)
                lineTo(14.12f, 12.71f)
                lineTo(12.71f, 11.29f)
                lineTo(11.29f, 12.71f)
                moveTo(13.41f, 14.83f)
                lineTo(14.83f, 16.24f)
                lineTo(16.24f, 14.83f)
                lineTo(14.83f, 13.41f)
                lineTo(13.41f, 14.83f)
                close()
            }
        }.build()

        return _LedStrip!!
    }

@Suppress("ObjectPropertyName")
private var _LedStrip: ImageVector? = null
