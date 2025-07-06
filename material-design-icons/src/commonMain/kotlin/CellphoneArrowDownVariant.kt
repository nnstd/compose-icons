package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneArrowDownVariant: ImageVector
    get() {
        if (_CellphoneArrowDownVariant != null) {
            return _CellphoneArrowDownVariant!!
        }
        _CellphoneArrowDownVariant = ImageVector.Builder(
            name = "CellphoneArrowDownVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14f)
                lineTo(23f, 9f)
                lineTo(21.6f, 7.6f)
                lineTo(19f, 10.2f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                verticalLineTo(10.2f)
                lineTo(14.4f, 7.6f)
                lineTo(13f, 9f)
                lineTo(18f, 14f)
                moveTo(19f, 16f)
                verticalLineTo(21f)
                curveTo(19f, 22.1f, 18.1f, 23f, 17f, 23f)
                horizontalLineTo(7f)
                curveTo(5.9f, 23f, 5f, 22.1f, 5f, 21f)
                verticalLineTo(3f)
                curveTo(5f, 1.9f, 5.9f, 1f, 7f, 1f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _CellphoneArrowDownVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneArrowDownVariant: ImageVector? = null
