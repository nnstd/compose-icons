package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeBottom: ImageVector
    get() {
        if (_FridgeBottom != null) {
            return _FridgeBottom!!
        }
        _FridgeBottom = ImageVector.Builder(
            name = "FridgeBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 4f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 2f)
                horizontalLineTo(7f)
                moveTo(8f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                moveTo(7f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(8f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _FridgeBottom!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeBottom: ImageVector? = null
