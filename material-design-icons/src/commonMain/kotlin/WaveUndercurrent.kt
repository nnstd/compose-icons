package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaveUndercurrent: ImageVector
    get() {
        if (_WaveUndercurrent != null) {
            return _WaveUndercurrent!!
        }
        _WaveUndercurrent = ImageVector.Builder(
            name = "WaveUndercurrent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                curveTo(18.62f, 9f, 17.26f, 8.65f, 16f, 8f)
                curveTo(13.5f, 9.3f, 10.5f, 9.3f, 8f, 8f)
                curveTo(6.74f, 8.65f, 5.37f, 9f, 4f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                curveTo(5.39f, 7f, 6.78f, 6.53f, 8f, 5.67f)
                curveTo(10.44f, 7.38f, 13.56f, 7.38f, 16f, 5.67f)
                curveTo(17.22f, 6.53f, 18.61f, 7f, 20f, 7f)
                moveTo(12f, 12.5f)
                curveTo(14.21f, 12.5f, 16f, 14.29f, 16f, 16.5f)
                curveTo(16f, 17.32f, 15.75f, 18.08f, 15.33f, 18.71f)
                lineTo(14.24f, 17.62f)
                curveTo(14.41f, 17.28f, 14.5f, 16.9f, 14.5f, 16.5f)
                curveTo(14.5f, 15.12f, 13.38f, 14f, 12f, 14f)
                verticalLineTo(15.5f)
                lineTo(9.75f, 13.25f)
                lineTo(12f, 11f)
                verticalLineTo(12.5f)
                moveTo(12f, 19f)
                verticalLineTo(17.5f)
                lineTo(14.25f, 19.75f)
                lineTo(12f, 22f)
                verticalLineTo(20.5f)
                curveTo(9.79f, 20.5f, 8f, 18.71f, 8f, 16.5f)
                curveTo(8f, 15.68f, 8.25f, 14.92f, 8.67f, 14.29f)
                lineTo(9.76f, 15.38f)
                curveTo(9.59f, 15.72f, 9.5f, 16.1f, 9.5f, 16.5f)
                curveTo(9.5f, 17.88f, 10.62f, 19f, 12f, 19f)
                close()
            }
        }.build()

        return _WaveUndercurrent!!
    }

@Suppress("ObjectPropertyName")
private var _WaveUndercurrent: ImageVector? = null
