package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerPauseOutline: ImageVector
    get() {
        if (_TimerPauseOutline != null) {
            return _TimerPauseOutline!!
        }
        _TimerPauseOutline = ImageVector.Builder(
            name = "TimerPauseOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13.35f)
                curveTo(20.36f, 13.13f, 19.7f, 13f, 19f, 13f)
                curveTo(19f, 9.13f, 15.87f, 6f, 12f, 6f)
                reflectiveCurveTo(5f, 9.13f, 5f, 13f)
                reflectiveCurveTo(8.13f, 20f, 12f, 20f)
                curveTo(12.37f, 20f, 12.72f, 19.96f, 13.08f, 19.91f)
                curveTo(13.18f, 20.6f, 13.4f, 21.25f, 13.71f, 21.83f)
                curveTo(13.16f, 21.94f, 12.59f, 22f, 12f, 22f)
                curveTo(7.03f, 22f, 3f, 17.97f, 3f, 13f)
                reflectiveCurveTo(7.03f, 4f, 12f, 4f)
                curveTo(14.12f, 4f, 16.07f, 4.74f, 17.62f, 6f)
                lineTo(19.04f, 4.56f)
                curveTo(19.55f, 5f, 20f, 5.46f, 20.45f, 5.97f)
                lineTo(19.03f, 7.39f)
                curveTo(20.26f, 8.93f, 21f, 10.88f, 21f, 13f)
                curveTo(21f, 13.12f, 21f, 13.23f, 21f, 13.35f)
                moveTo(11f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                moveTo(19.63f, 16.5f)
                verticalLineTo(21.5f)
                horizontalLineTo(21.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(19.63f)
                moveTo(16.5f, 21.5f)
                horizontalLineTo(18.38f)
                verticalLineTo(16.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(21.5f)
                close()
            }
        }.build()

        return _TimerPauseOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimerPauseOutline: ImageVector? = null
