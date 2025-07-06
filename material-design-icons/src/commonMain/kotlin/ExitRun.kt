package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ExitRun: ImageVector
    get() {
        if (_ExitRun != null) {
            return _ExitRun!!
        }
        _ExitRun = ImageVector.Builder(
            name = "ExitRun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.34f, 8.17f)
                curveTo(12.41f, 8.17f, 11.65f, 7.4f, 11.65f, 6.47f)
                arcTo(1.69f, 1.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.34f, 4.78f)
                curveTo(14.28f, 4.78f, 15.04f, 5.54f, 15.04f, 6.47f)
                curveTo(15.04f, 7.4f, 14.28f, 8.17f, 13.34f, 8.17f)
                moveTo(10.3f, 19.93f)
                lineTo(4.37f, 18.75f)
                lineTo(4.71f, 17.05f)
                lineTo(8.86f, 17.9f)
                lineTo(10.21f, 11.04f)
                lineTo(8.69f, 11.64f)
                verticalLineTo(14.5f)
                horizontalLineTo(7f)
                verticalLineTo(10.54f)
                lineTo(11.4f, 8.67f)
                lineTo(12.07f, 8.59f)
                curveTo(12.67f, 8.59f, 13.17f, 8.93f, 13.5f, 9.44f)
                lineTo(14.36f, 10.79f)
                curveTo(15.04f, 12f, 16.39f, 12.82f, 18f, 12.82f)
                verticalLineTo(14.5f)
                curveTo(16.14f, 14.5f, 14.44f, 13.67f, 13.34f, 12.4f)
                lineTo(12.84f, 14.94f)
                lineTo(14.61f, 16.63f)
                verticalLineTo(23f)
                horizontalLineTo(12.92f)
                verticalLineTo(17.9f)
                lineTo(11.14f, 16.21f)
                lineTo(10.3f, 19.93f)
                moveTo(21f, 23f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(16.11f)
                lineTo(4f, 15.69f)
                verticalLineTo(1f)
                horizontalLineTo(21f)
                verticalLineTo(23f)
                moveTo(6f, 23f)
                horizontalLineTo(4f)
                verticalLineTo(19.78f)
                lineTo(6f, 20.2f)
                verticalLineTo(23f)
                close()
            }
        }.build()

        return _ExitRun!!
    }

@Suppress("ObjectPropertyName")
private var _ExitRun: ImageVector? = null
