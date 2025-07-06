package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneSound: ImageVector
    get() {
        if (_CellphoneSound != null) {
            return _CellphoneSound!!
        }
        _CellphoneSound = ImageVector.Builder(
            name = "CellphoneSound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.1f, 8.7f)
                curveTo(20.9f, 10.5f, 20.9f, 13.3f, 19.1f, 15.2f)
                lineTo(20.1f, 16.2f)
                curveTo(22.6f, 13.9f, 22.6f, 10.1f, 20.1f, 7.7f)
                lineTo(19.1f, 8.7f)
                moveTo(18f, 9.8f)
                lineTo(17f, 10.8f)
                curveTo(17.5f, 11.5f, 17.5f, 12.4f, 17f, 13.1f)
                lineTo(18f, 14.1f)
                curveTo(19.2f, 12.9f, 19.2f, 11.1f, 18f, 9.8f)
                moveTo(14f, 1f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 23f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 21f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 1f)
                moveTo(14f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _CellphoneSound!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneSound: ImageVector? = null
