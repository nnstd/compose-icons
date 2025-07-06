package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerStopOutline: ImageVector
    get() {
        if (_TimerStopOutline != null) {
            return _TimerStopOutline!!
        }
        _TimerStopOutline = ImageVector.Builder(
            name = "TimerStopOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                moveTo(12f, 20f)
                curveTo(8.13f, 20f, 5f, 16.87f, 5f, 13f)
                reflectiveCurveTo(8.13f, 6f, 12f, 6f)
                reflectiveCurveTo(19f, 9.13f, 19f, 13f)
                curveTo(19.7f, 13f, 20.36f, 13.13f, 21f, 13.35f)
                curveTo(21f, 13.23f, 21f, 13.12f, 21f, 13f)
                curveTo(21f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                curveTo(20f, 5.46f, 19.55f, 5f, 19.04f, 4.56f)
                lineTo(17.62f, 6f)
                curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                curveTo(7.03f, 4f, 3f, 8.03f, 3f, 13f)
                reflectiveCurveTo(7.03f, 22f, 12f, 22f)
                curveTo(12.59f, 22f, 13.16f, 21.94f, 13.71f, 21.83f)
                curveTo(13.4f, 21.25f, 13.18f, 20.6f, 13.08f, 19.91f)
                curveTo(12.72f, 19.96f, 12.37f, 20f, 12f, 20f)
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                moveTo(16.5f, 16.5f)
                verticalLineTo(21.5f)
                horizontalLineTo(21.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(16.5f)
                close()
            }
        }.build()

        return _TimerStopOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimerStopOutline: ImageVector? = null
