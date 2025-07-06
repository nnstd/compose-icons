package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Wiper: ImageVector
    get() {
        if (_Wiper != null) {
            return _Wiper!!
        }
        _Wiper = ImageVector.Builder(
            name = "Wiper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(5f, 4f, 2f, 9f, 2f, 9f)
                lineTo(9f, 16f)
                curveTo(9f, 16f, 9.5f, 15.1f, 10.4f, 14.5f)
                lineTo(10.7f, 16.5f)
                curveTo(10.3f, 16.8f, 10f, 17.4f, 10f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 18f)
                curveTo(14f, 17.1f, 13.5f, 16.4f, 12.7f, 16.1f)
                lineTo(12.3f, 14f)
                curveTo(14.1f, 14.2f, 15f, 16f, 15f, 16f)
                lineTo(22f, 9f)
                curveTo(22f, 9f, 19f, 4f, 12f, 4f)
                moveTo(15.1f, 13.1f)
                curveTo(14.3f, 12.5f, 13.3f, 12f, 12f, 12f)
                lineTo(11f, 6.1f)
                curveTo(11.3f, 6f, 11.7f, 6f, 12f, 6f)
                curveTo(15.7f, 6f, 18.1f, 7.7f, 19.3f, 8.9f)
                lineTo(15.1f, 13.1f)
                moveTo(8.9f, 13.1f)
                lineTo(4.7f, 8.9f)
                curveTo(5.5f, 8f, 7f, 7f, 9f, 6.4f)
                lineTo(10f, 12.4f)
                curveTo(9.6f, 12.6f, 9.2f, 12.8f, 8.9f, 13.1f)
                close()
            }
        }.build()

        return _Wiper!!
    }

@Suppress("ObjectPropertyName")
private var _Wiper: ImageVector? = null
