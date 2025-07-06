package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewDashboardOutline: ImageVector
    get() {
        if (_ViewDashboardOutline != null) {
            return _ViewDashboardOutline!!
        }
        _ViewDashboardOutline = ImageVector.Builder(
            name = "ViewDashboardOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(9f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                moveTo(19f, 13f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(9f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                moveTo(21f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(11f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                moveTo(21f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                moveTo(11f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _ViewDashboardOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewDashboardOutline: ImageVector? = null
