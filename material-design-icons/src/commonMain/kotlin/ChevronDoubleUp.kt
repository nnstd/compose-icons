package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronDoubleUp: ImageVector
    get() {
        if (_ChevronDoubleUp != null) {
            return _ChevronDoubleUp!!
        }
        _ChevronDoubleUp = ImageVector.Builder(
            name = "ChevronDoubleUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.41f, 18.41f)
                lineTo(6f, 17f)
                lineTo(12f, 11f)
                lineTo(18f, 17f)
                lineTo(16.59f, 18.41f)
                lineTo(12f, 13.83f)
                lineTo(7.41f, 18.41f)
                moveTo(7.41f, 12.41f)
                lineTo(6f, 11f)
                lineTo(12f, 5f)
                lineTo(18f, 11f)
                lineTo(16.59f, 12.41f)
                lineTo(12f, 7.83f)
                lineTo(7.41f, 12.41f)
                close()
            }
        }.build()

        return _ChevronDoubleUp!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDoubleUp: ImageVector? = null
