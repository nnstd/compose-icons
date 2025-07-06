package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneCharging: ImageVector
    get() {
        if (_CellphoneCharging != null) {
            return _CellphoneCharging!!
        }
        _CellphoneCharging = ImageVector.Builder(
            name = "CellphoneCharging",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 18.5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                lineTo(13f, 5.5f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                moveTo(17f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                moveTo(17f, 1f)
                horizontalLineTo(7f)
                curveTo(5.89f, 1f, 5f, 1.89f, 5f, 3f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 23f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 21f)
                verticalLineTo(3f)
                curveTo(19f, 1.89f, 18.1f, 1f, 17f, 1f)
                close()
            }
        }.build()

        return _CellphoneCharging!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneCharging: ImageVector? = null
