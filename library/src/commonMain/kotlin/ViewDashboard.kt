package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewDashboard: ImageVector
    get() {
        if (_ViewDashboard != null) {
            return _ViewDashboard!!
        }
        _ViewDashboard = ImageVector.Builder(
            name = "ViewDashboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(13f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                moveTo(3f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                moveTo(3f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _ViewDashboard!!
    }

@Suppress("ObjectPropertyName")
private var _ViewDashboard: ImageVector? = null
