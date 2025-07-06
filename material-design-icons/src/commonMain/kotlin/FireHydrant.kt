package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FireHydrant: ImageVector
    get() {
        if (_FireHydrant != null) {
            return _FireHydrant!!
        }
        _FireHydrant = ImageVector.Builder(
            name = "FireHydrant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 15f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                moveTo(19f, 12f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                moveTo(18f, 6f)
                horizontalLineTo(15.86f)
                curveTo(15.5f, 4.6f, 14.4f, 3.5f, 13f, 3.14f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
                verticalLineTo(3.14f)
                curveTo(9.6f, 3.5f, 8.5f, 4.6f, 8.14f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                moveTo(18f, 22f)
                horizontalLineTo(6f)
                curveTo(6f, 20.9f, 6.9f, 20f, 8f, 20f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                curveTo(17.11f, 20f, 18f, 20.9f, 18f, 22f)
                moveTo(10f, 13f)
                curveTo(10f, 14.11f, 10.9f, 15f, 12f, 15f)
                reflectiveCurveTo(14f, 14.11f, 14f, 13f)
                reflectiveCurveTo(13.11f, 11f, 12f, 11f)
                reflectiveCurveTo(10f, 11.9f, 10f, 13f)
                close()
            }
        }.build()

        return _FireHydrant!!
    }

@Suppress("ObjectPropertyName")
private var _FireHydrant: ImageVector? = null
