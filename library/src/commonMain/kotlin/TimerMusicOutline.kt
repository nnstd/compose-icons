package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerMusicOutline: ImageVector
    get() {
        if (_TimerMusicOutline != null) {
            return _TimerMusicOutline!!
        }
        _TimerMusicOutline = ImageVector.Builder(
            name = "TimerMusicOutline",
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
                moveTo(11f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                moveTo(13.05f, 19.91f)
                curveTo(12.71f, 19.97f, 12.36f, 20f, 12f, 20f)
                curveTo(8.13f, 20f, 5f, 16.87f, 5f, 13f)
                reflectiveCurveTo(8.13f, 6f, 12f, 6f)
                curveTo(15.17f, 6f, 17.85f, 8.11f, 18.71f, 11f)
                horizontalLineTo(20.77f)
                curveTo(20.46f, 9.66f, 19.86f, 8.43f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                curveTo(20f, 5.46f, 19.55f, 5f, 19.04f, 4.56f)
                lineTo(17.62f, 6f)
                curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                curveTo(7.03f, 4f, 3f, 8.03f, 3f, 13f)
                reflectiveCurveTo(7.03f, 22f, 12f, 22f)
                curveTo(12.42f, 22f, 12.83f, 21.96f, 13.24f, 21.91f)
                curveTo(13.09f, 21.46f, 13f, 21f, 13f, 20.5f)
                curveTo(13f, 20.3f, 13.03f, 20.11f, 13.05f, 19.91f)
                moveTo(18.5f, 13f)
                verticalLineTo(18.21f)
                curveTo(18.19f, 18.07f, 17.86f, 18f, 17.5f, 18f)
                curveTo(16.12f, 18f, 15f, 19.12f, 15f, 20.5f)
                reflectiveCurveTo(16.12f, 23f, 17.5f, 23f)
                reflectiveCurveTo(20f, 21.88f, 20f, 20.5f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(18.5f)
                close()
            }
        }.build()

        return _TimerMusicOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimerMusicOutline: ImageVector? = null
