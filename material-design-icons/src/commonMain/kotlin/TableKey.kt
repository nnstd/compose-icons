package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableKey: ImageVector
    get() {
        if (_TableKey != null) {
            return _TableKey!!
        }
        _TableKey = ImageVector.Builder(
            name = "TableKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.8f, 17f)
                curveTo(16.4f, 15.8f, 15.3f, 15f, 14f, 15f)
                curveTo(12.3f, 15f, 11f, 16.3f, 11f, 18f)
                reflectiveCurveTo(12.3f, 21f, 14f, 21f)
                curveTo(15.3f, 21f, 16.4f, 20.2f, 16.8f, 19f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(16.8f)
                moveTo(14f, 19f)
                curveTo(13.4f, 19f, 13f, 18.5f, 13f, 18f)
                reflectiveCurveTo(13.4f, 17f, 14f, 17f)
                reflectiveCurveTo(15f, 17.5f, 15f, 18f)
                reflectiveCurveTo(14.6f, 19f, 14f, 19f)
                moveTo(9f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                curveTo(10.9f, 13.8f, 12.4f, 13f, 14f, 13f)
                curveTo(15.1f, 13f, 16.1f, 13.4f, 17f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                curveTo(20f, 4.9f, 19.1f, 4f, 18f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(9.4f)
                curveTo(9.1f, 19.4f, 9f, 18.7f, 9f, 18f)
                moveTo(12f, 8f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                moveTo(4f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _TableKey!!
    }

@Suppress("ObjectPropertyName")
private var _TableKey: ImageVector? = null
