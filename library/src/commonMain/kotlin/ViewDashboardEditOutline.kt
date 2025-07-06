package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewDashboardEditOutline: ImageVector
    get() {
        if (_ViewDashboardEditOutline != null) {
            return _ViewDashboardEditOutline!!
        }
        _ViewDashboardEditOutline = ImageVector.Builder(
            name = "ViewDashboardEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13.1f)
                curveTo(20.9f, 13.1f, 20.7f, 13.2f, 20.6f, 13.3f)
                lineTo(19.6f, 14.3f)
                lineTo(21.7f, 16.4f)
                lineTo(22.7f, 15.4f)
                curveTo(22.9f, 15.2f, 22.9f, 14.8f, 22.7f, 14.6f)
                lineTo(21.4f, 13.3f)
                curveTo(21.3f, 13.2f, 21.2f, 13.1f, 21f, 13.1f)
                moveTo(19.1f, 14.9f)
                lineTo(13f, 20.9f)
                verticalLineTo(23f)
                horizontalLineTo(15.1f)
                lineTo(21.2f, 16.9f)
                lineTo(19.1f, 14.9f)
                moveTo(21f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(19f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(13f, 18.06f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(11.1f)
                curveTo(20.24f, 11.1f, 19.57f, 11.5f, 19.19f, 11.89f)
                lineTo(18.07f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(16.07f)
                lineTo(13f, 18.06f)
                moveTo(11f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                moveTo(9f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                moveTo(11f, 20.06f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(20.06f)
                moveTo(9f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ViewDashboardEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewDashboardEditOutline: ImageVector? = null
