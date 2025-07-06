package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneBasic: ImageVector
    get() {
        if (_CellphoneBasic != null) {
            return _CellphoneBasic!!
        }
        _CellphoneBasic = ImageVector.Builder(
            name = "CellphoneBasic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                curveTo(8.89f, 6f, 8f, 6.89f, 8f, 8f)
                verticalLineTo(20f)
                curveTo(8f, 21.11f, 8.89f, 22f, 10f, 22f)
                horizontalLineTo(15f)
                curveTo(16.11f, 22f, 17f, 21.11f, 17f, 20f)
                verticalLineTo(8f)
                curveTo(17f, 7.26f, 16.6f, 6.62f, 16f, 6.28f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 2f)
                moveTo(10f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                moveTo(10f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                moveTo(12f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                moveTo(14f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                moveTo(10f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                moveTo(12f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                moveTo(14f, 17f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                moveTo(10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                moveTo(12f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                verticalLineTo(19f)
                moveTo(14f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _CellphoneBasic!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneBasic: ImageVector? = null
