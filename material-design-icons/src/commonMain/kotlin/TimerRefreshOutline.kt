package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerRefreshOutline: ImageVector
    get() {
        if (_TimerRefreshOutline != null) {
            return _TimerRefreshOutline!!
        }
        _TimerRefreshOutline = ImageVector.Builder(
            name = "TimerRefreshOutline",
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
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                moveTo(12f, 20f)
                curveTo(8.13f, 20f, 5f, 16.87f, 5f, 13f)
                reflectiveCurveTo(8.13f, 6f, 12f, 6f)
                curveTo(15.54f, 6f, 18.45f, 8.62f, 18.93f, 12.03f)
                curveTo(19.65f, 12.08f, 20.34f, 12.23f, 21f, 12.5f)
                curveTo(20.87f, 10.57f, 20.16f, 8.81f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                curveTo(20f, 5.46f, 19.55f, 5f, 19.04f, 4.56f)
                lineTo(17.62f, 6f)
                curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                curveTo(7.03f, 4f, 3f, 8.03f, 3f, 13f)
                reflectiveCurveTo(7.03f, 22f, 12f, 22f)
                curveTo(12.34f, 22f, 12.67f, 22f, 13f, 21.94f)
                curveTo(12.63f, 21.35f, 12.35f, 20.69f, 12.18f, 20f)
                curveTo(12.12f, 20f, 12.06f, 20f, 12f, 20f)
                moveTo(22f, 18.5f)
                verticalLineTo(14.5f)
                lineTo(20.83f, 15.67f)
                curveTo(20.11f, 14.95f, 19.11f, 14.5f, 18f, 14.5f)
                curveTo(15.79f, 14.5f, 14f, 16.29f, 14f, 18.5f)
                reflectiveCurveTo(15.79f, 22.5f, 18f, 22.5f)
                curveTo(19.68f, 22.5f, 21.12f, 21.47f, 21.71f, 20f)
                horizontalLineTo(20f)
                curveTo(19.54f, 20.61f, 18.82f, 21f, 18f, 21f)
                curveTo(16.62f, 21f, 15.5f, 19.88f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 16f, 18f, 16f)
                curveTo(18.69f, 16f, 19.32f, 16.28f, 19.77f, 16.73f)
                lineTo(18f, 18.5f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _TimerRefreshOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimerRefreshOutline: ImageVector? = null
