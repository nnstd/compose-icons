package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TabletDashboard: ImageVector
    get() {
        if (_TabletDashboard != null) {
            return _TabletDashboard!!
        }
        _TabletDashboard = ImageVector.Builder(
            name = "TabletDashboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                moveTo(21f, 4f)
                horizontalLineTo(3f)
                curveTo(1.89f, 4f, 1f, 4.89f, 1f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 18f)
                verticalLineTo(6f)
                curveTo(23f, 4.89f, 22.1f, 4f, 21f, 4f)
                moveTo(7f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                moveTo(14f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                moveTo(17f, 11f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                moveTo(7f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _TabletDashboard!!
    }

@Suppress("ObjectPropertyName")
private var _TabletDashboard: ImageVector? = null
