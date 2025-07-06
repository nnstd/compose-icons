package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerRefresh: ImageVector
    get() {
        if (_TimerRefresh != null) {
            return _TimerRefresh!!
        }
        _TimerRefresh = ImageVector.Builder(
            name = "TimerRefresh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(1f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                moveTo(12f, 18.5f)
                curveTo(12f, 19.77f, 12.37f, 20.94f, 13f, 21.94f)
                curveTo(12.67f, 22f, 12.34f, 22f, 12f, 22f)
                curveTo(7.03f, 22f, 3f, 17.97f, 3f, 13f)
                reflectiveCurveTo(7.03f, 4f, 12f, 4f)
                curveTo(14.12f, 4f, 16.07f, 4.74f, 17.62f, 6f)
                lineTo(19.04f, 4.56f)
                curveTo(19.55f, 5f, 20f, 5.46f, 20.45f, 5.97f)
                lineTo(19.03f, 7.39f)
                curveTo(20.16f, 8.81f, 20.87f, 10.57f, 21f, 12.5f)
                curveTo(20.22f, 12.18f, 19.38f, 12f, 18.5f, 12f)
                curveTo(14.91f, 12f, 12f, 14.91f, 12f, 18.5f)
                moveTo(13f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
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

        return _TimerRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _TimerRefresh: ImageVector? = null
