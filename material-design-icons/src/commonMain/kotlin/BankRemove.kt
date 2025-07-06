package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BankRemove: ImageVector
    get() {
        if (_BankRemove != null) {
            return _BankRemove!!
        }
        _BankRemove = ImageVector.Builder(
            name = "BankRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.46f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18f, 16.59f)
                lineTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.46f, 20.12f)
                lineTo(16.59f, 18f)
                lineTo(14.46f, 15.88f)
                moveTo(11.5f, 1f)
                lineTo(21f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                lineTo(11.5f, 1f)
                moveTo(16f, 10f)
                horizontalLineTo(19f)
                verticalLineTo(12.08f)
                lineTo(18f, 12f)
                curveTo(17.3f, 12f, 16.63f, 12.12f, 16f, 12.34f)
                verticalLineTo(10f)
                moveTo(2f, 22f)
                verticalLineTo(19f)
                horizontalLineTo(12.08f)
                curveTo(12.27f, 20.14f, 12.79f, 21.17f, 13.53f, 22f)
                horizontalLineTo(2f)
                moveTo(10f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(14.68f)
                curveTo(12.54f, 15.37f, 12.22f, 16.15f, 12.08f, 17f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                moveTo(4f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _BankRemove!!
    }

@Suppress("ObjectPropertyName")
private var _BankRemove: ImageVector? = null
