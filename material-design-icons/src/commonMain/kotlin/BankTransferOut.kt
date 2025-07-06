package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BankTransferOut: ImageVector
    get() {
        if (_BankTransferOut != null) {
            return _BankTransferOut!!
        }
        _BankTransferOut = ImageVector.Builder(
            name = "BankTransferOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                lineTo(22f, 13.5f)
                lineTo(18f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                moveTo(14f, 8.7f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(8.7f)
                lineTo(8f, 5f)
                lineTo(14f, 8.7f)
                moveTo(2f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                moveTo(7f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(3f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _BankTransferOut!!
    }

@Suppress("ObjectPropertyName")
private var _BankTransferOut: ImageVector? = null
