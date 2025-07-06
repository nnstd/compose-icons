package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronDoubleRight: ImageVector
    get() {
        if (_ChevronDoubleRight != null) {
            return _ChevronDoubleRight!!
        }
        _ChevronDoubleRight = ImageVector.Builder(
            name = "ChevronDoubleRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.59f, 7.41f)
                lineTo(7f, 6f)
                lineTo(13f, 12f)
                lineTo(7f, 18f)
                lineTo(5.59f, 16.59f)
                lineTo(10.17f, 12f)
                lineTo(5.59f, 7.41f)
                moveTo(11.59f, 7.41f)
                lineTo(13f, 6f)
                lineTo(19f, 12f)
                lineTo(13f, 18f)
                lineTo(11.59f, 16.59f)
                lineTo(16.17f, 12f)
                lineTo(11.59f, 7.41f)
                close()
            }
        }.build()

        return _ChevronDoubleRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDoubleRight: ImageVector? = null
