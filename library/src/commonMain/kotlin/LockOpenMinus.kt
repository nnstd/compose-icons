package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockOpenMinus: ImageVector
    get() {
        if (_LockOpenMinus != null) {
            return _LockOpenMinus!!
        }
        _LockOpenMinus = ImageVector.Builder(
            name = "LockOpenMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
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
                curveTo(13.3f, 21.12f, 13f, 20.1f, 13f, 19f)
                curveTo(13f, 15.69f, 15.69f, 13f, 19f, 13f)
                moveTo(12f, 17f)
                curveTo(10.9f, 17f, 10f, 16.11f, 10f, 15f)
                reflectiveCurveTo(10.9f, 13f, 12f, 13f)
                reflectiveCurveTo(14f, 13.9f, 14f, 15f)
                reflectiveCurveTo(13.11f, 17f, 12f, 17f)
                moveTo(23f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _LockOpenMinus!!
    }

@Suppress("ObjectPropertyName")
private var _LockOpenMinus: ImageVector? = null
