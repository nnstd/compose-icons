package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BankCheck: ImageVector
    get() {
        if (_BankCheck != null) {
            return _BankCheck!!
        }
        _BankCheck = ImageVector.Builder(
            name = "BankCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.8f, 21.2f)
                lineTo(15f, 18.2f)
                lineTo(16.2f, 17f)
                lineTo(17.8f, 18.6f)
                lineTo(21.4f, 15f)
                lineTo(22.6f, 16.4f)
                lineTo(17.8f, 21.2f)
                moveTo(13f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(12.1f)
                curveTo(12.2f, 16.2f, 12.6f, 15.4f, 13f, 14.7f)
                verticalLineTo(10f)
                moveTo(16f, 10f)
                verticalLineTo(12.3f)
                curveTo(16.6f, 12.1f, 17.3f, 12f, 18f, 12f)
                curveTo(18.3f, 12f, 18.7f, 12f, 19f, 12.1f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                moveTo(12.1f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(13.5f)
                curveTo(12.8f, 21.2f, 12.3f, 20.1f, 12.1f, 19f)
                moveTo(21f, 6f)
                lineTo(11.5f, 1f)
                lineTo(2f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                moveTo(7f, 17f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _BankCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BankCheck: ImageVector? = null
