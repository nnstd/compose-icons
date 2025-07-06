package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BankOff: ImageVector
    get() {
        if (_BankOff != null) {
            return _BankOff!!
        }
        _BankOff = ImageVector.Builder(
            name = "BankOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(20.1f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(17.1f)
                lineTo(13f, 14.9f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(11.9f)
                lineTo(6.1f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                lineTo(3.4f, 5.3f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(4f, 10f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                moveTo(21f, 8f)
                verticalLineTo(6f)
                lineTo(11.5f, 1f)
                lineTo(6.7f, 3.5f)
                lineTo(11.2f, 8f)
                horizontalLineTo(21f)
                moveTo(19f, 15.8f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(12.8f)
                lineTo(19f, 15.8f)
                close()
            }
        }.build()

        return _BankOff!!
    }

@Suppress("ObjectPropertyName")
private var _BankOff: ImageVector? = null
