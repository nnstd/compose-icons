package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pitchfork: ImageVector
    get() {
        if (_Pitchfork != null) {
            return _Pitchfork!!
        }
        _Pitchfork = ImageVector.Builder(
            name = "Pitchfork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.9f, 0.9f)
                lineTo(13.1f, 3.7f)
                curveTo(12.3f, 4.5f, 12.3f, 5.7f, 13.1f, 6.5f)
                lineTo(14.5f, 8f)
                lineTo(9.2f, 13.4f)
                lineTo(7.8f, 12f)
                curveTo(7f, 11.2f, 5.8f, 11.2f, 5f, 12f)
                lineTo(1f, 16f)
                lineTo(2.4f, 17.4f)
                lineTo(6.4f, 13.4f)
                lineTo(7.8f, 14.8f)
                lineTo(3.8f, 18.8f)
                lineTo(5.2f, 20.2f)
                lineTo(9.2f, 16.2f)
                lineTo(10.6f, 17.6f)
                lineTo(9.9f, 18.4f)
                lineTo(6.7f, 21.6f)
                lineTo(8f, 23f)
                lineTo(12f, 19f)
                curveTo(12.8f, 18.2f, 12.8f, 17f, 12f, 16.2f)
                lineTo(10.6f, 14.8f)
                lineTo(15.9f, 9.4f)
                lineTo(17.3f, 10.8f)
                curveTo(18.1f, 11.6f, 19.3f, 11.6f, 20.1f, 10.8f)
                lineTo(23f, 8f)
                lineTo(15.9f, 0.9f)
                moveTo(18.7f, 9.4f)
                lineTo(14.5f, 5.2f)
                lineTo(15.9f, 3.8f)
                lineTo(20.1f, 8f)
                lineTo(18.7f, 9.4f)
                close()
            }
        }.build()

        return _Pitchfork!!
    }

@Suppress("ObjectPropertyName")
private var _Pitchfork: ImageVector? = null
