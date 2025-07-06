package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerOff: ImageVector
    get() {
        if (_TimerOff != null) {
            return _TimerOff!!
        }
        _TimerOff = ImageVector.Builder(
            name = "TimerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                lineTo(1.75f, 5.27f)
                lineTo(4.5f, 8.03f)
                curveTo(3.55f, 9.45f, 3f, 11.16f, 3f, 13f)
                curveTo(3f, 17.97f, 7.03f, 22f, 12f, 22f)
                curveTo(13.84f, 22f, 15.55f, 21.45f, 17f, 20.5f)
                lineTo(19.5f, 23f)
                lineTo(20.75f, 21.73f)
                lineTo(13.04f, 14f)
                lineTo(3f, 4f)
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                moveTo(21f, 13f)
                curveTo(21f, 14.83f, 20.45f, 16.53f, 19.5f, 17.94f)
                lineTo(13f, 11.45f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(9.45f)
                lineTo(7.05f, 5.5f)
                curveTo(8.47f, 4.55f, 10.17f, 4f, 12f, 4f)
                curveTo(14.12f, 4f, 16.07f, 4.74f, 17.62f, 5.97f)
                lineTo(19.04f, 4.55f)
                lineTo(20.45f, 5.97f)
                lineTo(19.03f, 7.39f)
                curveTo(20.26f, 8.93f, 21f, 10.88f, 21f, 13f)
                close()
            }
        }.build()

        return _TimerOff!!
    }

@Suppress("ObjectPropertyName")
private var _TimerOff: ImageVector? = null
