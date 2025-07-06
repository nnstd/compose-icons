package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BankTransfer: ImageVector
    get() {
        if (_BankTransfer != null) {
            return _BankTransfer!!
        }
        _BankTransfer = ImageVector.Builder(
            name = "BankTransfer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                lineTo(22f, 12.5f)
                lineTo(18f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                moveTo(14f, 7.7f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(7.7f)
                lineTo(8f, 4f)
                lineTo(14f, 7.7f)
                moveTo(7f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                moveTo(3f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                moveTo(13f, 10f)
                verticalLineTo(12.5f)
                lineTo(11f, 14.3f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                moveTo(9.1f, 16f)
                lineTo(8.5f, 16.5f)
                lineTo(10.2f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(9.1f)
                moveTo(17f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                lineTo(10f, 16.5f)
                lineTo(14f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _BankTransfer!!
    }

@Suppress("ObjectPropertyName")
private var _BankTransfer: ImageVector? = null
