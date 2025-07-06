package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CakeVariantOutline: ImageVector
    get() {
        if (_CakeVariantOutline != null) {
            return _CakeVariantOutline!!
        }
        _CakeVariantOutline = ImageVector.Builder(
            name = "CakeVariantOutline",
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
                curveTo(10f, 5.1f, 10.9f, 6f, 12f, 6f)
                moveTo(18f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                curveTo(4.34f, 9f, 3f, 10.34f, 3f, 12f)
                verticalLineTo(21f)
                curveTo(3f, 21.55f, 3.45f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(20.55f, 22f, 21f, 21.55f, 21f, 21f)
                verticalLineTo(12f)
                curveTo(21f, 10.34f, 19.66f, 9f, 18f, 9f)
                moveTo(19f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                curveTo(5.9f, 17f, 6.76f, 16.63f, 7.4f, 16f)
                lineTo(8.5f, 14.92f)
                lineTo(9.56f, 16f)
                curveTo(10.87f, 17.3f, 13.15f, 17.29f, 14.45f, 16f)
                lineTo(15.53f, 14.92f)
                lineTo(16.6f, 16f)
                curveTo(17.24f, 16.63f, 18.1f, 17f, 19f, 17f)
                verticalLineTo(20f)
                moveTo(19f, 15.5f)
                curveTo(18.5f, 15.5f, 18f, 15.3f, 17.65f, 14.93f)
                lineTo(15.5f, 12.8f)
                lineTo(13.38f, 14.93f)
                curveTo(12.64f, 15.67f, 11.35f, 15.67f, 10.61f, 14.93f)
                lineTo(8.5f, 12.8f)
                lineTo(6.34f, 14.93f)
                curveTo(6f, 15.29f, 5.5f, 15.5f, 5f, 15.5f)
                verticalLineTo(12f)
                curveTo(5f, 11.45f, 5.45f, 11f, 6f, 11f)
                horizontalLineTo(18f)
                curveTo(18.55f, 11f, 19f, 11.45f, 19f, 12f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()

        return _CakeVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CakeVariantOutline: ImageVector? = null
