package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Qrcode: ImageVector
    get() {
        if (_Qrcode != null) {
            return _Qrcode!!
        }
        _Qrcode = ImageVector.Builder(
            name = "Qrcode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(11f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                moveTo(9f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                moveTo(15f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                moveTo(19f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                moveTo(15f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                moveTo(17f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                moveTo(3f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(3f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                moveTo(5f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _Qrcode!!
    }

@Suppress("ObjectPropertyName")
private var _Qrcode: ImageVector? = null
