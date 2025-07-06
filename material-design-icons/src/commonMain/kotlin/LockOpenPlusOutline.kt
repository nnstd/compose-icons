package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockOpenPlusOutline: ImageVector
    get() {
        if (_LockOpenPlusOutline != null) {
            return _LockOpenPlusOutline!!
        }
        _LockOpenPlusOutline = ImageVector.Builder(
            name = "LockOpenPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 15f)
                curveTo(14f, 16.11f, 13.11f, 17f, 12f, 17f)
                reflectiveCurveTo(10f, 16.11f, 10f, 15f)
                reflectiveCurveTo(10.9f, 13f, 12f, 13f)
                reflectiveCurveTo(14f, 13.9f, 14f, 15f)
                moveTo(6f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(13.09f)
                curveTo(18.33f, 13.04f, 18.66f, 13f, 19f, 13f)
                curveTo(19.34f, 13f, 19.67f, 13.04f, 20f, 13.09f)
                verticalLineTo(10f)
                curveTo(20f, 8.9f, 19.11f, 8f, 18f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                curveTo(17f, 3.24f, 14.76f, 1f, 12f, 1f)
                reflectiveCurveTo(7f, 3.24f, 7f, 6f)
                horizontalLineTo(9f)
                curveTo(9f, 4.34f, 10.34f, 3f, 12f, 3f)
                reflectiveCurveTo(15f, 4.34f, 15f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                curveTo(4.89f, 8f, 4f, 8.9f, 4f, 10f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(13.81f)
                curveTo(13.46f, 21.39f, 13.22f, 20.72f, 13.09f, 20f)
                horizontalLineTo(6f)
                moveTo(20f, 18f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _LockOpenPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LockOpenPlusOutline: ImageVector? = null
