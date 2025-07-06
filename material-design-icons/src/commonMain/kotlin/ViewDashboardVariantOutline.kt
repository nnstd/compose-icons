package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewDashboardVariantOutline: ImageVector
    get() {
        if (_ViewDashboardVariantOutline != null) {
            return _ViewDashboardVariantOutline!!
        }
        _ViewDashboardVariantOutline = ImageVector.Builder(
            name = "ViewDashboardVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                moveTo(20f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                moveTo(14f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                moveTo(10f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                moveTo(4f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                moveTo(16f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _ViewDashboardVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewDashboardVariantOutline: ImageVector? = null
