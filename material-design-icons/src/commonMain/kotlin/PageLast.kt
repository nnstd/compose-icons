package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PageLast: ImageVector
    get() {
        if (_PageLast != null) {
            return _PageLast!!
        }
        _PageLast = ImageVector.Builder(
            name = "PageLast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.59f, 7.41f)
                lineTo(10.18f, 12f)
                lineTo(5.59f, 16.59f)
                lineTo(7f, 18f)
                lineTo(13f, 12f)
                lineTo(7f, 6f)
                lineTo(5.59f, 7.41f)
                moveTo(16f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _PageLast!!
    }

@Suppress("ObjectPropertyName")
private var _PageLast: ImageVector? = null
