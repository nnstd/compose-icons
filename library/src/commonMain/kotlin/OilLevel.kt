package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OilLevel: ImageVector
    get() {
        if (_OilLevel != null) {
            return _OilLevel!!
        }
        _OilLevel = ImageVector.Builder(
            name = "OilLevel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 18f)
                curveTo(6.67f, 18f, 5.79f, 18.79f, 5.29f, 19.29f)
                reflectiveCurveTo(4.67f, 20f, 4f, 20f)
                reflectiveCurveTo(3.21f, 19.79f, 2.71f, 19.29f)
                curveTo(2.35f, 18.93f, 1.79f, 18.42f, 1f, 18.16f)
                verticalLineTo(20.41f)
                curveTo(1.09f, 20.5f, 1.18f, 20.59f, 1.29f, 20.71f)
                curveTo(1.79f, 21.21f, 2.67f, 22f, 4f, 22f)
                reflectiveCurveTo(6.21f, 21.21f, 6.71f, 20.71f)
                reflectiveCurveTo(7.33f, 20f, 8f, 20f)
                reflectiveCurveTo(8.79f, 20.21f, 9.29f, 20.71f)
                curveTo(9.73f, 21.14f, 10.44f, 21.8f, 11.5f, 21.96f)
                curveTo(11.66f, 22f, 11.83f, 22f, 12f, 22f)
                curveTo(13.33f, 22f, 14.21f, 21.21f, 14.71f, 20.71f)
                reflectiveCurveTo(15.33f, 20f, 16f, 20f)
                reflectiveCurveTo(16.79f, 20.21f, 17.29f, 20.71f)
                reflectiveCurveTo(18.67f, 22f, 20f, 22f)
                reflectiveCurveTo(22.21f, 21.21f, 22.71f, 20.71f)
                curveTo(22.82f, 20.59f, 22.91f, 20.5f, 23f, 20.41f)
                verticalLineTo(18.16f)
                curveTo(22.21f, 18.42f, 21.65f, 18.93f, 21.29f, 19.29f)
                curveTo(20.79f, 19.79f, 20.67f, 20f, 20f, 20f)
                reflectiveCurveTo(19.21f, 19.79f, 18.71f, 19.29f)
                reflectiveCurveTo(17.33f, 18f, 16f, 18f)
                reflectiveCurveTo(13.79f, 18.79f, 13.29f, 19.29f)
                reflectiveCurveTo(12.67f, 20f, 12f, 20f)
                curveTo(11.78f, 20f, 11.63f, 19.97f, 11.5f, 19.92f)
                curveTo(11.22f, 19.82f, 11.05f, 19.63f, 10.71f, 19.29f)
                curveTo(10.21f, 18.79f, 9.33f, 18f, 8f, 18f)
                moveTo(22f, 10.5f)
                curveTo(22f, 10.5f, 24f, 12.67f, 24f, 14f)
                curveTo(24f, 15.1f, 23.1f, 16f, 22f, 16f)
                reflectiveCurveTo(20f, 15.1f, 20f, 14f)
                curveTo(20f, 12.67f, 22f, 10.5f, 22f, 10.5f)
                moveTo(22.5f, 7.13f)
                lineTo(19.24f, 5.24f)
                lineTo(12.73f, 9f)
                curveTo(12.39f, 8.4f, 11.74f, 8f, 11f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                curveTo(10.55f, 6f, 11f, 5.55f, 11f, 5f)
                reflectiveCurveTo(10.55f, 4f, 10f, 4f)
                horizontalLineTo(6f)
                curveTo(5.45f, 4f, 5f, 4.45f, 5f, 5f)
                reflectiveCurveTo(5.45f, 6f, 6f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                curveTo(3.9f, 8f, 3f, 8.9f, 3f, 10f)
                verticalLineTo(13f)
                curveTo(3f, 14.1f, 3.9f, 15f, 5f, 15f)
                horizontalLineTo(14f)
                curveTo(14.75f, 15f, 15.41f, 14.58f, 15.75f, 13.97f)
                lineTo(19.4f, 7.65f)
                lineTo(21.5f, 8.86f)
                curveTo(22f, 9.14f, 22.59f, 8.97f, 22.87f, 8.5f)
                curveTo(23.14f, 8f, 23f, 7.4f, 22.5f, 7.13f)
                moveTo(14f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(11.69f)
                lineTo(12.6f, 11.43f)
                lineTo(16.06f, 9.43f)
                lineTo(14f, 13f)
                moveTo(3.5f, 6.92f)
                lineTo(1.79f, 8.62f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.38f, 7.21f)
                lineTo(2.09f, 5.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 5.5f)
                curveTo(3.89f, 5.89f, 3.89f, 6.5f, 3.5f, 6.92f)
                close()
            }
        }.build()

        return _OilLevel!!
    }

@Suppress("ObjectPropertyName")
private var _OilLevel: ImageVector? = null
