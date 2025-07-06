package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountKey: ImageVector
    get() {
        if (_AccountKey != null) {
            return _AccountKey!!
        }
        _AccountKey = ImageVector.Builder(
            name = "AccountKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(5.8f)
                curveTo(5.4f, 13.2f, 4.3f, 14f, 3f, 14f)
                curveTo(1.3f, 14f, 0f, 12.7f, 0f, 11f)
                reflectiveCurveTo(1.3f, 8f, 3f, 8f)
                curveTo(4.3f, 8f, 5.4f, 8.8f, 5.8f, 10f)
                horizontalLineTo(11f)
                moveTo(3f, 10f)
                curveTo(2.4f, 10f, 2f, 10.4f, 2f, 11f)
                reflectiveCurveTo(2.4f, 12f, 3f, 12f)
                reflectiveCurveTo(4f, 11.6f, 4f, 11f)
                reflectiveCurveTo(3.6f, 10f, 3f, 10f)
                moveTo(16f, 14f)
                curveTo(18.7f, 14f, 24f, 15.3f, 24f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                curveTo(8f, 15.3f, 13.3f, 14f, 16f, 14f)
                moveTo(16f, 12f)
                curveTo(13.8f, 12f, 12f, 10.2f, 12f, 8f)
                reflectiveCurveTo(13.8f, 4f, 16f, 4f)
                reflectiveCurveTo(20f, 5.8f, 20f, 8f)
                reflectiveCurveTo(18.2f, 12f, 16f, 12f)
                close()
            }
        }.build()

        return _AccountKey!!
    }

@Suppress("ObjectPropertyName")
private var _AccountKey: ImageVector? = null
