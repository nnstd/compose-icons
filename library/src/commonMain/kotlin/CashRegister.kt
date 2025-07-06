package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashRegister: ImageVector
    get() {
        if (_CashRegister != null) {
            return _CashRegister!!
        }
        _CashRegister = ImageVector.Builder(
            name = "CashRegister",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                moveTo(6.25f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(17.8f)
                curveTo(18.8f, 7f, 19.8f, 8f, 20f, 9f)
                lineTo(20.5f, 16f)
                horizontalLineTo(3.5f)
                lineTo(4.05f, 9f)
                curveTo(4.05f, 8f, 5.05f, 7f, 6.25f, 7f)
                moveTo(13f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(6f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                moveTo(9f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                moveTo(6f, 11f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                moveTo(9f, 11f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                moveTo(6f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                moveTo(9f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                moveTo(7f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _CashRegister!!
    }

@Suppress("ObjectPropertyName")
private var _CashRegister: ImageVector? = null
