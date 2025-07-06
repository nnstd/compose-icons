package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountKeyOutline: ImageVector
    get() {
        if (_AccountKeyOutline != null) {
            return _AccountKeyOutline!!
        }
        _AccountKeyOutline = ImageVector.Builder(
            name = "AccountKeyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.8f, 10f)
                curveTo(5.4f, 8.8f, 4.3f, 8f, 3f, 8f)
                curveTo(1.3f, 8f, 0f, 9.3f, 0f, 11f)
                reflectiveCurveTo(1.3f, 14f, 3f, 14f)
                curveTo(4.3f, 14f, 5.4f, 13.2f, 5.8f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(5.8f)
                moveTo(3f, 12f)
                curveTo(2.4f, 12f, 2f, 11.6f, 2f, 11f)
                reflectiveCurveTo(2.4f, 10f, 3f, 10f)
                reflectiveCurveTo(4f, 10.4f, 4f, 11f)
                reflectiveCurveTo(3.6f, 12f, 3f, 12f)
                moveTo(16f, 4f)
                curveTo(13.8f, 4f, 12f, 5.8f, 12f, 8f)
                reflectiveCurveTo(13.8f, 12f, 16f, 12f)
                reflectiveCurveTo(20f, 10.2f, 20f, 8f)
                reflectiveCurveTo(18.2f, 4f, 16f, 4f)
                moveTo(16f, 10.1f)
                curveTo(14.8f, 10.1f, 13.9f, 9.2f, 13.9f, 8f)
                curveTo(13.9f, 6.8f, 14.8f, 5.9f, 16f, 5.9f)
                curveTo(17.2f, 5.9f, 18.1f, 6.8f, 18.1f, 8f)
                reflectiveCurveTo(17.2f, 10.1f, 16f, 10.1f)
                moveTo(16f, 13f)
                curveTo(13.3f, 13f, 8f, 14.3f, 8f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(24f)
                verticalLineTo(17f)
                curveTo(24f, 14.3f, 18.7f, 13f, 16f, 13f)
                moveTo(22.1f, 18.1f)
                horizontalLineTo(9.9f)
                verticalLineTo(17f)
                curveTo(9.9f, 16.4f, 13f, 14.9f, 16f, 14.9f)
                curveTo(19f, 14.9f, 22.1f, 16.4f, 22.1f, 17f)
                verticalLineTo(18.1f)
                close()
            }
        }.build()

        return _AccountKeyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountKeyOutline: ImageVector? = null
