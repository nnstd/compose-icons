package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarWrench: ImageVector
    get() {
        if (_CarWrench != null) {
            return _CarWrench!!
        }
        _CarWrench = ImageVector.Builder(
            name = "CarWrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.96f, 16.45f)
                curveTo(20.97f, 16.3f, 21f, 16.15f, 21f, 16f)
                verticalLineTo(16.5f)
                lineTo(20.96f, 16.45f)
                moveTo(11f, 16f)
                curveTo(11f, 16.71f, 11.15f, 17.39f, 11.42f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                curveTo(6f, 19.55f, 5.55f, 20f, 5f, 20f)
                horizontalLineTo(4f)
                curveTo(3.45f, 20f, 3f, 19.55f, 3f, 19f)
                verticalLineTo(11f)
                lineTo(5.08f, 5f)
                curveTo(5.28f, 4.42f, 5.84f, 4f, 6.5f, 4f)
                horizontalLineTo(17.5f)
                curveTo(18.16f, 4f, 18.72f, 4.42f, 18.92f, 5f)
                lineTo(21f, 11f)
                verticalLineTo(16f)
                curveTo(21f, 13.24f, 18.76f, 11f, 16f, 11f)
                reflectiveCurveTo(11f, 13.24f, 11f, 16f)
                moveTo(8f, 13.5f)
                curveTo(8f, 12.67f, 7.33f, 12f, 6.5f, 12f)
                reflectiveCurveTo(5f, 12.67f, 5f, 13.5f)
                reflectiveCurveTo(5.67f, 15f, 6.5f, 15f)
                reflectiveCurveTo(8f, 14.33f, 8f, 13.5f)
                moveTo(19f, 10f)
                lineTo(17.5f, 5.5f)
                horizontalLineTo(6.5f)
                lineTo(5f, 10f)
                horizontalLineTo(19f)
                moveTo(22.87f, 21.19f)
                lineTo(18.76f, 17.08f)
                curveTo(19.17f, 16.04f, 18.94f, 14.82f, 18.08f, 13.97f)
                curveTo(17.18f, 13.06f, 15.83f, 12.88f, 14.74f, 13.38f)
                lineTo(16.68f, 15.32f)
                lineTo(15.33f, 16.68f)
                lineTo(13.34f, 14.73f)
                curveTo(12.8f, 15.82f, 13.05f, 17.17f, 13.93f, 18.08f)
                curveTo(14.79f, 18.94f, 16f, 19.16f, 17.05f, 18.76f)
                lineTo(21.16f, 22.86f)
                curveTo(21.34f, 23.05f, 21.61f, 23.05f, 21.79f, 22.86f)
                lineTo(22.83f, 21.83f)
                curveTo(23.05f, 21.65f, 23.05f, 21.33f, 22.87f, 21.19f)
                close()
            }
        }.build()

        return _CarWrench!!
    }

@Suppress("ObjectPropertyName")
private var _CarWrench: ImageVector? = null
