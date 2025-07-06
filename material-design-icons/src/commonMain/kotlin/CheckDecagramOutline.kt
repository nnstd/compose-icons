package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckDecagramOutline: ImageVector
    get() {
        if (_CheckDecagramOutline != null) {
            return _CheckDecagramOutline!!
        }
        _CheckDecagramOutline = ImageVector.Builder(
            name = "CheckDecagramOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                lineTo(20.6f, 9.2f)
                lineTo(20.9f, 5.5f)
                lineTo(17.3f, 4.7f)
                lineTo(15.4f, 1.5f)
                lineTo(12f, 3f)
                lineTo(8.6f, 1.5f)
                lineTo(6.7f, 4.7f)
                lineTo(3.1f, 5.5f)
                lineTo(3.4f, 9.2f)
                lineTo(1f, 12f)
                lineTo(3.4f, 14.8f)
                lineTo(3.1f, 18.5f)
                lineTo(6.7f, 19.3f)
                lineTo(8.6f, 22.5f)
                lineTo(12f, 21f)
                lineTo(15.4f, 22.5f)
                lineTo(17.3f, 19.3f)
                lineTo(20.9f, 18.5f)
                lineTo(20.6f, 14.8f)
                lineTo(23f, 12f)
                moveTo(18.7f, 16.9f)
                lineTo(16f, 17.5f)
                lineTo(14.6f, 19.9f)
                lineTo(12f, 18.8f)
                lineTo(9.4f, 19.9f)
                lineTo(8f, 17.5f)
                lineTo(5.3f, 16.9f)
                lineTo(5.5f, 14.1f)
                lineTo(3.7f, 12f)
                lineTo(5.5f, 9.9f)
                lineTo(5.3f, 7.1f)
                lineTo(8f, 6.5f)
                lineTo(9.4f, 4.1f)
                lineTo(12f, 5.2f)
                lineTo(14.6f, 4.1f)
                lineTo(16f, 6.5f)
                lineTo(18.7f, 7.1f)
                lineTo(18.5f, 9.9f)
                lineTo(20.3f, 12f)
                lineTo(18.5f, 14.1f)
                lineTo(18.7f, 16.9f)
                moveTo(16.6f, 7.6f)
                lineTo(18f, 9f)
                lineTo(10f, 17f)
                lineTo(6f, 13f)
                lineTo(7.4f, 11.6f)
                lineTo(10f, 14.2f)
                lineTo(16.6f, 7.6f)
                close()
            }
        }.build()

        return _CheckDecagramOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckDecagramOutline: ImageVector? = null
