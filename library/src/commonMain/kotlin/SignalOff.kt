package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignalOff: ImageVector
    get() {
        if (_SignalOff != null) {
            return _SignalOff!!
        }
        _SignalOff = ImageVector.Builder(
            name = "SignalOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 3f)
                verticalLineTo(16.18f)
                lineTo(21f, 19.18f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                moveTo(4.28f, 5f)
                lineTo(3f, 6.27f)
                lineTo(10.73f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(14.27f)
                lineTo(13f, 16.27f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(19.27f)
                lineTo(19.73f, 23f)
                lineTo(21f, 21.72f)
                lineTo(4.28f, 5f)
                moveTo(13f, 9f)
                verticalLineTo(11.18f)
                lineTo(16f, 14.18f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(3f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _SignalOff!!
    }

@Suppress("ObjectPropertyName")
private var _SignalOff: ImageVector? = null
