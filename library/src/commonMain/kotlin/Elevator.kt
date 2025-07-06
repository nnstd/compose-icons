package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Elevator: ImageVector
    get() {
        if (_Elevator != null) {
            return _Elevator!!
        }
        _Elevator = ImageVector.Builder(
            name = "Elevator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                lineTo(11f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                lineTo(7f, 2f)
                moveTo(17f, 10f)
                lineTo(13f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                lineTo(17f, 10f)
                moveTo(7f, 12f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 22f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 20f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                moveTo(7f, 14f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Elevator!!
    }

@Suppress("ObjectPropertyName")
private var _Elevator: ImageVector? = null
