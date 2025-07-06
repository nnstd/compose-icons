package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Paragliding: ImageVector
    get() {
        if (_Paragliding != null) {
            return _Paragliding!!
        }
        _Paragliding = ImageVector.Builder(
            name = "Paragliding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                curveTo(10.9f, 17f, 10f, 16.11f, 10f, 15f)
                reflectiveCurveTo(10.9f, 13f, 12f, 13f)
                reflectiveCurveTo(14f, 13.9f, 14f, 15f)
                reflectiveCurveTo(13.11f, 17f, 12f, 17f)
                moveTo(19f, 14f)
                horizontalLineTo(17f)
                curveTo(17f, 16.76f, 14.76f, 19f, 12f, 19f)
                reflectiveCurveTo(7f, 16.76f, 7f, 14f)
                horizontalLineTo(5f)
                curveTo(5f, 16.79f, 6.64f, 19.19f, 9f, 20.32f)
                verticalLineTo(23f)
                horizontalLineTo(15f)
                verticalLineTo(20.32f)
                curveTo(17.36f, 19.19f, 19f, 16.79f, 19f, 14f)
                moveTo(23f, 7.76f)
                curveTo(23.04f, 8.56f, 22.05f, 9.06f, 21.41f, 8.6f)
                curveTo(21.27f, 8.46f, 21.16f, 8.44f, 21f, 8.32f)
                lineTo(18.97f, 13f)
                horizontalLineTo(17f)
                lineTo(15.5f, 6.73f)
                curveTo(13.21f, 6.5f, 10.79f, 6.5f, 8.5f, 6.73f)
                lineTo(7f, 13f)
                horizontalLineTo(5.03f)
                lineTo(3f, 8.32f)
                curveTo(2.84f, 8.44f, 2.73f, 8.46f, 2.59f, 8.6f)
                curveTo(1.95f, 9.06f, 0.959f, 8.56f, 1f, 7.76f)
                verticalLineTo(4f)
                curveTo(1f, 4f, 1f, 1f, 12f, 1f)
                reflectiveCurveTo(23f, 4f, 23f, 4f)
                moveTo(6.9f, 7f)
                curveTo(6f, 7.2f, 5.15f, 7.43f, 4.37f, 7.71f)
                lineTo(5.87f, 11.27f)
                lineTo(6.9f, 7f)
                moveTo(19.63f, 7.71f)
                curveTo(18.85f, 7.43f, 18f, 7.2f, 17.1f, 7f)
                lineTo(18.13f, 11.27f)
                lineTo(19.63f, 7.71f)
                close()
            }
        }.build()

        return _Paragliding!!
    }

@Suppress("ObjectPropertyName")
private var _Paragliding: ImageVector? = null
