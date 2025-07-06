package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AutoDownload: ImageVector
    get() {
        if (_AutoDownload != null) {
            return _AutoDownload!!
        }
        _AutoDownload = ImageVector.Builder(
            name = "AutoDownload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                moveTo(19f, 4.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(22f)
                lineTo(16.5f, 15f)
                lineTo(11f, 9.5f)
                horizontalLineTo(14f)
                verticalLineTo(4.5f)
                horizontalLineTo(19f)
                moveTo(10.7f, 15f)
                horizontalLineTo(8.8f)
                lineTo(8.1f, 13f)
                horizontalLineTo(4.9f)
                lineTo(4.2f, 15f)
                horizontalLineTo(2.3f)
                lineTo(5.5f, 6f)
                horizontalLineTo(7.5f)
                lineTo(10.7f, 15f)
                moveTo(7.65f, 11.65f)
                lineTo(6.5f, 8f)
                lineTo(5.35f, 11.65f)
                horizontalLineTo(7.65f)
                close()
            }
        }.build()

        return _AutoDownload!!
    }

@Suppress("ObjectPropertyName")
private var _AutoDownload: ImageVector? = null
