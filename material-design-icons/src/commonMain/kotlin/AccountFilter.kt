package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountFilter: ImageVector
    get() {
        if (_AccountFilter != null) {
            return _AccountFilter!!
        }
        _AccountFilter = ImageVector.Builder(
            name = "AccountFilter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                curveTo(12.2f, 4f, 14f, 5.8f, 14f, 8f)
                reflectiveCurveTo(12.2f, 12f, 10f, 12f)
                reflectiveCurveTo(6f, 10.2f, 6f, 8f)
                reflectiveCurveTo(7.8f, 4f, 10f, 4f)
                moveTo(17f, 21f)
                lineTo(18.8f, 22.77f)
                curveTo(19.3f, 23.27f, 20f, 22.87f, 20f, 22.28f)
                verticalLineTo(18f)
                lineTo(22.8f, 14.6f)
                curveTo(23.3f, 13.9f, 22.8f, 13f, 22f, 13f)
                horizontalLineTo(15f)
                curveTo(14.2f, 13f, 13.7f, 14f, 14.2f, 14.6f)
                lineTo(17f, 18f)
                verticalLineTo(21f)
                moveTo(15f, 18.7f)
                lineTo(12.7f, 15.9f)
                curveTo(12.3f, 15.4f, 12.1f, 14.8f, 12.1f, 14.2f)
                curveTo(11.4f, 14f, 10.7f, 14f, 10f, 14f)
                curveTo(5.6f, 14f, 2f, 15.8f, 2f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18.7f)
                close()
            }
        }.build()

        return _AccountFilter!!
    }

@Suppress("ObjectPropertyName")
private var _AccountFilter: ImageVector? = null
