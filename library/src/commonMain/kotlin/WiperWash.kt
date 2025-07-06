package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WiperWash: ImageVector
    get() {
        if (_WiperWash != null) {
            return _WiperWash!!
        }
        _WiperWash = ImageVector.Builder(
            name = "WiperWash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6f)
                curveTo(13f, 5.7f, 13.1f, 4.6f, 13.8f, 3.8f)
                lineTo(12f, 2.4f)
                lineTo(10.2f, 3.9f)
                curveTo(10.9f, 4.6f, 11f, 5.7f, 11f, 6f)
                curveTo(4.7f, 6.4f, 2f, 11f, 2f, 11f)
                lineTo(9f, 18f)
                curveTo(9f, 18f, 9.7f, 16.7f, 11f, 16.2f)
                verticalLineTo(18.3f)
                curveTo(10.4f, 18.6f, 10f, 19.3f, 10f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 20f)
                curveTo(14f, 19.3f, 13.6f, 18.6f, 13f, 18.3f)
                verticalLineTo(16.2f)
                curveTo(14.3f, 16.7f, 15f, 18f, 15f, 18f)
                lineTo(22f, 11f)
                curveTo(22f, 11f, 19.3f, 6.5f, 13f, 6f)
                moveTo(11f, 14.1f)
                curveTo(10.2f, 14.3f, 9.5f, 14.6f, 8.9f, 15.1f)
                lineTo(4.7f, 10.9f)
                curveTo(5.8f, 9.8f, 7.8f, 8.3f, 11f, 8.1f)
                verticalLineTo(14.1f)
                moveTo(15.1f, 15.1f)
                curveTo(14.5f, 14.7f, 13.8f, 14.3f, 13f, 14.1f)
                verticalLineTo(8.1f)
                curveTo(16.2f, 8.4f, 18.2f, 9.8f, 19.3f, 10.9f)
                lineTo(15.1f, 15.1f)
                moveTo(18f, 1.3f)
                lineTo(17.3f, 3.2f)
                curveTo(16.6f, 2.9f, 15.5f, 2.9f, 14.7f, 3.2f)
                lineTo(14f, 1.3f)
                curveTo(15.2f, 0.9f, 16.8f, 0.9f, 18f, 1.3f)
                moveTo(21f, 6f)
                horizontalLineTo(19f)
                curveTo(19f, 6f, 19f, 4.7f, 18.2f, 3.9f)
                lineTo(19.7f, 2.6f)
                curveTo(21f, 4f, 21f, 5.9f, 21f, 6f)
                moveTo(4.2f, 2.6f)
                lineTo(5.7f, 3.9f)
                curveTo(5f, 4.7f, 5f, 6f, 5f, 6f)
                horizontalLineTo(3f)
                curveTo(3f, 5.9f, 3f, 4f, 4.2f, 2.6f)
                moveTo(10f, 1.3f)
                lineTo(9.3f, 3.2f)
                curveTo(8.6f, 2.9f, 7.5f, 2.9f, 6.7f, 3.2f)
                lineTo(6f, 1.3f)
                curveTo(7.2f, 0.9f, 8.8f, 0.9f, 10f, 1.3f)
                close()
            }
        }.build()

        return _WiperWash!!
    }

@Suppress("ObjectPropertyName")
private var _WiperWash: ImageVector? = null
