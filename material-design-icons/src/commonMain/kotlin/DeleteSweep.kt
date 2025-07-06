package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeleteSweep: ImageVector
    get() {
        if (_DeleteSweep != null) {
            return _DeleteSweep!!
        }
        _DeleteSweep = ImageVector.Builder(
            name = "DeleteSweep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 16f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                moveTo(15f, 8f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                moveTo(15f, 12f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                moveTo(3f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                moveTo(14f, 5f)
                horizontalLineTo(11f)
                lineTo(10f, 4f)
                horizontalLineTo(6f)
                lineTo(5f, 5f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _DeleteSweep!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteSweep: ImageVector? = null
