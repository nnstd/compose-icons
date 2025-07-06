package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagCarryOnCheck: ImageVector
    get() {
        if (_BagCarryOnCheck != null) {
            return _BagCarryOnCheck!!
        }
        _BagCarryOnCheck = ImageVector.Builder(
            name = "BagCarryOnCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.28f, 16.69f)
                lineTo(18.14f, 13.88f)
                lineTo(18.84f, 14.58f)
                lineTo(15.28f, 18.14f)
                lineTo(13.17f, 16f)
                lineTo(13.88f, 15.28f)
                lineTo(15.28f, 16.69f)
                moveTo(8f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 7f)
                verticalLineTo(21f)
                moveTo(9f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 16f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 22f)
                curveTo(14.77f, 22f, 13.63f, 21.63f, 12.68f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                moveTo(16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 20f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 12f)
                close()
            }
        }.build()

        return _BagCarryOnCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BagCarryOnCheck: ImageVector? = null
