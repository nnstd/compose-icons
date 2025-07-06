package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorDashboard: ImageVector
    get() {
        if (_MonitorDashboard != null) {
            return _MonitorDashboard!!
        }
        _MonitorDashboard = ImageVector.Builder(
            name = "MonitorDashboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                moveTo(21f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                curveTo(1.89f, 18f, 1f, 17.1f, 1f, 16f)
                verticalLineTo(4f)
                curveTo(1f, 2.89f, 1.89f, 2f, 3f, 2f)
                horizontalLineTo(21f)
                moveTo(5f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                moveTo(15f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                moveTo(19f, 9f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                moveTo(5f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                moveTo(10f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _MonitorDashboard!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorDashboard: ImageVector? = null
