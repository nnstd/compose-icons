package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneLink: ImageVector
    get() {
        if (_CellphoneLink != null) {
            return _CellphoneLink!!
        }
        _CellphoneLink = ImageVector.Builder(
            name = "CellphoneLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                moveTo(23f, 8f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 9f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 20f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 8f)
                moveTo(4f, 6f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(17f)
                horizontalLineTo(0f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _CellphoneLink!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneLink: ImageVector? = null
