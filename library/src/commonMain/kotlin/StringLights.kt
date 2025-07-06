package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StringLights: ImageVector
    get() {
        if (_StringLights != null) {
            return _StringLights!!
        }
        _StringLights = ImageVector.Builder(
            name = "StringLights",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.56f, 11.39f)
                curveTo(22.36f, 10.59f, 21.82f, 9.85f, 21.05f, 9.44f)
                lineTo(20.63f, 7.74f)
                curveTo(21.11f, 7.58f, 21.57f, 7.41f, 22f, 7.23f)
                verticalLineTo(5f)
                curveTo(20f, 6.07f, 16.53f, 7.03f, 12f, 7.03f)
                reflectiveCurveTo(4f, 6.07f, 2f, 5f)
                verticalLineTo(7.23f)
                curveTo(2.43f, 7.41f, 2.89f, 7.58f, 3.37f, 7.74f)
                lineTo(2.95f, 9.44f)
                curveTo(2.18f, 9.85f, 1.64f, 10.59f, 1.44f, 11.39f)
                curveTo(0.905f, 13.57f, 0.385f, 17.31f, 2.92f, 17.93f)
                curveTo(4f, 18.2f, 6f, 17.89f, 7.27f, 12.82f)
                curveTo(7.46f, 12f, 7.33f, 11.12f, 6.84f, 10.39f)
                lineTo(7.26f, 8.67f)
                curveTo(8.14f, 8.81f, 9.05f, 8.9f, 10f, 8.96f)
                verticalLineTo(10.74f)
                curveTo(9.35f, 11.33f, 9f, 12.17f, 9f, 13f)
                curveTo(9f, 15.24f, 9.39f, 19f, 12f, 19f)
                curveTo(13.12f, 19f, 15f, 18.22f, 15f, 13f)
                curveTo(15f, 12.17f, 14.65f, 11.33f, 14f, 10.74f)
                verticalLineTo(8.96f)
                curveTo(14.95f, 8.9f, 15.86f, 8.81f, 16.74f, 8.67f)
                lineTo(17.16f, 10.39f)
                curveTo(16.67f, 11.12f, 16.54f, 12f, 16.73f, 12.82f)
                curveTo(18f, 17.89f, 20f, 18.2f, 21.08f, 17.93f)
                curveTo(23.61f, 17.31f, 23.09f, 13.57f, 22.56f, 11.39f)
                moveTo(5.81f, 12.47f)
                curveTo(5.81f, 12.47f, 4.74f, 16.84f, 3.28f, 16.5f)
                curveTo(1.82f, 16.12f, 2.9f, 11.75f, 2.9f, 11.75f)
                reflectiveCurveTo(3.26f, 10.29f, 4.71f, 10.65f)
                reflectiveCurveTo(5.81f, 12.47f, 5.81f, 12.47f)
                moveTo(12f, 17.5f)
                curveTo(10.5f, 17.5f, 10.5f, 13f, 10.5f, 13f)
                reflectiveCurveTo(10.5f, 11.5f, 12f, 11.5f)
                reflectiveCurveTo(13.5f, 13f, 13.5f, 13f)
                reflectiveCurveTo(13.5f, 17.5f, 12f, 17.5f)
                moveTo(20.72f, 16.5f)
                curveTo(19.27f, 16.84f, 18.19f, 12.47f, 18.19f, 12.47f)
                reflectiveCurveTo(17.83f, 11f, 19.29f, 10.65f)
                reflectiveCurveTo(21.1f, 11.75f, 21.1f, 11.75f)
                reflectiveCurveTo(22.18f, 16.12f, 20.72f, 16.5f)
                close()
            }
        }.build()

        return _StringLights!!
    }

@Suppress("ObjectPropertyName")
private var _StringLights: ImageVector? = null
