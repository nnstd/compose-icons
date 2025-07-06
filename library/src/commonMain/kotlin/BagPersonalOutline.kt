package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagPersonalOutline: ImageVector
    get() {
        if (_BagPersonalOutline != null) {
            return _BagPersonalOutline!!
        }
        _BagPersonalOutline = ImageVector.Builder(
            name = "BagPersonalOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 5f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 2f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4f)
                verticalLineTo(5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 9f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 5f)
                moveTo(10f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                moveTo(12f, 9f)
                lineTo(14f, 11f)
                lineTo(12f, 13f)
                lineTo(10f, 11f)
                lineTo(12f, 9f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(18f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 7f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _BagPersonalOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BagPersonalOutline: ImageVector? = null
