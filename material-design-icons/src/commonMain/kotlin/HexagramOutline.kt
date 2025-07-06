package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HexagramOutline: ImageVector
    get() {
        if (_HexagramOutline != null) {
            return _HexagramOutline!!
        }
        _HexagramOutline = ImageVector.Builder(
            name = "HexagramOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                lineTo(13.3f, 9.8f)
                lineTo(16.5f, 9.4f)
                lineTo(14.5f, 12f)
                lineTo(16.4f, 14.5f)
                lineTo(13.2f, 14.1f)
                lineTo(12f, 17f)
                lineTo(10.7f, 14.2f)
                lineTo(7.5f, 14.6f)
                lineTo(9.5f, 12f)
                lineTo(7.6f, 9.5f)
                lineTo(10.8f, 9.9f)
                lineTo(12f, 7f)
                moveTo(12f, 2f)
                lineTo(9.5f, 7.7f)
                lineTo(3.3f, 7f)
                lineTo(7f, 12f)
                lineTo(3.4f, 17f)
                lineTo(9.6f, 16.3f)
                lineTo(12f, 22f)
                lineTo(14.5f, 16.3f)
                lineTo(20.7f, 16.9f)
                lineTo(17f, 12f)
                lineTo(20.6f, 7f)
                lineTo(14.4f, 7.7f)
                lineTo(12f, 2f)
                close()
            }
        }.build()

        return _HexagramOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HexagramOutline: ImageVector? = null
