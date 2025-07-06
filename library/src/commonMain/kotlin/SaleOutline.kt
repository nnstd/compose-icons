package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SaleOutline: ImageVector
    get() {
        if (_SaleOutline != null) {
            return _SaleOutline!!
        }
        _SaleOutline = ImageVector.Builder(
            name = "SaleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 7f)
                curveTo(10.33f, 7f, 11f, 7.67f, 11f, 8.5f)
                curveTo(11f, 9.33f, 10.33f, 10f, 9.5f, 10f)
                curveTo(8.67f, 10f, 8f, 9.33f, 8f, 8.5f)
                curveTo(8f, 7.67f, 8.67f, 7f, 9.5f, 7f)
                moveTo(14.5f, 14f)
                curveTo(15.33f, 14f, 16f, 14.67f, 16f, 15.5f)
                curveTo(16f, 16.33f, 15.33f, 17f, 14.5f, 17f)
                curveTo(13.67f, 17f, 13f, 16.33f, 13f, 15.5f)
                curveTo(13f, 14.67f, 13.67f, 14f, 14.5f, 14f)
                moveTo(8.41f, 17f)
                lineTo(7f, 15.59f)
                lineTo(15.59f, 7f)
                lineTo(17f, 8.41f)
                lineTo(8.41f, 17f)
                moveTo(18.65f, 2.85f)
                lineTo(19.26f, 6.71f)
                lineTo(22.77f, 8.5f)
                lineTo(21f, 12f)
                lineTo(22.78f, 15.5f)
                lineTo(19.24f, 17.29f)
                lineTo(18.63f, 21.15f)
                lineTo(14.74f, 20.54f)
                lineTo(11.97f, 23.31f)
                lineTo(9.19f, 20.5f)
                lineTo(5.33f, 21.14f)
                lineTo(4.71f, 17.25f)
                lineTo(1.22f, 15.47f)
                lineTo(3f, 11.97f)
                lineTo(1.23f, 8.5f)
                lineTo(4.74f, 6.69f)
                lineTo(5.35f, 2.87f)
                lineTo(9.22f, 3.5f)
                lineTo(12f, 0.695f)
                lineTo(14.76f, 3.46f)
                lineTo(18.65f, 2.85f)
                moveTo(20.1f, 9.37f)
                lineTo(17.5f, 8f)
                lineTo(17f, 5.11f)
                lineTo(14.1f, 5.53f)
                lineTo(12f, 3.5f)
                lineTo(9.9f, 5.53f)
                lineTo(7f, 5.11f)
                lineTo(6.5f, 8f)
                lineTo(3.9f, 9.37f)
                lineTo(5.2f, 12f)
                lineTo(3.9f, 14.63f)
                lineTo(6.5f, 16f)
                lineTo(7f, 18.89f)
                lineTo(9.9f, 18.47f)
                lineTo(12f, 20.5f)
                lineTo(14.1f, 18.47f)
                lineTo(17f, 18.89f)
                lineTo(17.5f, 16f)
                lineTo(20.1f, 14.63f)
                lineTo(18.8f, 12f)
                lineTo(20.1f, 9.37f)
                close()
            }
        }.build()

        return _SaleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SaleOutline: ImageVector? = null
