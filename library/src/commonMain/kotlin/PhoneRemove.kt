package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneRemove: ImageVector
    get() {
        if (_PhoneRemove != null) {
            return _PhoneRemove!!
        }
        _PhoneRemove = ImageVector.Builder(
            name = "PhoneRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                curveTo(3.4f, 3f, 3f, 3.4f, 3f, 4f)
                curveTo(3f, 13.4f, 10.6f, 21f, 20f, 21f)
                curveTo(20.6f, 21f, 21f, 20.6f, 21f, 20f)
                verticalLineTo(16.5f)
                curveTo(21f, 15.9f, 20.6f, 15.5f, 20f, 15.5f)
                curveTo(18.8f, 15.5f, 17.5f, 15.3f, 16.4f, 14.9f)
                curveTo(16f, 14.8f, 15.7f, 14.9f, 15.4f, 15.1f)
                lineTo(13.2f, 17.3f)
                curveTo(10.4f, 15.9f, 8.1f, 13.5f, 6.6f, 10.7f)
                lineTo(8.8f, 8.5f)
                curveTo(9.1f, 8.2f, 9.2f, 7.8f, 9f, 7.5f)
                curveTo(8.7f, 6.4f, 8.5f, 5.2f, 8.5f, 4f)
                curveTo(8.5f, 3.4f, 8.1f, 3f, 7.5f, 3f)
                moveTo(19.1f, 3.5f)
                lineTo(17f, 5.6f)
                lineTo(14.9f, 3.5f)
                lineTo(13.5f, 4.9f)
                lineTo(15.6f, 7f)
                lineTo(13.5f, 9.1f)
                lineTo(14.9f, 10.5f)
                lineTo(17f, 8.4f)
                lineTo(19.1f, 10.5f)
                lineTo(20.5f, 9.1f)
                lineTo(18.4f, 7f)
                lineTo(20.5f, 4.9f)
            }
        }.build()

        return _PhoneRemove!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneRemove: ImageVector? = null
