package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneDock: ImageVector
    get() {
        if (_CellphoneDock != null) {
            return _CellphoneDock!!
        }
        _CellphoneDock = ImageVector.Builder(
            name = "CellphoneDock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                moveTo(16f, 1f)
                horizontalLineTo(8f)
                curveTo(6.89f, 1f, 6f, 1.89f, 6f, 3f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 19f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 17f)
                verticalLineTo(3f)
                curveTo(18f, 1.89f, 17.1f, 1f, 16f, 1f)
                moveTo(8f, 23f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineTo(23f)
                close()
            }
        }.build()

        return _CellphoneDock!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneDock: ImageVector? = null
