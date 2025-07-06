package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewDashboardVariant: ImageVector
    get() {
        if (_ViewDashboardVariant != null) {
            return _ViewDashboardVariant!!
        }
        _ViewDashboardVariant = ImageVector.Builder(
            name = "ViewDashboardVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                moveTo(9f, 5f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                moveTo(16f, 5f)
                verticalLineTo(14f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                moveTo(9f, 11f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                moveTo(16f, 15f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _ViewDashboardVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ViewDashboardVariant: ImageVector? = null
