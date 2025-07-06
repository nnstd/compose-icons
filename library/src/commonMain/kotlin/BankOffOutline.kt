package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BankOffOutline: ImageVector
    get() {
        if (_BankOffOutline != null) {
            return _BankOffOutline!!
        }
        _BankOffOutline = ImageVector.Builder(
            name = "BankOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(19.1f, 21f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(17.1f)
                lineTo(12.5f, 14.4f)
                verticalLineTo(17f)
                horizontalLineTo(10.5f)
                verticalLineTo(12.4f)
                lineTo(6.1f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                lineTo(3.4f, 5.3f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(4.5f, 10f)
                verticalLineTo(17f)
                horizontalLineTo(6.5f)
                verticalLineTo(10f)
                horizontalLineTo(4.5f)
                moveTo(11.5f, 3.3f)
                lineTo(16.7f, 6f)
                horizontalLineTo(9.2f)
                lineTo(11.2f, 8f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                lineTo(11.5f, 1f)
                lineTo(6.7f, 3.5f)
                lineTo(8.2f, 5f)
                lineTo(11.5f, 3.3f)
                moveTo(18.5f, 15.3f)
                verticalLineTo(10f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.3f)
                lineTo(18.5f, 15.3f)
                close()
            }
        }.build()

        return _BankOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BankOffOutline: ImageVector? = null
