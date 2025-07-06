package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SleepOff: ImageVector
    get() {
        if (_SleepOff != null) {
            return _SleepOff!!
        }
        _SleepOff = ImageVector.Builder(
            name = "SleepOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(12.73f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                lineTo(9.79f, 13.06f)
                lineTo(2f, 5.27f)
                moveTo(23f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                lineTo(20.39f, 6f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(23f)
                verticalLineTo(6f)
                lineTo(19.62f, 10f)
                horizontalLineTo(23f)
                verticalLineTo(12f)
                moveTo(9.82f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                lineTo(13.54f, 11.72f)
                lineTo(9.82f, 8f)
                moveTo(7f, 20f)
                horizontalLineTo(1f)
                verticalLineTo(18f)
                lineTo(4.39f, 14f)
                horizontalLineTo(1f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                lineTo(3.62f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _SleepOff!!
    }

@Suppress("ObjectPropertyName")
private var _SleepOff: ImageVector? = null
