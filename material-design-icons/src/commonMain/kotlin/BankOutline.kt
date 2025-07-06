package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BankOutline: ImageVector
    get() {
        if (_BankOutline != null) {
            return _BankOutline!!
        }
        _BankOutline = ImageVector.Builder(
            name = "BankOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 10f)
                horizontalLineTo(4.5f)
                verticalLineTo(17f)
                horizontalLineTo(6.5f)
                verticalLineTo(10f)
                moveTo(12.5f, 10f)
                horizontalLineTo(10.5f)
                verticalLineTo(17f)
                horizontalLineTo(12.5f)
                verticalLineTo(10f)
                moveTo(21f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                moveTo(18.5f, 10f)
                horizontalLineTo(16.5f)
                verticalLineTo(17f)
                horizontalLineTo(18.5f)
                verticalLineTo(10f)
                moveTo(11.5f, 3.26f)
                lineTo(16.71f, 6f)
                horizontalLineTo(6.29f)
                lineTo(11.5f, 3.26f)
                moveTo(11.5f, 1f)
                lineTo(2f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                lineTo(11.5f, 1f)
                close()
            }
        }.build()

        return _BankOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BankOutline: ImageVector? = null
