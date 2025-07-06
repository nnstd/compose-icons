package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerPause: ImageVector
    get() {
        if (_TimerPause != null) {
            return _TimerPause!!
        }
        _TimerPause = ImageVector.Builder(
            name = "TimerPause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 16.5f)
                horizontalLineTo(18.38f)
                verticalLineTo(21.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.5f)
                moveTo(19.63f, 16.5f)
                verticalLineTo(21.5f)
                horizontalLineTo(21.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(19.63f)
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                moveTo(21f, 13.35f)
                curveTo(20.36f, 13.13f, 19.7f, 13f, 19f, 13f)
                curveTo(15.69f, 13f, 13f, 15.69f, 13f, 19f)
                curveTo(13f, 20.03f, 13.26f, 21f, 13.71f, 21.83f)
                curveTo(13.16f, 21.94f, 12.59f, 22f, 12f, 22f)
                curveTo(7.03f, 22f, 3f, 17.97f, 3f, 13f)
                reflectiveCurveTo(7.03f, 4f, 12f, 4f)
                curveTo(14.12f, 4f, 16.07f, 4.74f, 17.62f, 6f)
                lineTo(19.04f, 4.56f)
                curveTo(19.55f, 5f, 20f, 5.46f, 20.45f, 5.97f)
                lineTo(19.03f, 7.39f)
                curveTo(20.26f, 8.93f, 21f, 10.88f, 21f, 13f)
                curveTo(21f, 13.12f, 21f, 13.23f, 21f, 13.35f)
                moveTo(13f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _TimerPause!!
    }

@Suppress("ObjectPropertyName")
private var _TimerPause: ImageVector? = null
