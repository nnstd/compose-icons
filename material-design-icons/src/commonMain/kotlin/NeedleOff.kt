package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NeedleOff: ImageVector
    get() {
        if (_NeedleOff != null) {
            return _NeedleOff!!
        }
        _NeedleOff = ImageVector.Builder(
            name = "NeedleOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(8f, 9.9f)
                lineTo(4.1f, 13.8f)
                lineTo(6.2f, 15.9f)
                lineTo(3.1f, 19f)
                verticalLineTo(21.8f)
                lineTo(7.6f, 17.3f)
                lineTo(9.7f, 19.4f)
                lineTo(13.6f, 15.5f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(11.2f, 15.2f)
                lineTo(9.8f, 16.6f)
                lineTo(7f, 13.8f)
                lineTo(9.5f, 11.3f)
                lineTo(10.9f, 12.7f)
                lineTo(9.8f, 13.8f)
                lineTo(11.2f, 15.2f)
                moveTo(11.9f, 8.7f)
                lineTo(10.5f, 7.3f)
                lineTo(14f, 3.9f)
                lineTo(16.1f, 6f)
                lineTo(17.5f, 4.6f)
                lineTo(16.1f, 3.2f)
                lineTo(17.5f, 1.8f)
                lineTo(21.8f, 6f)
                lineTo(20.4f, 7.4f)
                lineTo(18.9f, 6f)
                lineTo(17.5f, 7.4f)
                lineTo(19.6f, 9.5f)
                lineTo(16.2f, 13f)
                lineTo(13.4f, 10.2f)
                lineTo(14f, 9.5f)
                lineTo(15.4f, 10.9f)
                lineTo(16.8f, 9.5f)
                lineTo(14f, 6.7f)
                lineTo(11.9f, 8.7f)
                close()
            }
        }.build()

        return _NeedleOff!!
    }

@Suppress("ObjectPropertyName")
private var _NeedleOff: ImageVector? = null
