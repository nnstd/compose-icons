package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarOffOutline: ImageVector
    get() {
        if (_StarOffOutline != null) {
            return _StarOffOutline!!
        }
        _StarOffOutline = ImageVector.Builder(
            name = "StarOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(6.9f, 8.8f)
                lineTo(2f, 9.2f)
                lineTo(7.5f, 14f)
                lineTo(5.9f, 21f)
                lineTo(12.1f, 17.3f)
                lineTo(18.3f, 21f)
                lineTo(18f, 19.8f)
                lineTo(20.9f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(15.8f, 17.7f)
                lineTo(12f, 15.4f)
                lineTo(8.2f, 17.7f)
                lineTo(9.2f, 13.4f)
                lineTo(5.9f, 10.5f)
                lineTo(8.4f, 10.3f)
                lineTo(15.8f, 17.7f)
                moveTo(11.2f, 8f)
                lineTo(10f, 6.8f)
                lineTo(12f, 2f)
                lineTo(14.8f, 8.6f)
                lineTo(22f, 9.2f)
                lineTo(16.9f, 13.6f)
                lineTo(15.8f, 12.5f)
                lineTo(18.2f, 10.5f)
                lineTo(13.8f, 10.1f)
                lineTo(12.1f, 6.1f)
                lineTo(11.2f, 8f)
                close()
            }
        }.build()

        return _StarOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StarOffOutline: ImageVector? = null
