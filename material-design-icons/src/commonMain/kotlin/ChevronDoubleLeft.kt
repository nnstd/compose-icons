package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronDoubleLeft: ImageVector
    get() {
        if (_ChevronDoubleLeft != null) {
            return _ChevronDoubleLeft!!
        }
        _ChevronDoubleLeft = ImageVector.Builder(
            name = "ChevronDoubleLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.41f, 7.41f)
                lineTo(17f, 6f)
                lineTo(11f, 12f)
                lineTo(17f, 18f)
                lineTo(18.41f, 16.59f)
                lineTo(13.83f, 12f)
                lineTo(18.41f, 7.41f)
                moveTo(12.41f, 7.41f)
                lineTo(11f, 6f)
                lineTo(5f, 12f)
                lineTo(11f, 18f)
                lineTo(12.41f, 16.59f)
                lineTo(7.83f, 12f)
                lineTo(12.41f, 7.41f)
                close()
            }
        }.build()

        return _ChevronDoubleLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDoubleLeft: ImageVector? = null
