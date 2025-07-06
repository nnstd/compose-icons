package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SealVariant: ImageVector
    get() {
        if (_SealVariant != null) {
            return _SealVariant!!
        }
        _SealVariant = ImageVector.Builder(
            name = "SealVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.71f, 6.15f)
                curveTo(17.46f, 5.38f, 16.79f, 5.21f, 16.45f, 4.77f)
                curveTo(16.14f, 4.31f, 16.18f, 3.62f, 15.53f, 3.15f)
                reflectiveCurveTo(14.23f, 2.92f, 13.7f, 2.77f)
                reflectiveCurveTo(12.81f, 2f, 12f, 2f)
                reflectiveCurveTo(10.82f, 2.58f, 10.3f, 2.77f)
                reflectiveCurveTo(9.13f, 2.67f, 8.47f, 3.15f)
                reflectiveCurveTo(7.86f, 4.31f, 7.55f, 4.77f)
                curveTo(7.21f, 5.21f, 6.55f, 5.38f, 6.29f, 6.15f)
                reflectiveCurveTo(6.5f, 7.45f, 6.5f, 8f)
                reflectiveCurveTo(6f, 9.08f, 6.29f, 9.85f)
                reflectiveCurveTo(7.21f, 10.79f, 7.55f, 11.23f)
                curveTo(7.86f, 11.69f, 7.82f, 12.38f, 8.47f, 12.85f)
                reflectiveCurveTo(9.77f, 13.08f, 10.3f, 13.23f)
                reflectiveCurveTo(11.19f, 14f, 12f, 14f)
                reflectiveCurveTo(13.18f, 13.42f, 13.7f, 13.23f)
                reflectiveCurveTo(14.87f, 13.33f, 15.53f, 12.85f)
                reflectiveCurveTo(16.14f, 11.69f, 16.45f, 11.23f)
                curveTo(16.79f, 10.79f, 17.45f, 10.62f, 17.71f, 9.85f)
                reflectiveCurveTo(17.5f, 8.55f, 17.5f, 8f)
                reflectiveCurveTo(18f, 6.92f, 17.71f, 6.15f)
                moveTo(12f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                moveTo(14f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                moveTo(13.71f, 15.56f)
                lineTo(13.08f, 19.16f)
                lineTo(12.35f, 23.29f)
                lineTo(9.74f, 20.8f)
                lineTo(6.44f, 22.25f)
                lineTo(7.77f, 14.75f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.66f, 15.17f)
                arcTo(4.15f, 4.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 15.85f)
                arcTo(3.32f, 3.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.71f, 15.56f)
                moveTo(17.92f, 18.78f)
                lineTo(15.34f, 17.86f)
                lineTo(15.85f, 14.92f)
                arcTo(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.7f, 14.47f)
                lineTo(16.82f, 14.37f)
                close()
            }
        }.build()

        return _SealVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SealVariant: ImageVector? = null
