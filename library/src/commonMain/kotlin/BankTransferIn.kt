package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BankTransferIn: ImageVector
    get() {
        if (_BankTransferIn != null) {
            return _BankTransferIn!!
        }
        _BankTransferIn = ImageVector.Builder(
            name = "BankTransferIn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 15f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                lineTo(9f, 13.5f)
                lineTo(5f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                moveTo(22f, 8.7f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(8.7f)
                lineTo(16f, 5f)
                lineTo(22f, 8.7f)
                moveTo(10f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                moveTo(15f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                moveTo(19f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _BankTransferIn!!
    }

@Suppress("ObjectPropertyName")
private var _BankTransferIn: ImageVector? = null
