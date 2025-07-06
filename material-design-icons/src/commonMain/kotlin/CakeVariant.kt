package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CakeVariant: ImageVector
    get() {
        if (_CakeVariant != null) {
            return _CakeVariant!!
        }
        _CakeVariant = ImageVector.Builder(
            name = "CakeVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveTo(13.11f, 6f, 14f, 5.1f, 14f, 4f)
                curveTo(14f, 3.62f, 13.9f, 3.27f, 13.71f, 2.97f)
                lineTo(12f, 0f)
                lineTo(10.29f, 2.97f)
                curveTo(10.1f, 3.27f, 10f, 3.62f, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                moveTo(16.6f, 16f)
                lineTo(15.53f, 14.92f)
                lineTo(14.45f, 16f)
                curveTo(13.15f, 17.29f, 10.87f, 17.3f, 9.56f, 16f)
                lineTo(8.5f, 14.92f)
                lineTo(7.4f, 16f)
                curveTo(6.75f, 16.64f, 5.88f, 17f, 4.96f, 17f)
                curveTo(4.23f, 17f, 3.56f, 16.77f, 3f, 16.39f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 21f)
                verticalLineTo(16.39f)
                curveTo(20.44f, 16.77f, 19.77f, 17f, 19.04f, 17f)
                curveTo(18.12f, 17f, 17.25f, 16.64f, 16.6f, 16f)
                moveTo(18f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                verticalLineTo(13.54f)
                curveTo(3f, 14.62f, 3.88f, 15.5f, 4.96f, 15.5f)
                curveTo(5.5f, 15.5f, 6f, 15.3f, 6.34f, 14.93f)
                lineTo(8.5f, 12.8f)
                lineTo(10.61f, 14.93f)
                curveTo(11.35f, 15.67f, 12.64f, 15.67f, 13.38f, 14.93f)
                lineTo(15.5f, 12.8f)
                lineTo(17.65f, 14.93f)
                curveTo(18f, 15.3f, 18.5f, 15.5f, 19.03f, 15.5f)
                curveTo(20.11f, 15.5f, 21f, 14.62f, 21f, 13.54f)
                verticalLineTo(12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 9f)
                close()
            }
        }.build()

        return _CakeVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CakeVariant: ImageVector? = null
