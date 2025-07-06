package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BlindsVerticalClosed: ImageVector
    get() {
        if (_BlindsVerticalClosed != null) {
            return _BlindsVerticalClosed!!
        }
        _BlindsVerticalClosed = ImageVector.Builder(
            name = "BlindsVerticalClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                moveTo(13f, 5f)
                horizontalLineTo(14.5f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                moveTo(11f, 19f)
                horizontalLineTo(9.5f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                moveTo(6f, 5f)
                horizontalLineTo(7.5f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                moveTo(16.5f, 19f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(16.5f)
                close()
            }
        }.build()

        return _BlindsVerticalClosed!!
    }

@Suppress("ObjectPropertyName")
private var _BlindsVerticalClosed: ImageVector? = null
