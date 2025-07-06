package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Asterisk: ImageVector
    get() {
        if (_Asterisk != null) {
            return _Asterisk!!
        }
        _Asterisk = ImageVector.Builder(
            name = "Asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13f)
                horizontalLineTo(14.4f)
                lineTo(19.1f, 17.7f)
                lineTo(17.7f, 19.1f)
                lineTo(13f, 14.4f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(14.3f)
                lineTo(6.3f, 19f)
                lineTo(4.9f, 17.6f)
                lineTo(9.4f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(9.6f)
                lineTo(4.9f, 6.3f)
                lineTo(6.3f, 4.9f)
                lineTo(11f, 9.6f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(9.4f)
                lineTo(17.6f, 4.8f)
                lineTo(19f, 6.3f)
                lineTo(14.3f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Asterisk!!
    }

@Suppress("ObjectPropertyName")
private var _Asterisk: ImageVector? = null
