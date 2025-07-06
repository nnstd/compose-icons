package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FridgeTop: ImageVector
    get() {
        if (_FridgeTop != null) {
            return _FridgeTop!!
        }
        _FridgeTop = ImageVector.Builder(
            name = "FridgeTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 4f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 19f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                moveTo(7f, 4f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                moveTo(8f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _FridgeTop!!
    }

@Suppress("ObjectPropertyName")
private var _FridgeTop: ImageVector? = null
