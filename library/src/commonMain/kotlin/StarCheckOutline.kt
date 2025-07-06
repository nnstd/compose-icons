package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarCheckOutline: ImageVector
    get() {
        if (_StarCheckOutline != null) {
            return _StarCheckOutline!!
        }
        _StarCheckOutline = ImageVector.Builder(
            name = "StarCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.8f, 21f)
                lineTo(7.4f, 14f)
                lineTo(2f, 9.2f)
                lineTo(9.2f, 8.6f)
                lineTo(12f, 2f)
                lineTo(14.8f, 8.6f)
                lineTo(22f, 9.2f)
                lineTo(18.8f, 12f)
                horizontalLineTo(18f)
                curveTo(17.3f, 12f, 16.6f, 12.1f, 15.9f, 12.4f)
                lineTo(18.1f, 10.5f)
                lineTo(13.7f, 10.1f)
                lineTo(12f, 6.1f)
                lineTo(10.3f, 10.1f)
                lineTo(5.9f, 10.5f)
                lineTo(9.2f, 13.4f)
                lineTo(8.2f, 17.7f)
                lineTo(12f, 15.4f)
                lineTo(12.5f, 15.7f)
                curveTo(12.3f, 16.2f, 12.1f, 16.8f, 12.1f, 17.3f)
                lineTo(5.8f, 21f)
                moveTo(17.8f, 21.2f)
                lineTo(15f, 18.2f)
                lineTo(16.2f, 17f)
                lineTo(17.8f, 18.6f)
                lineTo(21.4f, 15f)
                lineTo(22.6f, 16.4f)
                lineTo(17.8f, 21.2f)
            }
        }.build()

        return _StarCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StarCheckOutline: ImageVector? = null
