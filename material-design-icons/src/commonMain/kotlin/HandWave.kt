package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandWave: ImageVector
    get() {
        if (_HandWave != null) {
            return _HandWave!!
        }
        _HandWave = ImageVector.Builder(
            name = "HandWave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 17f)
                curveTo(23f, 20.31f, 20.31f, 23f, 17f, 23f)
                verticalLineTo(21.5f)
                curveTo(19.5f, 21.5f, 21.5f, 19.5f, 21.5f, 17f)
                horizontalLineTo(23f)
                moveTo(1f, 7f)
                curveTo(1f, 3.69f, 3.69f, 1f, 7f, 1f)
                verticalLineTo(2.5f)
                curveTo(4.5f, 2.5f, 2.5f, 4.5f, 2.5f, 7f)
                horizontalLineTo(1f)
                moveTo(8f, 4.32f)
                lineTo(3.41f, 8.92f)
                curveTo(0.19f, 12.14f, 0.19f, 17.37f, 3.41f, 20.59f)
                reflectiveCurveTo(11.86f, 23.81f, 15.08f, 20.59f)
                lineTo(22.15f, 13.5f)
                curveTo(22.64f, 13.03f, 22.64f, 12.24f, 22.15f, 11.75f)
                curveTo(21.66f, 11.26f, 20.87f, 11.26f, 20.38f, 11.75f)
                lineTo(15.96f, 16.17f)
                lineTo(15.25f, 15.46f)
                lineTo(21.79f, 8.92f)
                curveTo(22.28f, 8.43f, 22.28f, 7.64f, 21.79f, 7.15f)
                reflectiveCurveTo(20.5f, 6.66f, 20f, 7.15f)
                lineTo(14.19f, 13f)
                lineTo(13.5f, 12.27f)
                lineTo(20.37f, 5.38f)
                curveTo(20.86f, 4.89f, 20.86f, 4.1f, 20.37f, 3.61f)
                reflectiveCurveTo(19.09f, 3.12f, 18.6f, 3.61f)
                lineTo(11.71f, 10.5f)
                lineTo(11f, 9.8f)
                lineTo(16.5f, 4.32f)
                curveTo(17f, 3.83f, 17f, 3.04f, 16.5f, 2.55f)
                reflectiveCurveTo(15.22f, 2.06f, 14.73f, 2.55f)
                lineTo(7.11f, 10.17f)
                curveTo(8.33f, 11.74f, 8.22f, 14f, 6.78f, 15.45f)
                lineTo(6.07f, 14.74f)
                curveTo(7.24f, 13.57f, 7.24f, 11.67f, 6.07f, 10.5f)
                lineTo(5.72f, 10.15f)
                lineTo(9.79f, 6.08f)
                curveTo(10.28f, 5.59f, 10.28f, 4.8f, 9.79f, 4.31f)
                curveTo(9.29f, 3.83f, 8.5f, 3.83f, 8f, 4.32f)
                close()
            }
        }.build()

        return _HandWave!!
    }

@Suppress("ObjectPropertyName")
private var _HandWave: ImageVector? = null
