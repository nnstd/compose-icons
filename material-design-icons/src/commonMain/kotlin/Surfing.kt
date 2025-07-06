package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Surfing: ImageVector
    get() {
        if (_Surfing != null) {
            return _Surfing!!
        }
        _Surfing = ImageVector.Builder(
            name = "Surfing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23f)
                verticalLineTo(21f)
                curveTo(20.59f, 21.05f, 19.22f, 20.9f, 18f, 20f)
                curveTo(16.24f, 21.25f, 13.77f, 21.25f, 12f, 20f)
                curveTo(10.23f, 21.25f, 7.76f, 21.25f, 6f, 20f)
                curveTo(4.78f, 20.9f, 3.41f, 21.05f, 2f, 21f)
                verticalLineTo(23f)
                curveTo(3.37f, 23.05f, 4.78f, 22.94f, 6f, 22.25f)
                curveTo(7.84f, 23.25f, 10.15f, 23.25f, 12f, 22.25f)
                curveTo(13.85f, 23.25f, 16.16f, 23.25f, 18f, 22.25f)
                curveTo(19.22f, 22.94f, 20.63f, 23.05f, 22f, 23f)
                moveTo(20.5f, 11.97f)
                verticalLineTo(9.95f)
                curveTo(18.74f, 9.96f, 17f, 9f, 16.18f, 7.41f)
                lineTo(15.29f, 5.86f)
                curveTo(15f, 5.4f, 14.55f, 5.11f, 14.07f, 4.97f)
                lineTo(8.5f, 3.94f)
                lineTo(5f, 6.38f)
                lineTo(6.13f, 8f)
                lineTo(8.95f, 6.1f)
                lineTo(10.97f, 6.43f)
                lineTo(8.81f, 7.88f)
                curveTo(8.21f, 8.29f, 7.88f, 9f, 8f, 9.71f)
                lineTo(8.53f, 12.81f)
                curveTo(7.12f, 12.26f, 3.21f, 11f, 3f, 13.23f)
                curveTo(3.36f, 15.67f, 6.07f, 17.32f, 8.06f, 18.82f)
                curveTo(9.5f, 19.29f, 11.06f, 18.58f, 12f, 17.46f)
                curveTo(13.32f, 19.16f, 15.89f, 19.46f, 17.5f, 18f)
                curveTo(17.03f, 17.58f, 16.5f, 17.15f, 16f, 16.8f)
                verticalLineTo(12.95f)
                lineTo(12.19f, 9.95f)
                lineTo(14.44f, 8.44f)
                curveTo(15.62f, 10.59f, 18f, 12f, 20.5f, 11.97f)
                moveTo(14f, 14f)
                verticalLineTo(15.47f)
                curveTo(14f, 15.43f, 11.66f, 14.16f, 11.81f, 14.24f)
                lineTo(10.73f, 13.7f)
                lineTo(10.31f, 11.08f)
                lineTo(14f, 14f)
                moveTo(19f, 3.5f)
                curveTo(19f, 4.61f, 18.11f, 5.5f, 17f, 5.5f)
                reflectiveCurveTo(15f, 4.61f, 15f, 3.5f)
                reflectiveCurveTo(15.9f, 1.5f, 17f, 1.5f)
                reflectiveCurveTo(19f, 2.4f, 19f, 3.5f)
                close()
            }
        }.build()

        return _Surfing!!
    }

@Suppress("ObjectPropertyName")
private var _Surfing: ImageVector? = null
