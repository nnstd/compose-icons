package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarOff: ImageVector
    get() {
        if (_StarOff != null) {
            return _StarOff!!
        }
        _StarOff = ImageVector.Builder(
            name = "StarOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(17.9f, 19.8f)
                lineTo(18.2f, 21f)
                lineTo(12f, 17.3f)
                lineTo(5.8f, 21f)
                lineTo(7.4f, 14f)
                lineTo(2f, 9.2f)
                lineTo(6.9f, 8.8f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(22f, 9.2f)
                lineTo(14.8f, 8.6f)
                lineTo(12f, 2f)
                lineTo(10f, 6.8f)
                lineTo(16.9f, 13.7f)
                lineTo(22f, 9.2f)
                close()
            }
        }.build()

        return _StarOff!!
    }

@Suppress("ObjectPropertyName")
private var _StarOff: ImageVector? = null
