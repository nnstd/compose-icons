package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CartRemove: ImageVector
    get() {
        if (_CartRemove != null) {
            return _CartRemove!!
        }
        _CartRemove = ImageVector.Builder(
            name = "CartRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.1f, 8.5f)
                lineTo(12f, 6.4f)
                lineTo(9.9f, 8.5f)
                lineTo(8.5f, 7.1f)
                lineTo(10.6f, 5f)
                lineTo(8.5f, 2.9f)
                lineTo(9.9f, 1.5f)
                lineTo(12f, 3.6f)
                lineTo(14.1f, 1.5f)
                lineTo(15.5f, 2.9f)
                lineTo(13.4f, 5f)
                lineTo(15.5f, 7.1f)
                lineTo(14.1f, 8.5f)
                moveTo(7f, 18f)
                curveTo(8.1f, 18f, 9f, 18.9f, 9f, 20f)
                reflectiveCurveTo(8.1f, 22f, 7f, 22f)
                reflectiveCurveTo(5f, 21.1f, 5f, 20f)
                reflectiveCurveTo(5.9f, 18f, 7f, 18f)
                moveTo(17f, 18f)
                curveTo(18.1f, 18f, 19f, 18.9f, 19f, 20f)
                reflectiveCurveTo(18.1f, 22f, 17f, 22f)
                reflectiveCurveTo(15f, 21.1f, 15f, 20f)
                reflectiveCurveTo(15.9f, 18f, 17f, 18f)
                moveTo(7.2f, 14.8f)
                curveTo(7.2f, 14.9f, 7.3f, 15f, 7.4f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                curveTo(5.9f, 17f, 5f, 16.1f, 5f, 15f)
                curveTo(5f, 14.6f, 5.1f, 14.3f, 5.2f, 14f)
                lineTo(6.5f, 11.6f)
                lineTo(3f, 4f)
                horizontalLineTo(1f)
                verticalLineTo(2f)
                horizontalLineTo(4.3f)
                lineTo(8.6f, 11f)
                horizontalLineTo(15.6f)
                lineTo(19.5f, 4f)
                lineTo(21.2f, 5f)
                lineTo(17.3f, 12f)
                curveTo(17f, 12.6f, 16.3f, 13f, 15.6f, 13f)
                horizontalLineTo(8.1f)
                lineTo(7.2f, 14.6f)
                verticalLineTo(14.8f)
                close()
            }
        }.build()

        return _CartRemove!!
    }

@Suppress("ObjectPropertyName")
private var _CartRemove: ImageVector? = null
