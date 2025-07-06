package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorCellphone: ImageVector
    get() {
        if (_MonitorCellphone != null) {
            return _MonitorCellphone!!
        }
        _MonitorCellphone = ImageVector.Builder(
            name = "MonitorCellphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 22f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 21f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 11f)
                moveTo(23f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(20f)
                moveTo(20f, 2f)
                horizontalLineTo(2f)
                curveTo(0.89f, 2f, 0f, 2.89f, 0f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                curveTo(22f, 2.89f, 21.1f, 2f, 20f, 2f)
                close()
            }
        }.build()

        return _MonitorCellphone!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorCellphone: ImageVector? = null
