package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockRemoveOutline: ImageVector
    get() {
        if (_LockRemoveOutline != null) {
            return _LockRemoveOutline!!
        }
        _LockRemoveOutline = ImageVector.Builder(
            name = "LockRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 15f)
                curveTo(14f, 16.11f, 13.11f, 17f, 12f, 17f)
                curveTo(10.89f, 17f, 10f, 16.1f, 10f, 15f)
                curveTo(10f, 13.89f, 10.89f, 13f, 12f, 13f)
                curveTo(13.11f, 13f, 14f, 13.9f, 14f, 15f)
                moveTo(13.09f, 20f)
                curveTo(13.21f, 20.72f, 13.46f, 21.39f, 13.81f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(10f)
                curveTo(4f, 8.89f, 4.89f, 8f, 6f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                curveTo(7f, 3.24f, 9.24f, 1f, 12f, 1f)
                reflectiveCurveTo(17f, 3.24f, 17f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                curveTo(19.11f, 8f, 20f, 8.9f, 20f, 10f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13f, 19f, 13f)
                curveTo(18.66f, 13f, 18.33f, 13.04f, 18f, 13.09f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(13.09f)
                moveTo(9f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                curveTo(15f, 4.34f, 13.66f, 3f, 12f, 3f)
                reflectiveCurveTo(9f, 4.34f, 9f, 6f)
                verticalLineTo(8f)
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }.build()

        return _LockRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LockRemoveOutline: ImageVector? = null
