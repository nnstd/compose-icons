package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Vacuum: ImageVector
    get() {
        if (_Vacuum != null) {
            return _Vacuum!!
        }
        _Vacuum = ImageVector.Builder(
            name = "Vacuum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                lineTo(16f, 20f)
                horizontalLineTo(18.46f)
                lineTo(12f, 4.61f)
                curveTo(11.81f, 4.14f, 11.5f, 3.76f, 11.06f, 3.46f)
                reflectiveCurveTo(10.14f, 3f, 9.61f, 3f)
                curveTo(8.9f, 3f, 8.28f, 3.27f, 7.76f, 3.79f)
                reflectiveCurveTo(7f, 4.92f, 7f, 5.64f)
                lineTo(7f, 9f)
                horizontalLineTo(8f)
                curveTo(10.21f, 9f, 12f, 10.79f, 12f, 13f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                curveTo(8.61f, 21.16f, 9f, 20.13f, 9f, 19f)
                curveTo(9f, 16.24f, 6.76f, 14f, 4f, 14f)
                curveTo(3.29f, 14f, 2.61f, 14.15f, 2f, 14.42f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(5.64f)
                curveTo(5f, 4.8f, 5.23f, 4f, 5.63f, 3.32f)
                curveTo(6.04f, 2.62f, 6.59f, 2.06f, 7.3f, 1.63f)
                curveTo(8f, 1.21f, 8.77f, 1f, 9.61f, 1f)
                curveTo(10.55f, 1f, 11.4f, 1.26f, 12.16f, 1.77f)
                reflectiveCurveTo(13.5f, 2.97f, 13.87f, 3.81f)
                lineTo(20.66f, 20f)
                horizontalLineTo(23f)
                moveTo(7f, 19f)
                curveTo(7f, 20.66f, 5.66f, 22f, 4f, 22f)
                reflectiveCurveTo(1f, 20.66f, 1f, 19f)
                reflectiveCurveTo(2.34f, 16f, 4f, 16f)
                reflectiveCurveTo(7f, 17.34f, 7f, 19f)
                moveTo(5f, 19f)
                curveTo(5f, 18.45f, 4.55f, 18f, 4f, 18f)
                reflectiveCurveTo(3f, 18.45f, 3f, 19f)
                reflectiveCurveTo(3.45f, 20f, 4f, 20f)
                reflectiveCurveTo(5f, 19.55f, 5f, 19f)
                close()
            }
        }.build()

        return _Vacuum!!
    }

@Suppress("ObjectPropertyName")
private var _Vacuum: ImageVector? = null
