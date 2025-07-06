package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneOffOutline: ImageVector
    get() {
        if (_PhoneOffOutline != null) {
            return _PhoneOffOutline!!
        }
        _PhoneOffOutline = ImageVector.Builder(
            name = "PhoneOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.4f, 17f)
                curveTo(17.2f, 17.2f, 18.1f, 17.4f, 19f, 17.5f)
                verticalLineTo(19f)
                curveTo(17.7f, 18.9f, 16.4f, 18.7f, 15.2f, 18.2f)
                lineTo(16.4f, 17f)
                moveTo(20.2f, 2.5f)
                lineTo(2.5f, 20.2f)
                lineTo(3.8f, 21.5f)
                lineTo(8.7f, 16.6f)
                curveTo(11.8f, 19.4f, 15.8f, 21f, 20f, 21f)
                curveTo(20.6f, 21f, 21f, 20.6f, 21f, 20f)
                verticalLineTo(16.5f)
                curveTo(21f, 15.9f, 20.6f, 15.5f, 20f, 15.5f)
                curveTo(18.8f, 15.5f, 17.5f, 15.3f, 16.4f, 14.9f)
                horizontalLineTo(16.1f)
                curveTo(15.8f, 14.9f, 15.6f, 15f, 15.4f, 15.2f)
                lineTo(13.2f, 17.4f)
                curveTo(12.1f, 16.8f, 11f, 16.1f, 10.1f, 15.2f)
                lineTo(21.5f, 3.8f)
                lineTo(20.2f, 2.5f)
                moveTo(6.5f, 5f)
                curveTo(6.6f, 5.9f, 6.8f, 6.8f, 7f, 7.6f)
                lineTo(5.8f, 8.8f)
                curveTo(5.4f, 7.6f, 5.1f, 6.3f, 5f, 5f)
                horizontalLineTo(6.5f)
                moveTo(7.5f, 3f)
                horizontalLineTo(4f)
                curveTo(3.4f, 3f, 3f, 3.4f, 3f, 4f)
                curveTo(3f, 7.6f, 4.1f, 11f, 6.2f, 13.9f)
                lineTo(7.6f, 12.5f)
                curveTo(7.2f, 12f, 6.9f, 11.4f, 6.6f, 10.8f)
                lineTo(8.8f, 8.6f)
                curveTo(9.1f, 8.3f, 9.2f, 7.9f, 9f, 7.6f)
                curveTo(8.7f, 6.4f, 8.5f, 5.2f, 8.5f, 4f)
                curveTo(8.5f, 3.4f, 8.1f, 3f, 7.5f, 3f)
                close()
            }
        }.build()

        return _PhoneOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneOffOutline: ImageVector? = null
