package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandWash: ImageVector
    get() {
        if (_HandWash != null) {
            return _HandWash!!
        }
        _HandWash = ImageVector.Builder(
            name = "HandWash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 5f)
                lineTo(17.62f, 6.37f)
                lineTo(19f, 7f)
                lineTo(17.62f, 7.63f)
                lineTo(17f, 9f)
                lineTo(16.36f, 7.63f)
                lineTo(15f, 7f)
                lineTo(16.36f, 6.37f)
                lineTo(17f, 5f)
                moveTo(11f, 6.13f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                curveTo(13.57f, 4f, 14.1f, 4.17f, 14.55f, 4.45f)
                lineTo(16f, 3f)
                curveTo(15.15f, 2.39f, 14.13f, 2f, 13f, 2f)
                horizontalLineTo(7.5f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(6.14f)
                curveTo(7.23f, 6.5f, 5.81f, 7.8f, 5.26f, 9.5f)
                horizontalLineTo(9.24f)
                lineTo(15f, 11.65f)
                verticalLineTo(11.03f)
                curveTo(15f, 8.61f, 13.28f, 6.59f, 11f, 6.13f)
                moveTo(1f, 22f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(22f)
                moveTo(20f, 17f)
                horizontalLineTo(13f)
                lineTo(10.91f, 16.27f)
                lineTo(11.24f, 15.33f)
                lineTo(13f, 16f)
                horizontalLineTo(15.82f)
                curveTo(16.47f, 16f, 17f, 15.47f, 17f, 14.82f)
                curveTo(17f, 14.33f, 16.69f, 13.89f, 16.23f, 13.71f)
                lineTo(8.97f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                lineTo(14f, 22f)
                lineTo(22f, 19f)
                curveTo(22f, 17.9f, 21.11f, 17f, 20f, 17f)
                moveTo(20f, 14f)
                curveTo(21.1f, 14f, 22f, 13.1f, 22f, 12f)
                reflectiveCurveTo(20f, 8f, 20f, 8f)
                reflectiveCurveTo(18f, 10.9f, 18f, 12f)
                reflectiveCurveTo(18.9f, 14f, 20f, 14f)
                close()
            }
        }.build()

        return _HandWash!!
    }

@Suppress("ObjectPropertyName")
private var _HandWash: ImageVector? = null
